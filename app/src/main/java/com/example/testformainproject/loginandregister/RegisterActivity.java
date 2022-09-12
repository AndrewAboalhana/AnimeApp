package com.example.testformainproject.loginandregister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.testformainproject.R;
import com.example.testformainproject.databinding.ActivityLoginBinding;
import com.example.testformainproject.databinding.ActivityRegisterBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
         ActivityRegisterBinding binding;
         FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
         FirebaseFirestore firestore=FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Register");
        binding= ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(view -> getDataFromUi());
    }

    private void getDataFromUi() {

        String email= binding.etRegisterEmail.getText().toString();

        if(email.isEmpty()){
            Toast.makeText(this, "Email Required", Toast.LENGTH_SHORT).show();
            return;
        }

        String password= binding.etRegisterPassword.getText().toString();

        if(password.isEmpty()){
            Toast.makeText(this, "Password Required", Toast.LENGTH_SHORT).show();
            return;
        }
        String name=binding.registerName.getText().toString();
        if (name.isEmpty()){
            Toast.makeText(this, "Name Required", Toast.LENGTH_SHORT).show();
            return;
        }

        createNewAccount(email,password);

    }

    private void createNewAccount(String email, String password) {

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(RegisterActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
                        addUserToFirestore(authResult.getUser());


                    }


                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(RegisterActivity.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }

                });

    }
    private void addUserToFirestore(FirebaseUser user) {
        HashMap<String,Object> userData= new HashMap<>();
        String email= binding.etRegisterEmail.getText().toString();
        String password= binding.etRegisterPassword.getText().toString();
        String name= binding.registerName.getText().toString();
        userData.put("email",email);
        userData.put("password",password);
        userData.put("username",name);
        System.out.println("hello");

        firestore.collection("applicationUsers")
                .document(user.getUid())
                .set(userData)
                .addOnSuccessListener(runnable -> {
                    Toast.makeText(RegisterActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
                    System.out.println("SUCCESS");
                     finish();
                     firebaseAuth.signOut();

                })
                .addOnFailureListener(exception -> {
                    System.out.println("EEE => " + exception.getLocalizedMessage());
                    Log.e("EEE", "addUserToFirestore: ", exception );
                    Toast.makeText(RegisterActivity.this, exception.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                });

    }


}