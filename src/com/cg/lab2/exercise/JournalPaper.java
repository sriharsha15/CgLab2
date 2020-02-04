package com.cg.lab2.exercise;

public class JournalPaper extends WrittenItem {

	
	private String yearOfPublished;
	JournalPaper(String yearOfPublished,int idno, String title, int noOfCopies, String authorName) {
		super(idno, title, noOfCopies, authorName);
		this.yearOfPublished=yearOfPublished;
		// TODO Auto-generated constructor stub
	}

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

}
