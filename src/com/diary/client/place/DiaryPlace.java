package com.diary.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class DiaryPlace extends Place {
	String token = "home";

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public static class Tokenizer implements PlaceTokenizer<DiaryPlace> {

		@Override
		public DiaryPlace getPlace(String token) {
			return new DiaryPlace();
		}

		@Override
		public String getToken(DiaryPlace place) {
			return place.getToken();
		}
		
	}
}
