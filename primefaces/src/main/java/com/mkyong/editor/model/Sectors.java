package com.mkyong.editor.model;

public class Sectors implements java.io.Serializable {

	private SectorsId id;
	private String description;

	public Sectors() {
	}

	public Sectors(SectorsId id, String description) {
		this.id = id;
		this.description = description;
	}


	public SectorsId getId() {
		return this.id;
	}

	public void setId(SectorsId id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
