package com.diary.client.view;

import java.util.Date;

import org.gwtbootstrap3.client.ui.AnchorListItem;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.PanelBody;
import org.gwtbootstrap3.client.ui.PanelHeader;
import org.gwtbootstrap3.client.ui.TextBox;

import com.diary.client.place.DiaryPlace;
import com.diary.client.place.LoginPlace;
import com.diary.client.place.RegistrationPlace;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class DiaryViewImpl extends Composite implements DiaryView {

	private static DiaryViewImplUiBinder uiBinder = GWT
			.create(DiaryViewImplUiBinder.class);

	interface DiaryViewImplUiBinder extends UiBinder<Widget, DiaryViewImpl> {
	}

	public DiaryViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Date dateCreated() {
		return null;
	}

	private Presenter presenter;
	String name;
	@UiField
	AnchorListItem registerPage;
	@UiField
	AnchorListItem loginPage;
	@UiField
	AnchorListItem home;

	@UiField
	PanelHeader panelHeader;
	@UiField
	PanelBody panelBody;
	@UiField
	TextBox titleBox;
	@UiField
	TextArea contentBox;
	@UiField
	Button addNotes;
	@UiField
	Button clearNotes;

	@Override
	public void setPresenter(Presenter listener) {
		this.presenter = listener;
	}

	@UiHandler("registerPage")
	void handleClick(ClickEvent event) {
		presenter.goTo(new RegistrationPlace());
	}

	@UiHandler("loginPage")
	void onClickLogin(ClickEvent event) {
		presenter.goTo(new LoginPlace());
	}

	@UiHandler("home")
	void onClickHome(ClickEvent event) {
		presenter.goTo(new DiaryPlace());
	}

	@UiHandler("addNotes")
	void onClickAddNotes(ClickEvent event) {
		String title = titleBox.getText();
		String content = contentBox.getText();
	}

	@UiHandler("clearNotes")
	void onClickClearNotes(ClickEvent event) {
		titleBox.clear();
		contentBox.setText("");
	}
}
