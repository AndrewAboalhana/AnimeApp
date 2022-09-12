package com.example.testformainproject.manga;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MangaItem{

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("publishing_start")
	private String publishingStart;

	@SerializedName("volumes")
	private int volumes;

	@SerializedName("mal_id")
	private int malId;

	@SerializedName("synopsis")
	private String synopsis;

	@SerializedName("explicit_genres")
	private List<Object> explicitGenres;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private Object type;

	@SerializedName("url")
	private String url;

	@SerializedName("serialization")
	private List<Object> serialization;

	@SerializedName("themes")
	private List<ThemesItem> themes;

	@SerializedName("score")
	private double score;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("members")
	private int members;

	@SerializedName("demographics")
	private List<DemographicsItem> demographics;

	@SerializedName("authors")
	private List<Object> authors;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setPublishingStart(String publishingStart){
		this.publishingStart = publishingStart;
	}

	public String getPublishingStart(){
		return publishingStart;
	}

	public void setVolumes(int volumes){
		this.volumes = volumes;
	}

	public int getVolumes(){
		return volumes;
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

	public void setExplicitGenres(List<Object> explicitGenres){
		this.explicitGenres = explicitGenres;
	}

	public List<Object> getExplicitGenres(){
		return explicitGenres;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setSerialization(List<Object> serialization){
		this.serialization = serialization;
	}

	public List<Object> getSerialization(){
		return serialization;
	}

	public void setThemes(List<ThemesItem> themes){
		this.themes = themes;
	}

	public List<ThemesItem> getThemes(){
		return themes;
	}

	public void setScore(double score){
		this.score = score;
	}

	public double getScore(){
		return score;
	}

	public void setGenres(List<GenresItem> genres){
		this.genres = genres;
	}

	public List<GenresItem> getGenres(){
		return genres;
	}

	public void setMembers(int members){
		this.members = members;
	}

	public int getMembers(){
		return members;
	}

	public void setDemographics(List<DemographicsItem> demographics){
		this.demographics = demographics;
	}

	public List<DemographicsItem> getDemographics(){
		return demographics;
	}

	public void setAuthors(List<Object> authors){
		this.authors = authors;
	}

	public List<Object> getAuthors(){
		return authors;
	}
}