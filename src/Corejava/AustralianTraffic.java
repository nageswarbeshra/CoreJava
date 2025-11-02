package Corejava;

import demopack.Centaltrafic;
import demopack.ContinentalTrafic;
import demopack.IndianTrafic;

public class AustralianTraffic implements Centaltrafic,ContinentalTrafic,IndianTrafic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Centaltrafic at = new AustralianTraffic();
		AustralianTraffic at1 = new AustralianTraffic();
		ContinentalTrafic a = new AustralianTraffic();
		IndianTrafic a1 = new AustralianTraffic();
		at.redGo();
	
		int c = at.a;
		System.out.println(c);
		
		at1.walksymbol();
		a.trainsysmbols();
		a1.indiantrafficsysmbole();
		


}

	@Override
	public void redGo() {
		// TODO Auto-generated method stub
		System.out.println("Red stop");
		
	}
	
	public void walksymbol() {
		System.out.println("walksymbol");
	}

	@Override
	public void yellowGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Yellow get ready");
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go");
		
	}

	@Override
	public void trainsysmbols() {
		// TODO Auto-generated method stubSy
		System.out.println("train symbol");
		
	}

	@Override
	public void indiantrafficsysmbole() {
		// TODO Auto-generated method stub
		System.out.println("indian traffic symbol");
		
	}
}