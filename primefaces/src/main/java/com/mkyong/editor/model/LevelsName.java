package com.mkyong.editor.model;

public class LevelsName implements java.io.Serializable {

	private short level;
	private String name;

	public LevelsName() {
	}

	public LevelsName(short level) {
		this.level = level;
	}

	public LevelsName(short level, String name) {
		this.level = level;
		this.name = name;
	}


	public short getLevel() {
		return this.level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
