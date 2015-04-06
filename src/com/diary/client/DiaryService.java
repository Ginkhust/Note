package com.diary.client;

import com.diary.shared.Note;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("note")
public interface DiaryService extends RemoteService {
	public Note getNote(String title, String content);
}
