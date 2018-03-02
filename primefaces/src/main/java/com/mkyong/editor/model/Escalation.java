package com.mkyong.editor.model;

public class Escalation implements java.io.Serializable {

	private EscalationId id;
	private AlertGroups alertGroups;
	private Grids grids;
	private Integer gridTimeout;
	private Boolean active;
	private Boolean warnings;
	private String warningMessage;

	public Escalation() {
	}

	public Escalation(EscalationId id, AlertGroups alertGroups, Grids grids, Boolean active) {
		this.id = id;
		this.alertGroups = alertGroups;
		this.grids = grids;
		this.active = active;
	}

	public Escalation(EscalationId id, AlertGroups alertGroups, Grids grids, Integer gridTimeout) {
		this.id = id;
		this.alertGroups = alertGroups;
		this.grids = grids;
		this.gridTimeout = gridTimeout;
	}


	public EscalationId getId() {
		return this.id;
	}

	public void setId(EscalationId id) {
		this.id = id;
	}

	public AlertGroups getAlertGroups() {
		return this.alertGroups;
	}

	public void setAlertGroups(AlertGroups alertGroups) {
		this.alertGroups = alertGroups;
	}

	public Grids getGrids() {
		return this.grids;
	}

	public void setGrids(Grids grids) {
		this.grids = grids;
	}


	public Integer getGridTimeout() {
		return this.gridTimeout;
	}

	public void setGridTimeout(Integer gridTimeout) {
		this.gridTimeout = gridTimeout;
	}


	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}


	public Boolean getWarnings() {
		return warnings;
	}

	public void setWarnings(Boolean warnings) {
		this.warnings = warnings;
	}


	public String getWarningMessage() {
		return warningMessage;
	}

	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}

}
