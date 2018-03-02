package com.mkyong.editor.model;

import java.util.Date;


public class Actions implements java.io.Serializable {

	private long actionId;
	private Events events;
	private Date actionTime;
	private String staffId;
	private String description;
	private Short source;
	private Date resolvedTime;
	private Date eta;
	private Short flag;
	private Short gridLevel;
	private String gridId;
	private String operId;

	public Actions() {
	}

	public Actions(long actionId, Events events, Date actionTime) {
		this.actionId = actionId;
		this.events = events;
		this.actionTime = actionTime;
	}

	public Actions(long actionId, Events events, Date actionTime, String staffId, String description, Short source,
			Date resolvedTime, Date eta, Short flag, Short gridLevel) {
		this.actionId = actionId;
		this.events = events;
		this.actionTime = actionTime;
		this.staffId = staffId;
		this.description = description;
		this.source = source;
		this.resolvedTime = resolvedTime;
		this.eta = eta;
		this.flag = flag;
		this.gridLevel = gridLevel;
	}


	public long getActionId() {
		return this.actionId;
	}

	public void setActionId(long actionId) {
		this.actionId = actionId;
	}

	public Events getEvents() {
		return this.events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public Date getActionTime() {
		return this.actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getSource() {
		return this.source;
	}

	public void setSource(Short source) {
		this.source = source;
	}

	public Date getResolvedTime() {
		return this.resolvedTime;
	}

	public void setResolvedTime(Date resolvedTime) {
		this.resolvedTime = resolvedTime;
	}

	public Date getEta() {
		return this.eta;
	}

	public void setEta(Date eta) {
		this.eta = eta;
	}

	public Short getFlag() {
		return this.flag;
	}

	public void setFlag(Short flag) {
		this.flag = flag;
	}

	public Short getGridLevel() {
		return this.gridLevel;
	}

	public void setGridLevel(Short gridLevel) {
		this.gridLevel = gridLevel;
	}

	public String getGridId() {
		return gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

}
