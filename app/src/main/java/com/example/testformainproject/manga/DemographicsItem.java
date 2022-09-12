package com.example.testformainproject.manga;

import com.google.gson.annotations.SerializedName;

public class DemographicsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("mal_id")
	private int malId;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMalId(int malId){
		this.malId = malId;
	}

	public int getMalId(){
		return malId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}