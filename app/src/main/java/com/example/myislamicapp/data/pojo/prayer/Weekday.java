package com.example.myislamicapp.data.pojo.prayer;

import com.google.gson.annotations.SerializedName;

public class Weekday{

	@SerializedName("en")
	private String en;

	@SerializedName("ar")
	private String ar;

	public String getEn(){
		return en;
	}

	public String getAr(){
		return ar;
	}
}