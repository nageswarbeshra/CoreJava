package Corejava;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClass sc = new StringClass();
		sc.test();
//		String str = "HelloWorld";
//		String str1 = new String("HelloWorld");
//		System.out.println(str.charAt(4));

	}
	
	public void test() {
		// check it word is pallendrom or not
		String str = "madam";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("pallendrom");
			}
		else {
				System.out.println("not pallendrom");
			}
	}

}
