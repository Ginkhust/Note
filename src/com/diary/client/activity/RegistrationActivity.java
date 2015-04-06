package com.diary.client.activity;

import com.diary.client.ClientFactory;
import com.diary.client.view.RegistrationView;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class RegistrationActivity extends AbstractActivity implements RegistrationView.Presenter {

	ClientFactory clientFactory;
	
	public RegistrationActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		RegistrationView registerView = clientFactory.getRegistrationView();
		registerView.setPresenter(this);
		panel.setWidget(registerView.asWidget());
	}

	@Override
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}

}
