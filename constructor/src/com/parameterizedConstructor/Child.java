package com.parameterizedConstructor;

public class Child extends Parent {
	
	public Child(){
		
		super();
		System.out.println("Inside childclass ");
	}
public static void main(String[]args) {
	
	Child child=new Child();
	
}
}
