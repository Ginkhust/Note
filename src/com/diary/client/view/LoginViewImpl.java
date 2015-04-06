package com.diary.client.view;

import org.gwtbootstrap3.client.ui.AnchorListItem;

import com.diary.client.place.DiaryPlace;
import com.diary.client.place.RegistrationPlace;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LoginViewImpl extends Composite implements LoginView {

	private static LoginViewImplUiBinder uiBinder = GWT
			.create(LoginViewImplUiBinder.class);

	interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {
	}

	public LoginViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	Presenter presenter;
	@UiField
	AnchorListItem home;
	
	@UiField
	AnchorListItem registerPage;
	
	
	@Override
	public void setPresenter(Presenter listener) {
		presenter = listener;
	}
	
	@UiHandler("home")
	void clickHomePage(ClickEvent e) {
		presenter.goTo(new DiaryPlace());
	}
	
	@UiHandler("registerPage") 
	void clickRegisterPage(ClickEvent e) {
		presenter.goTo(new RegistrationPlace());
	}
}
