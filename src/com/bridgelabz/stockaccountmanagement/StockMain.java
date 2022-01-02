package com.bridgelabz.stockaccountmanagement;

import java.util.LinkedList;
import java.util.Scanner;

public class StockMain {
	static int noOfStocks;
    static String shareName;
    static int noOfShare;
    static int sharePrice;
    static LinkedList<Stock> myLinkedList = new LinkedList<Stock>();
    static int[] price = new int[10];
    public static void main(String[] args) {
        getData();
        totalValueOfStocks();
    }
	private static void totalValueOfStocks() {
		// TODO Auto-generated method stub
		int sumOfShares=0;
        for(int i = 0; i< noOfStocks;i++) {
            sumOfShares= sumOfShares + price[i];

        }
        System.out.println("Total Share Price: "+sumOfShares);

	}
	private static void getData() {
		// TODO Auto-generated method stub
		int noOfData;
        int i=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("How many data you want to enter");
        noOfStocks = sc.nextInt();
        noOfData=noOfStocks;
        while(noOfData > 0) {
            System.out.println("Enter stock name:");
            shareName  = sc.next();
            System.out.println("Enter number of shares:");
            noOfShare  = sc.nextInt();
            System.out.println("Enter each individual share price:");
            sharePrice  = sc.nextInt();
            myLinkedList.add( new Stock(shareName,noOfShare,sharePrice));
            price[i++]=sharePrice*noOfShare;
            noOfData--;
        }
        System.out.println("Linked list:"+myLinkedList);
        
        for(int j=0;j< myLinkedList.size();j++) {
        	System.out.println(myLinkedList.get(j));
        }
    }
    
}
