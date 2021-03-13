package com.freshvotes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
	
	private CommnentId pk;
	private String text;
	
	@Column(length=5000)
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@EmbeddedId
	public CommnentId getPk() {
		return pk;
	}
	public void setPk(CommnentId pk) {
		this.pk = pk;
	}
}
