package com.mkyong.editor.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Grids implements java.io.Serializable {

	private String gridId;
	private String description;
	private Integer hrIni;
	private Integer hrEnd;
	private Date dtex;
	private Boolean wdSunday;
	private Boolean wdMonday;
	private Boolean wdTuesday;
	private Boolean wdWednesday;
	private Boolean wdThursday;
	private Boolean wdFriday;
	private Boolean wdSaturday;
	private String visibility;
	private Set<EscalStaff> gridses = new HashSet<EscalStaff>(0);
	private Set<Escalation> escalations = new HashSet<Escalation>(0);

	public Grids() {
	}

	public Grids(String gridId) {
		this.gridId = gridId;
	}

	public Grids(String gridId, String description, Integer hrIni, Integer hrEnd, Date dtex, Boolean wdSunday,
			Boolean wdMonday, Boolean wdTuesday, Boolean wdWednesday, Boolean wdThursday, Boolean wdFriday,
			Boolean wdSaturday, String visibility, Set<EscalStaff> gridses, Set<Escalation> escalations) {
		this.gridId = gridId;
		this.description = description;
		this.hrIni = hrIni;
		this.hrEnd = hrEnd;
		this.dtex = dtex;
		this.wdSunday = wdSunday;
		this.wdMonday = wdMonday;
		this.wdTuesday = wdTuesday;
		this.wdWednesday = wdWednesday;
		this.wdThursday = wdThursday;
		this.wdFriday = wdFriday;
		this.wdSaturday = wdSaturday;
		this.visibility = visibility;
		this.gridses = gridses;
		this.escalations = escalations;
	}

	public String getGridId() {
		return this.gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getHrIni() {
		return this.hrIni;
	}

	public void setHrIni(Integer hrIni) {
		this.hrIni = hrIni;
	}

	public Integer getHrEnd() {
		return this.hrEnd;
	}

	public void setHrEnd(Integer hrEnd) {
		this.hrEnd = hrEnd;
	}

	public Date getDtex() {
		return this.dtex;
	}

	public void setDtex(Date dtex) {
		this.dtex = dtex;
	}

	public Boolean getWdSunday() {
		return this.wdSunday;
	}

	public void setWdSunday(Boolean wdSunday) {
		this.wdSunday = wdSunday;
	}

	public Boolean getWdMonday() {
		return this.wdMonday;
	}

	public void setWdMonday(Boolean wdMonday) {
		this.wdMonday = wdMonday;
	}

	public Boolean getWdTuesday() {
		return this.wdTuesday;
	}

	public void setWdTuesday(Boolean wdTuesday) {
		this.wdTuesday = wdTuesday;
	}

	public Boolean getWdWednesday() {
		return this.wdWednesday;
	}

	public void setWdWednesday(Boolean wdWednesday) {
		this.wdWednesday = wdWednesday;
	}

	public Boolean getWdThursday() {
		return this.wdThursday;
	}

	public void setWdThursday(Boolean wdThursday) {
		this.wdThursday = wdThursday;
	}

	public Boolean getWdFriday() {
		return this.wdFriday;
	}

	public void setWdFriday(Boolean wdFriday) {
		this.wdFriday = wdFriday;
	}

	public Boolean getWdSaturday() {
		return this.wdSaturday;
	}

	public void setWdSaturday(Boolean wdSaturday) {
		this.wdSaturday = wdSaturday;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	public Set<EscalStaff> getGridses() {
		return this.gridses;
	}

	public void setGridses(Set<EscalStaff> gridses) {
		this.gridses = gridses;
	}

	public Set<Escalation> getEscalations() {
		return this.escalations;
	}

	public void setEscalations(Set<Escalation> escalations) {
		this.escalations = escalations;
	}

}
