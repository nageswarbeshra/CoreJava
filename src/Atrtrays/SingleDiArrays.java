package Atrtrays;

public class SingleDiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println("Welcome to Single Dimensional Arrays");
		System.out.println("Single Dimensional Arrays");
		//declaration , traditional way
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		for(int i=0;i<a.length;i++) {
			System.out.println("traditional way "+"Index number:"+i+ " Array is "+a[i]);
		}
		
		//declaration , shortcut way
		System.out.println("***********************");
		System.out.println("Short way of Single Dimensional Arrays");
		int b[] = {11,22,33,44,55};
		for(int j=0;j<b.length;j++) {
			System.out.println("Short way  "+"Index number:"+j+" Array is "+b[j]);
		}
		
	}

}
