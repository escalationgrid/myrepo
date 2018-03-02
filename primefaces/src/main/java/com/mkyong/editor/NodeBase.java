package com.mkyong.editor;

public abstract class NodeBase implements Comparable<NodeBase>{
	
	public NodeBase() {
		super();
	}

	protected String nodeName; 
	
	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
/*	// informação duplicada em escalationMaintenance.xhtml (verificar)
 	protected final String NODE_TYPE_ALERT_GROUPS = "ALERT_GROUPS";
 	protected final String NODE_TYPE_ALERT_GROUP = "ALERT_GROUP";
 	protected final String NODE_TYPE_ALERTS = "ALERTS";
 	protected final String NODE_TYPE_ALERT = "ALERT";
 	protected final String NODE_TYPE_ESCALATIONS = "ESCALATIONS";
 	//protected final String NODE_TYPE_ESCALATIONS_LEVELS = "ESCALATIONS_LEVELS";
 	protected final String NODE_TYPE_GRID = "GRID";
 	protected final String NODE_TYPE_LEVEL = "LEVEL";
 	protected final String NODE_TYPE_DETAIL = "DETAIL";
 	protected final String NODE_TYPE_STAFFS = "STAFFS";
 	protected final String NODE_TYPE_STAFF = "STAFF";*/
 	
    protected final String NODE_LABEL_ALERT_GROUPS = "ALERT GROUPS";
 	protected final String NODE_LABEL_ALERTS = "ALERTS";
 	protected final String NODE_LABEL_DESCRIPTION = "Description: ";
 	protected final String NODE_LABEL_AGGREGATION_TIME = "Aggregation Time: ";
 	protected final String NODE_LABEL_ACTIVE = "Active: ";
 	protected final String NODE_LABEL_TIMEOUT = "Timeout: ";
 	protected final String NODE_LABEL_START_HOUR = "Start hour: ";
 	protected final String NODE_LABEL_END_HOUR = "End hour: ";
 	protected final String NODE_LABEL_WEEKDAYS = "Weekdays: ";
 	protected final String NODE_LABEL_STAFFS = "STAFFS";
 	protected final String NODE_LABEL_STAFF_NAME = "Name: ";
 	protected final String NODE_LABEL_STAFF_AREA = "Area: ";  
 	protected final String NODE_LABEL_STAFF_PHONE = "Phone: "; 
 	protected final String NODE_LABEL_STAFF_EMAIL = "Email: ";  
 	protected final String NODE_LABEL_SECTORS = "Sectors: ";
 	protected final String NODE_LABEL_TRUE = "true";
 	protected final String NODE_LABEL_FALSE = "false";
 	protected final String NODE_LABEL_LEVEL_ONE = "LEVEL 1";
 	protected final String NODE_LABEL_LEVEL_TWO = "LEVEL 2";
 	protected final String NODE_LABEL_LEVEL_THREE = "LEVEL 3";
 	protected final String NODE_LABEL_LEVEL_FOUR = "LEVEL 4";
 	protected final String NODE_LABEL_LEVEL_FIVE = "LEVEL 5";
 	protected final String NODE_LABEL_LEVEL_SIX = "LEVEL 6";
 	protected final String NODE_LABEL_LEVEL_SEVEN = "LEVEL 7";
 	protected final String NODE_LABEL_LEVEL_EIGHT = "LEVEL 8";
 	protected final String NODE_LABEL_LEVEL_NINE = "LEVEL 9";
 	protected final String NODE_LABEL_LEVEL_TEN = "LEVEL 10";
 	protected final String NODE_LABEL_ESCALATIONS = "ESCALATIONS";
 	
 	protected final String NODE_LABEL_MON = "Mon";
 	protected final String NODE_LABEL_TUE = "Tue";
 	protected final String NODE_LABEL_WED = "Wed";
 	protected final String NODE_LABEL_THU = "Thu";
 	protected final String NODE_LABEL_FRI = "Fri";
 	protected final String NODE_LABEL_SAT = "Sat";
 	protected final String NODE_LABEL_SUN = "Sun";
 	
 	protected final String HTML_TABLE_START = "<table><tr><th style=\"color:black;\">";
 	protected final String HTML_TABLE_ONE_NEW   = "&nbsp;</th><td>";
 	 	
 	protected final String HTML_TABLE_START_BORDER = "<table class=\"table-details\"><tr><th class=\"th-details\" style=\"color:black;\">";
 	protected final String HTML_TABLE_ONE   = "&nbsp;</th><td class=\"td-details\">";
 	protected final String HTML_TABLE_TWO   = "</td></tr><tr><th class=\"th-details\" style=\"color:black;\">";
 	protected final String HTML_TABLE_THREE = "&nbsp;</th><td class=\"td-details\">";
 	protected final String HTML_TABLE_CLOSE  = "</td></tr></table>";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeName == null) ? 0 : nodeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeBase other = (NodeBase) obj;
		if (nodeName == null) {
			if (other.nodeName != null)
				return false;
		} else if (!nodeName.equals(other.nodeName))
			return false;
		return true;
	}
 	
 	@Override
 	public String toString() {
 		return nodeName;
 	}
 	
    public int compareTo(NodeBase nodeBase) {
        return this.getNodeName().compareTo(nodeBase.getNodeName());
    }
 	
}
