package com.diary.shared;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Note implements Serializable, IsSerializable {

	private static final long serialVersionUID = 1L;
	@Id private String title;
	private String content;
	
	public Note() {
	}

	public Note(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
