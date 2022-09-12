package com.example.testformainproject.manga;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MangaResponse{

	@SerializedName("API_DEPRECATION_DATE")
	private String aPIDEPRECATIONDATE;

	@SerializedName("API_DEPRECATION")
	private boolean aPIDEPRECATION;

	@SerializedName("request_hash")
	private String requestHash;

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("request_cached")
	private boolean requestCached;

	@SerializedName("manga")
	private List<MangaItem> manga;

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

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setRequestCached(boolean requestCached){
		this.requestCached = requestCached;
	}

	public boolean isRequestCached(){
		return requestCached;
	}

	public void setManga(List<MangaItem> manga){
		this.manga = manga;
	}

	public List<MangaItem> getManga(){
		return manga;
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