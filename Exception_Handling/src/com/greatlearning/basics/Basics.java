package com.greatlearning.basics;

public class Basics {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num1=100; //taken this number as input
//		int num2=0;//taken this number as input
//		try {
//			if(num2==0) {
//				throw new NullPointerException("num2 can't be zero, this is injustice");
//			}
//			
//			int result = num1/num2;
//			System.out.println(result);
//		}catch (Exception e){
//			System.out.println("exception catched");
//			System.out.println(e);
//		}finally { //this block will execute ragardless of the exception handles or not
//			System.out.println("I am the boss");
//			
//		}

		Basics basics=new Basics();
		try {
			int result=basics.divideNumbers(100, 0);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("exception catched");
			System.out.println(e);
		}
		
	}
	public static int divideNumbers(int num1,int num2) throws ArithmeticException{
		int result=num1/num2;
		return result;
	}

}
