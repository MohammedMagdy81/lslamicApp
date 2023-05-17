package com.example.myislamicapp.data.pojo.prayer;

import com.google.gson.annotations.SerializedName;

public class Month{

	@SerializedName("number")
	private int number;

	@SerializedName("en")
	private String en;

	@SerializedName("ar")
	private String ar;

	public int getNumber(){
		return number;
	}

	public String getEn(){
		return en;
	}

	public String getAr(){
		return ar;
	}
}