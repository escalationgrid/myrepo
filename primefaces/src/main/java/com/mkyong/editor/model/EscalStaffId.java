package com.mkyong.editor.model;

public class EscalStaffId implements java.io.Serializable {

	private String gridId;
	private String staffId;

	public EscalStaffId() {
	}

	public EscalStaffId(String gridId, String staffId) {
		this.gridId = gridId;
		this.staffId = staffId;
	}

	public String getGridId() {
		return this.gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EscalStaffId))
			return false;
		EscalStaffId castOther = (EscalStaffId) other;

		return ((this.getGridId() == castOther.getGridId()) || (this.getGridId() != null
				&& castOther.getGridId() != null && this.getGridId().equals(castOther.getGridId())))
				&& ((this.getStaffId() == castOther.getStaffId()) || (this.getStaffId() != null
						&& castOther.getStaffId() != null && this.getStaffId().equals(castOther.getStaffId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGridId() == null ? 0 : this.getGridId().hashCode());
		result = 37 * result + (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		return result;
	}

}
