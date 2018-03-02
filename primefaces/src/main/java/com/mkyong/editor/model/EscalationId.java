package com.mkyong.editor.model;

public class EscalationId implements java.io.Serializable {

	private String gridId;
	private String alertGroup;
	private short gridLevel;

	public EscalationId() {
	}

	public EscalationId(String gridId, String alertGroup, short gridLevel) {
		this.gridId = gridId;
		this.alertGroup = alertGroup;
		this.gridLevel = gridLevel;
	}

	public String getGridId() {
		return this.gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getAlertGroup() {
		return this.alertGroup;
	}

	public void setAlertGroup(String alertGroup) {
		this.alertGroup = alertGroup;
	}

	public short getGridLevel() {
		return this.gridLevel;
	}

	public void setGridLevel(short gridLevel) {
		this.gridLevel = gridLevel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EscalationId))
			return false;
		EscalationId castOther = (EscalationId) other;

		return ((this.getGridId() == castOther.getGridId()) || (this.getGridId() != null
				&& castOther.getGridId() != null && this.getGridId().equals(castOther.getGridId())))
				&& ((this.getAlertGroup() == castOther.getAlertGroup()) || (this.getAlertGroup() != null
						&& castOther.getAlertGroup() != null && this.getAlertGroup().equals(castOther.getAlertGroup())))
				&& (this.getGridLevel() == castOther.getGridLevel());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGridId() == null ? 0 : this.getGridId().hashCode());
		result = 37 * result + (getAlertGroup() == null ? 0 : this.getAlertGroup().hashCode());
		result = 37 * result + this.getGridLevel();
		return result;
	}

	@Override
	public String toString() {
		return gridId + "_" + alertGroup + "_" + gridLevel;
	}

	
}
