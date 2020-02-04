package com.cg.lab2.exercise;

public abstract class Item {
	private int idno;
	private String title;
	private int noOfCopies;
	
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public Item(int idno,String title,int noOfCopies)
	{
		this.idno=idno;
		this.title=title;
		this.noOfCopies=noOfCopies;
	}
	
	@Override
	public String toString() {
		return "Item [idno=" + idno + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (idno != other.idno)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	abstract void addItem();
	abstract void checkIn();
	abstract void checkOut();
	abstract void print();
}
