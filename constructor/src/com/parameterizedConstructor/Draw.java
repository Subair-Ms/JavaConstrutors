package com.parameterizedConstructor;

//Constructor overloading
public class Draw {

	String Draw;
	int Count;
	
	Draw(){
		System.out.println("Constructor for drawing is created");
	}
	
	Draw(String drawingsymbol){
		Draw=drawingsymbol;
		System.out.println("Drawing symbol is"+Draw);
	}
	Draw(String drawingsymbol,int drawingcount){
		Count=drawingcount;
		Draw=drawingsymbol;
		System.out.println("The symbol and count is "+ drawingsymbol+Count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 @SuppressWarnings("unused")
Draw draw=new Draw();
 @SuppressWarnings("unused")
Draw draw1=new Draw("Circle");
 @SuppressWarnings("unused")
Draw draw2=new Draw("Circle",5);
 
	}

}
