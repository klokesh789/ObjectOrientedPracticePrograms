package com.bridgelabz.stockaccountmanagement;

public class Stock {

	private String shareName;
	private int noOfShare;
	private int sharePrice;
	public Stock(String shareName, int noOfShare, int sharePrice) {
		// TODO Auto-generated constructor stub
		super();
		this.shareName = shareName;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
	}
	@Override
    public String toString() {
        return "Stock [shareName=" +shareName + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + "]";
    }

}
