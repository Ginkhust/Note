package com.diary.client.activity;

import com.diary.client.ClientFactory;
import com.diary.client.view.DiaryView;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class DiaryActivity extends AbstractActivity implements DiaryView.Presenter {

	ClientFactory clientFactory;
	
	public DiaryActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		DiaryView diaryView = clientFactory.getDiaryView();
		diaryView.setPresenter(this);
		panel.setWidget(diaryView.asWidget());

	}
	@Override
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}

}
