package com.example.testformainproject.api;

import com.google.gson.annotations.SerializedName;

public class TopItem{

	@SerializedName("end_date")
	private String endDate;

	@SerializedName("score")
	private int score;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("members")
	private int members;

	@SerializedName("rank")
	private int rank;

	@SerializedName("mal_id")
	private int malId;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("episodes")
	private Object episodes;

	@SerializedName("start_date")
	private String startDate;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setMembers(int members){
		this.members = members;
	}

	public int getMembers(){
		return members;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setMalId(int malId){
		this.malId = malId;
	}

	public int getMalId(){
		return malId;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
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

	public void setEpisodes(Object episodes){
		this.episodes = episodes;
	}

	public Object getEpisodes(){
		return episodes;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}
}