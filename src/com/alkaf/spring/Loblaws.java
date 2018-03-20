package com.alkaf.spring;

public class Loblaws implements Retailer{
	
	private Donation donation;
	private Dairy dairy; 
	
	public Loblaws(Donation customerDonation, Dairy myDairy) {
		donation = customerDonation;
		dairy = myDairy;
	}
	
	
	
	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String geAddress() {
		// TODO Auto-generated method stub
		return "2210C Bank St" ;
	}

	@Override
	public String getFlyer() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int giveDontationByCustomer(int amount) {
		// TODO Auto-generated method stub
		return donation.giveDonation(amount);
		
	}



	


	@Override
	public void startBaking() {

		dairy.bake();
	}

}
