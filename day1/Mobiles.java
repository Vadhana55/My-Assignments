package week1.day1;

public class Mobiles {

	 
		 public void sendmsg() {
			 String model="Samusung";
			 float weight=12f;
			 System.out.println("Samsung M33");
			 }
			public void makecall() {
				boolean fullycharged=true;
				int mobilecost=18000;
	     		System.out.println("New Model");
			}	
	     	public static void main(String srgs[]) {
	     	Mobiles mobile=new Mobiles();
	     	mobile.sendmsg();
	     	mobile.makecall();
	     	System.out.println("This is my mobile");
	     	}
				
	}


