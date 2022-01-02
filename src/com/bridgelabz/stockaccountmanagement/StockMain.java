package com.bridgelabz.stockaccountmanagement;

import java.util.LinkedList;
import java.util.Scanner;

public class StockMain {
	static LinkedList<Stock> myLinkedList = new LinkedList<Stock>();
	static Account account = new Account();
    static int value=1000;

    public static void main(String[] args) {
        boolean label = true;
        while(label == true){
	        int balance= value;
	        System.out.println("Enter your choice");
	        System.out.println("1)To print report 2)To buy share 3)Total value of All companies share 4)Total value particular companies share");
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        switch (choice) {
	          case 1:
	              account.printReport();
	              break;
	          case 2:
	              account.debit(balance);
	              break;
	          case 3:
	                account.totalValueOfStock();
	                break;
	          case 4:
	                account.valOfStock();
	          default:
	                System.out.println("enter valid choice");
	      }
      System.out.println("Enter 1 to continue");
      int a = sc.nextInt();
      if(a == 1){
          label=true;
      }
      else{
          label=false;
      }
      }
  }
    
}
