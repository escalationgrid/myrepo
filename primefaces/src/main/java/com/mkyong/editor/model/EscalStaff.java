package com.mkyong.editor.model;

import java.util.Date;


public class EscalStaff implements java.io.Serializable {

	private EscalStaffId id;
	private Grids grids;
	private Staff staff;
	private Date dtex;

	public EscalStaff() {
	}

	public EscalStaff(EscalStaffId id, Grids grids, Staff staff) {
		this.id = id;
		this.grids = grids;
		this.staff = staff;
	}

	public EscalStaff(EscalStaffId id, Grids grids, Staff staff, Date dtex) {
		this.id = id;
		this.grids = grids;
		this.staff = staff;
		this.dtex = dtex;
	}

	
	public EscalStaffId getId() {
		return this.id;
	}

	public void setId(EscalStaffId id) {
		this.id = id;
	}

	public Grids getGrids() {
		return this.grids;
	}

	public void setGrids(Grids grids) {
		this.grids = grids;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Date getDtex() {
		return this.dtex;
	}

	public void setDtex(Date dtex) {
		this.dtex = dtex;
	}

}
