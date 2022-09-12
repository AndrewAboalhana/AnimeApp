package com.example.testformainproject.loginandregister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testformainproject.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetActivity extends AppCompatActivity {
FirebaseAuth auth=FirebaseAuth.getInstance();
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        getSupportActionBar().setTitle("OOPS !! (reset it)");
        editText=findViewById(R.id.etForgetEmail);
    }


    public void forgetPassword(View view) {
            String email= editText.getText().toString();
            if(email.isEmpty()){
                Toast.makeText(this, "Email required", Toast.LENGTH_SHORT).show();
                return;
            }
            auth.sendPasswordResetEmail(email)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Log.d("ForgetActivity", "Email sent.");
                                Toast.makeText(getApplicationContext(), "Check Your Email", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(ForgetActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

    }
}