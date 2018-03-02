package com.mkyong.editor.model;

public class SectorsId implements java.io.Serializable {

	private short level;
	private String secId;

	public SectorsId() {
	}

	public SectorsId(short level, String secId) {
		this.level = level;
		this.secId = secId;
	}

	public short getLevel() {
		return this.level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public String getSecId() {
		return this.secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SectorsId))
			return false;
		SectorsId castOther = (SectorsId) other;

		return (this.getLevel() == castOther.getLevel())
				&& ((this.getSecId() == castOther.getSecId()) || (this.getSecId() != null
						&& castOther.getSecId() != null && this.getSecId().equals(castOther.getSecId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLevel();
		result = 37 * result + (getSecId() == null ? 0 : this.getSecId().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "SectorsId [level=" + level + ", secId=" + secId + "]";
	}

}
