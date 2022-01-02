package com.bridgelabz.stockaccountmanagement;

import java.util.LinkedList;
import java.util.Scanner;

public class StockMain implements PrintInterface {
    static LinkedList<Stock> myLinkedList = new LinkedList<Stock>();
    static Account account = new Account();
    static int value=1000;

    public void operations(){
        boolean label = true;
        while(label == true){
            int balance= value;
            System.out.println("Enter your choice");
	        System.out.println("1)To print report 2)To sell stock 3)To buy share 4)Total value of All companies share 5)Total value particular companies share");
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        switch (choice) {
	          case 1:
	              account.printReport();
	              break;
	          case 2:
	              account.sellStock(balance);
	              break;
	          case 3:
	
	              account.buyStock(balance);
	              break;
	          case 4:
	                account.totalValueOfStock();
	                break;
	          case 5:
	                account.valOfStock();
	                break;
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
    public static void main(String[] args) {
        PrintInterface interface1 = new StockMain() ;
        interface1.operations();
    }


}
