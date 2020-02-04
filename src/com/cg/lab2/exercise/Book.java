package com.cg.lab2.exercise;

public class Book extends WrittenItem{

public Book(int idno, String title, int noOfCopies, String authorName) {
		super(idno, title, noOfCopies, authorName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Total No.of Copies:->"+this.getNoOfCopies());
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Book Author:"+this.getAuthorName());
		
	}

}
