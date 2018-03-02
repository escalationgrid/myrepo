package com.mkyong.editor.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Events implements java.io.Serializable {

	private long eventId;
	private String alertId;
	private Date eventTime;
	private Integer eventCount;
	private Short eventStatus;
	private String cefTimestamp;
	private String cefHost;
	private String cefVersion;
	private String cefDvendor;
	private String cefDproduct;
	private String cefDversion;
	private String cefName;
	private String cefSeverity;
	private String cefExtension;
	private String staffAttending;
	private Set<Actions> actionses = new HashSet<>(0);

	public Events() {
	}

	public Events(long eventId) {
		this.eventId = eventId;
	}

	public Events(long eventId, String alertId, Date eventTime, Integer eventCount, Short eventStatus,
			String cefTimestamp, String cefHost, String cefVersion, String cefDvendor, String cefDproduct,
			String cefDversion, String cefName, String cefSeverity, String cefExtension, Set<Actions> actionses) {
		this.eventId = eventId;
		this.alertId = alertId;
		this.eventTime = eventTime;
		this.eventCount = eventCount;
		this.eventStatus = eventStatus;
		this.cefTimestamp = cefTimestamp;
		this.cefHost = cefHost;
		this.cefVersion = cefVersion;
		this.cefDvendor = cefDvendor;
		this.cefDproduct = cefDproduct;
		this.cefDversion = cefDversion;
		this.cefName = cefName;
		this.cefSeverity = cefSeverity;
		this.cefExtension = cefExtension;
		this.actionses = actionses;
	}

	public long getEventId() {
		return this.eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getAlertId() {
		return this.alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public Date getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public Integer getEventCount() {
		return this.eventCount;
	}

	public void setEventCount(Integer eventCount) {
		this.eventCount = eventCount;
	}

	public Short getEventStatus() {
		return this.eventStatus;
	}

	public void setEventStatus(Short eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getCefTimestamp() {
		return this.cefTimestamp;
	}

	public void setCefTimestamp(String cefTimestamp) {
		this.cefTimestamp = cefTimestamp;
	}

	public String getCefHost() {
		return this.cefHost;
	}

	public void setCefHost(String cefHost) {
		this.cefHost = cefHost;
	}

	public String getCefVersion() {
		return this.cefVersion;
	}

	public void setCefVersion(String cefVersion) {
		this.cefVersion = cefVersion;
	}

	public String getCefDvendor() {
		return this.cefDvendor;
	}

	public void setCefDvendor(String cefDvendor) {
		this.cefDvendor = cefDvendor;
	}

	public String getCefDproduct() {
		return this.cefDproduct;
	}

	public void setCefDproduct(String cefDproduct) {
		this.cefDproduct = cefDproduct;
	}

	public String getCefDversion() {
		return this.cefDversion;
	}

	public void setCefDversion(String cefDversion) {
		this.cefDversion = cefDversion;
	}

	public String getCefName() {
		return this.cefName;
	}

	public void setCefName(String cefName) {
		this.cefName = cefName;
	}

	public String getCefSeverity() {
		return this.cefSeverity;
	}

	public void setCefSeverity(String cefSeverity) {
		this.cefSeverity = cefSeverity;
	}

	public String getCefExtension() {
		return this.cefExtension;
	}

	public void setCefExtension(String cefExtension) {
		this.cefExtension = cefExtension;
	}

	public String getStaffAttending() {
		return staffAttending;
	}

	public void setStaffAttending(String staffAttending) {
		this.staffAttending = staffAttending;
	}
	
	public Set<Actions> getActionses() {
		return this.actionses;
	}

	public void setActionses(Set<Actions> actionses) {
		this.actionses = actionses;
	}

}
