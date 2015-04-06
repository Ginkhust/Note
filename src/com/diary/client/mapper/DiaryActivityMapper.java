package com.diary.client.mapper;

import com.diary.client.ClientFactory;
import com.diary.client.activity.DiaryActivity;
import com.diary.client.activity.LoginActivity;
import com.diary.client.activity.RegistrationActivity;
import com.diary.client.place.DiaryPlace;
import com.diary.client.place.LoginPlace;
import com.diary.client.place.RegistrationPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class DiaryActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;
	
	public DiaryActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof DiaryPlace) {
			return new DiaryActivity(clientFactory);
		} else if (place instanceof LoginPlace) {
			return new LoginActivity(clientFactory);
		} else if (place instanceof RegistrationPlace) {
			return new RegistrationActivity(clientFactory);
		}
		
		return null;
	}

}
