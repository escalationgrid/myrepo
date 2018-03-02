package com.mkyong.editor.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Staff implements java.io.Serializable {

	private static final long serialVersionUID = -4369075410267496743L;
	private String staffId;
	private String name;
	private String area;
	private String phone;
	private String email;
	private Boolean ativado;
	private Date dtex;
	private String visibility;
	private Set<EscalStaff> escalStaffs = new HashSet<EscalStaff>(0);

	public Staff() {
	}

	public Staff(String staffId) {
		this.staffId = staffId;
	}

	public Staff(String staffId, String name, String area, String phone, String email, Boolean ativado, Date dtex, String visibility,
			Set<EscalStaff> escalStaffs) {
		this.staffId = staffId;
		this.name = name;
		this.area = area;
		this.phone = phone;
		this.email = email;
		this.ativado = ativado;
		this.dtex = dtex;
		this.visibility = visibility;
		this.escalStaffs = escalStaffs;
	}


	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}
	
	public Boolean getAtivado() {
		return this.ativado;
	}

	public void setAtivado(Boolean ativado) {
		this.ativado = ativado;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtex() {
		return this.dtex;
	}

	public void setDtex(Date dtex) {
		this.dtex = dtex;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	public Set<EscalStaff> getEscalStaffs() {
		return this.escalStaffs;
	}

	public void setEscalStaffs(Set<EscalStaff> escalStaffs) {
		this.escalStaffs = escalStaffs;
	}
	
	@Override
	public String toString() {
		return this.staffId;
	}

}
