package com.diary.client.activity;

import com.diary.client.ClientFactory;
import com.diary.client.view.LoginView;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class LoginActivity extends AbstractActivity implements LoginView.Presenter {

	ClientFactory clientFactory;
	
	public LoginActivity(ClientFactory client) {
		this.clientFactory = client;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		LoginView loginView = clientFactory.getLoginView();
		loginView.setPresenter(this);
		panel.setWidget(loginView.asWidget());
	}

	@Override
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);;
	}

}
