package com.cg.lab2.exercise;

public class CD extends MediaItem {

	private String artistName,genre;
	public CD(int idno, String title, int noOfCopies, int runTime,String artistName,String genre) {
		super(idno, title, noOfCopies, runTime);
		this.artistName=artistName;
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		
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
