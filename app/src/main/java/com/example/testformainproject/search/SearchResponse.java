package com.example.testformainproject.search;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SearchResponse{

	@SerializedName("API_DEPRECATION_DATE")
	private String aPIDEPRECATIONDATE;

	@SerializedName("API_DEPRECATION")
	private boolean aPIDEPRECATION;

	@SerializedName("request_hash")
	private String requestHash;

	@SerializedName("last_page")
	private int lastPage;

	@SerializedName("request_cached")
	private boolean requestCached;

	@SerializedName("request_cache_expiry")
	private int requestCacheExpiry;

	@SerializedName("API_DEPRECATION_INFO")
	private String aPIDEPRECATIONINFO;

	@SerializedName("results")
	private List<ResultsItem> results;

	public void setAPIDEPRECATIONDATE(String aPIDEPRECATIONDATE){
		this.aPIDEPRECATIONDATE = aPIDEPRECATIONDATE;
	}

	public String getAPIDEPRECATIONDATE(){
		return aPIDEPRECATIONDATE;
	}

	public void setAPIDEPRECATION(boolean aPIDEPRECATION){
		this.aPIDEPRECATION = aPIDEPRECATION;
	}

	public boolean isAPIDEPRECATION(){
		return aPIDEPRECATION;
	}

	public void setRequestHash(String requestHash){
		this.requestHash = requestHash;
	}

	public String getRequestHash(){
		return requestHash;
	}

	public void setLastPage(int lastPage){
		this.lastPage = lastPage;
	}

	public int getLastPage(){
		return lastPage;
	}

	public void setRequestCached(boolean requestCached){
		this.requestCached = requestCached;
	}

	public boolean isRequestCached(){
		return requestCached;
	}

	public void setRequestCacheExpiry(int requestCacheExpiry){
		this.requestCacheExpiry = requestCacheExpiry;
	}

	public int getRequestCacheExpiry(){
		return requestCacheExpiry;
	}

	public void setAPIDEPRECATIONINFO(String aPIDEPRECATIONINFO){
		this.aPIDEPRECATIONINFO = aPIDEPRECATIONINFO;
	}

	public String getAPIDEPRECATIONINFO(){
		return aPIDEPRECATIONINFO;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}