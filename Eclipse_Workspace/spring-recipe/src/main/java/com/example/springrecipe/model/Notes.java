package com.example.springrecipe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String imp_note;
	private int notes_id;

	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notes(String imp_note, int notes_id) {
		super();
		this.imp_note = imp_note;
		this.notes_id = notes_id;
	}

}
