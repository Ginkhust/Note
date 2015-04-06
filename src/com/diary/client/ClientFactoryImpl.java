package com.diary.client;

import com.diary.client.view.DiaryView;
import com.diary.client.view.DiaryViewImpl;
import com.diary.client.view.LoginView;
import com.diary.client.view.LoginViewImpl;
import com.diary.client.view.RegistrationView;
import com.diary.client.view.RegistrationViewImpl;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

public class ClientFactoryImpl implements ClientFactory {

	private static final EventBus eventBus = new SimpleEventBus();;
	@SuppressWarnings("deprecation")
	private static final PlaceController placeController = new PlaceController(eventBus);;
	private static final DiaryView diaryView = new DiaryViewImpl();
	private static final LoginView loginView = new LoginViewImpl();
	private static final RegistrationView registerView = new RegistrationViewImpl();

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public DiaryView getDiaryView() {
		return diaryView;
	}

	@Override
	public LoginView getLoginView() {
		return loginView;
	}

	@Override
	public RegistrationView getRegistrationView() {
		return registerView;
	}

}
