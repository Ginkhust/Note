package com.diary.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class RegistrationPlace extends Place {
	String token = "register";

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public static class Tokenizer implements PlaceTokenizer<RegistrationPlace> {

		@Override
		public RegistrationPlace getPlace(String token) {
			return new RegistrationPlace();
		}

		@Override
		public String getToken(RegistrationPlace place) {
			return place.getToken();
		}
		
	}
}
