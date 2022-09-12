package com.example.testformainproject.search;

import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("end_date")
	private String endDate;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("mal_id")
	private int malId;

	@SerializedName("synopsis")
	private String synopsis;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("rated")
	private String rated;

	@SerializedName("score")
	private double score;

	@SerializedName("members")
	private int members;

	@SerializedName("airing")
	private boolean airing;

	@SerializedName("episodes")
	private int episodes;

	@SerializedName("start_date")
	private String startDate;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setMalId(int malId){
		this.malId = malId;
	}

	public int getMalId(){
		return malId;
	}

	public void setSynopsis(String synopsis){
		this.synopsis = synopsis;
	}

	public String getSynopsis(){
		return synopsis;
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

	public void setRated(String rated){
		this.rated = rated;
	}

	public String getRated(){
		return rated;
	}

	public void setScore(double score){
		this.score = score;
	}

	public double getScore(){
		return score;
	}

	public void setMembers(int members){
		this.members = members;
	}

	public int getMembers(){
		return members;
	}

	public void setAiring(boolean airing){
		this.airing = airing;
	}

	public boolean isAiring(){
		return airing;
	}

	public void setEpisodes(int episodes){
		this.episodes = episodes;
	}

	public int getEpisodes(){
		return episodes;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}
}