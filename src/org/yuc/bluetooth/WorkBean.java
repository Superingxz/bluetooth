package org.yuc.bluetooth;

public class WorkBean {
	private String title;
	private String content;
	
	public WorkBean() {
		super();
	}
	public WorkBean(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
