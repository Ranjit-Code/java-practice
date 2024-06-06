package Leetcode;

abstract class Test {

	int count;
	String name;
	
	Test(){
		count = 1;
		name = "Ranjit";
		System.out.println(count+ " " + name);
	}
	
	public String printName(){
		System.out.println(name);
		return name;
	}
}

class Hello extends Test {
	public String printName(){
		System.out.println("Hello" + count);
		return "Raj";
	}
}

public class Name2{
	public static void main(String args[]){
		Leetcode.SingletonTest test = Leetcode.SingletonTest.getInstance();
		System.out.println(test.getClass());
	}	
}