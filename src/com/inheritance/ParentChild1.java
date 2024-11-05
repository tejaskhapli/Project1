package com.inheritance;

/*final*/ class FinalClass{
}

class ChildFinal extends FinalClass{
	
}

class Par{
	
	int i = 90;
	String parName;
	
    /*final*/void me(){
		System.out.println("inside Par me");
	}
	
	final void me(int i){
		System.out.println("inside Par me(int i)");
	}
	
	Par(){
		System.out.println("Parent Default Constructor");
		this.parName = "default";
	}
	
	Par(String name){
		this.parName = name;
	}
}

class Child extends Par{
	
	int j = 100;

	String chName;
	
	Child(){
		System.out.println("Child Default Constructor");
		this.chName = "name";
	}
	
	Child(String name){
		this.chName = name;
	}
	
	void me(){
		System.out.println("inside Child me");
	}

	public void callme(){
		me();
	}
	
}

 class GrandChild extends Child{
	 public final void me(){
			System.out.println("inside Child me");
		}
 }

public class ParentChild1 {

	public static void main(String[] args) {
		//***IMP*** Runtime throws java.lang.ArrayStoreException
		/*Par parArray[] = new Child[10];
		for (int i=0; i<parArray.length; i++)
			parArray[i] = new Par();		  
		for (Par p : parArray)
			System.out.println(p.parName);*/
		
		
		Child c = new Child();
		c.callme();
		
		
	}	
}
