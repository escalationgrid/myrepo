package com.mkyong.editor.model;

public class EventsStatusView implements java.io.Serializable {

	private String rtime;
	private String status;
	private Long count;

	public EventsStatusView() {
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}
