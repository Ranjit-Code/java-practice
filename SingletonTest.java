package Leetcode;

public class SingletonTest{
	private static final SingletonTest test = new SingletonTest();
	
	public static SingletonTest getInstance(){
		return test;
	}
	
	public void printSingletonMessage(){
		System.out.println("this is singleton class");
	}
}