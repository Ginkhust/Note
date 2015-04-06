package com.diary.client;

import com.diary.shared.Note;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DiaryServiceAsync {
	void getNote(String title, String content, AsyncCallback<Note> callback);
}
