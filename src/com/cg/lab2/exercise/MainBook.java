package com.cg.lab2.exercise;

import java.util.Scanner;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		  int identificationNumber=scan.nextInt();
		  int noOfCopies=scan.nextInt();
		  String title=scan.nextLine();
		  String author=scan.nextLine();
		  Book b1=new Book(identificationNumber,title,noOfCopies,author);
		   b1.print();
		  scan.close();
		

	}

}
