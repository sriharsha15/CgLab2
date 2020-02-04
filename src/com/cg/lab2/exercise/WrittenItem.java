package com.cg.lab2.exercise;

public abstract class WrittenItem extends Item{
	private String authorName;
	
	public WrittenItem(int idno, String title, int noOfCopies,String authorName) {
		super(idno, title, noOfCopies);
		this.authorName = authorName;
		// TODO Auto-generated constructor stub
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	void addItem() {
		 System.out.println("Item is added successfully");
	 }

}
