package com.diary.client;

import com.diary.client.mapper.DiaryActivityMapper;
import com.diary.client.mapper.DiaryPlaceHistoryMapper;
import com.diary.client.place.DiaryPlace;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class DiaryEntry implements EntryPoint {

	private Place defaultPlace = new DiaryPlace();
	private SimplePanel appWidget = new SimplePanel();
	
	@SuppressWarnings("deprecation")
	@Override
	public void onModuleLoad() {
		ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		
		// Start ActivityManager for the main widget with  ActivityMapper
		ActivityMapper activityMapper = new DiaryActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(appWidget);
		
		// Start PlaceHistoryHandler with  PlaceHistoryMapper
		DiaryPlaceHistoryMapper historyMapper = GWT.create(DiaryPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);
		
		RootPanel.get().add(appWidget);
		historyHandler.handleCurrentHistory();
	}

}
