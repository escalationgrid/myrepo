package com.mkyong.editor.model;

import java.util.HashSet;
import java.util.Set;

public class AlertGroups implements java.io.Serializable {

	private String alertGroup;
	private String groupDescription;
	private Set<Escalation> escalations = new HashSet<Escalation>(0);
	private Set<Alerts> alertses = new HashSet<Alerts>(0);

	public AlertGroups() {
	}

	public AlertGroups(String alertGroup) {
		this.alertGroup = alertGroup;
	}

	public AlertGroups(String alertGroup, String groupDescription, Set<Escalation> escalations, Set<Alerts> alertses) {
		this.alertGroup = alertGroup;
		this.groupDescription = groupDescription;
		this.escalations = escalations;
		this.alertses = alertses;
	}


	public String getAlertGroup() {
		return this.alertGroup;
	}

	public void setAlertGroup(String alertGroup) {
		this.alertGroup = alertGroup;
	}


	public String getGroupDescription() {
		return this.groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public Set<Escalation> getEscalations() {
		return this.escalations;
	}

	public void setEscalations(Set<Escalation> escalations) {
		this.escalations = escalations;
	}


	public Set<Alerts> getAlertses() {
		return this.alertses;
	}

	public void setAlertses(Set<Alerts> alertses) {
		this.alertses = alertses;
	}

}
