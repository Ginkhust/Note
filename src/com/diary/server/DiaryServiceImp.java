package com.diary.server;

import static com.googlecode.objectify.ObjectifyService.ofy;

import com.diary.client.DiaryService;
import com.diary.shared.Note;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.ObjectifyService;

public class DiaryServiceImp extends RemoteServiceServlet implements DiaryService {

	private static final long serialVersionUID = 1L;
	
	static {
		ObjectifyService.register(Note.class);
	}
	
	@Override
	public Note getNote(String title, String content) {
		Note note = new Note(title, content);
		ofy().save().entity(note).now();
		return note;
	}

	
}
