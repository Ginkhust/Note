package com.diary.client.view;

import java.util.Date;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface DiaryView extends IsWidget{
	public Date dateCreated();
	void setPresenter(Presenter listener);
	
	public interface Presenter {
		void goTo(Place place);
	}
}
