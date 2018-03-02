package com.mkyong.editor.model;


public class Alerts implements java.io.Serializable {

	private String alertId;
	private AlertGroups alertGroups;
	private String alertDescription;
	private Integer timeAggregation;

	public Alerts() {
	}

	public Alerts(String alertId, AlertGroups alertGroups) {
		this.alertId = alertId;
		this.alertGroups = alertGroups;
	}

	public Alerts(String alertId, AlertGroups alertGroups, String alertDescription, Integer timeAggregation) {
		this.alertId = alertId;
		this.alertGroups = alertGroups;
		this.alertDescription = alertDescription;
		this.timeAggregation = timeAggregation;
	}

	public String getAlertId() {
		return this.alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public AlertGroups getAlertGroups() {
		return this.alertGroups;
	}

	public void setAlertGroups(AlertGroups alertGroups) {
		this.alertGroups = alertGroups;
	}

	public String getAlertDescription() {
		return this.alertDescription;
	}

	public void setAlertDescription(String alertDescription) {
		this.alertDescription = alertDescription;
	}

	public Integer getTimeAggregation() {
		return this.timeAggregation;
	}

	public void setTimeAggregation(Integer timeAggregation) {
		this.timeAggregation = timeAggregation;
	}

}
