package com.diary.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface LoginView extends IsWidget{
	void setPresenter(Presenter listener);
	
	public interface Presenter {
		void goTo(Place place);
	}
}
