package com.techymeet.Constructor;

class Test1{
	int i;
	
	public Test1(int k) {
		i = k;
	}
	
	public Test1(int k,int m) {
		System.out.println("Hi I am gobi");
		
		if(k>m) {
			i = k;
		}
		else {
			i = m;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Test1 test1 = new Test1(10);
		Test1 test2 = new Test1(12,15);
		
		System.out.println(test1.i);
		System.out.println(test2.i);
		
	}
}
