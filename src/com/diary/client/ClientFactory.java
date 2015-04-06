package com.diary.client;

import com.diary.client.view.DiaryView;
import com.diary.client.view.LoginView;
import com.diary.client.view.RegistrationView;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {
	EventBus getEventBus();
	PlaceController getPlaceController();
	DiaryView getDiaryView();
	LoginView getLoginView();
	RegistrationView getRegistrationView();
}
