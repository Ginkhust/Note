package com.diary.client.view;

import org.gwtbootstrap3.client.ui.AnchorListItem;

import com.diary.client.place.DiaryPlace;
import com.diary.client.place.LoginPlace;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RegistrationViewImpl extends Composite implements RegistrationView{

	private static RegistrationViewImplUiBinder uiBinder = GWT
			.create(RegistrationViewImplUiBinder.class);

	interface RegistrationViewImplUiBinder extends
			UiBinder<Widget, RegistrationViewImpl> {
	}

	public RegistrationViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	Presenter presenter;
	@UiField
	AnchorListItem home;
	@UiField
	AnchorListItem loginPage;
	
	@Override
	public void setPresenter(Presenter listener) {
		presenter = listener;
	}
	
	@UiHandler("home") 
	void clickHome(ClickEvent e) {
		presenter.goTo(new DiaryPlace());
	}
	
	@UiHandler("loginPage")
	void clickLogin(ClickEvent e) {
		presenter.goTo(new LoginPlace());
	}

}
