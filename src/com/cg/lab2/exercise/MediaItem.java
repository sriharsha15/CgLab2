package com.cg.lab2.exercise;

public abstract class MediaItem extends Item{
	private int runTime;

	public MediaItem(int idno, String title, int noOfCopies,int runTime) {
		super(idno, title, noOfCopies);
		this.setRunTime(runTime);
		// TODO Auto-generated constructor stub
	}
	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

}
