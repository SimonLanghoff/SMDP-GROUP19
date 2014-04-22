package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

public class Survey {
	private String title;
	private ArrayList<Page> pages;
	
	public Survey() {
		this.pages = new ArrayList<Page>();
	}
	
	public Survey(String title) {
		this.title = title;
		this.pages = new ArrayList<Page>();
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArrayList<Page> getPages() {
		return pages;
	}
	
	public void addPage(Page page) {
		pages.add(page);
	}
}
