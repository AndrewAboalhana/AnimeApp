package com.example.testformainproject.api;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AnimeResponse{

	@SerializedName("API_DEPRECATION_DATE")
	private String aPIDEPRECATIONDATE;

	@SerializedName("top")
	private List<TopItem> top;

	@SerializedName("API_DEPRECATION")
	private boolean aPIDEPRECATION;

	@SerializedName("request_hash")
	private String requestHash;

	@SerializedName("request_cached")
	private boolean requestCached;

	@SerializedName("request_cache_expiry")
	private int requestCacheExpiry;

	@SerializedName("API_DEPRECATION_INFO")
	private String aPIDEPRECATIONINFO;

	public void setAPIDEPRECATIONDATE(String aPIDEPRECATIONDATE){
		this.aPIDEPRECATIONDATE = aPIDEPRECATIONDATE;
	}

	public String getAPIDEPRECATIONDATE(){
		return aPIDEPRECATIONDATE;
	}

	public void setTop(List<TopItem> top){
		this.top = top;
	}

	public List<TopItem> getTop(){
		return top;
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
}