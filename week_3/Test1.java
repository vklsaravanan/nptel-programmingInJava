//Week 3 : Programming Assignment 3

/*QN : A class Shape is defined with two overloading constructors in it. Another class Test1 is partially 
 *    defined which inherits the class Shape. The class Test1 should include two overloading constructors as 
 *    appropriate for some object instantiation shown in main() method. You should define the constructors using the super class constructors. 
 *    Also, override the method calculate( ) in Test1 to calculate the volume of a Shape.*/

//...............................................................................


import java.util.Scanner;

import week3.Test1;
class Shape{
double length, breadth;
Shape(double l, double b){ //Constructor to initialize a Shape object  
length = l;
breadth= b;
}
Shape(double len){    //Constructor to initialize another Shape object  
length = breadth = len;
}
double calculate(){// To calculate the area of a shape object
return length * breadth ;
}
}
public class Test1 extends Shape{  

	
/* Answer is given below for --+ NPTEL +--
...............................................................................*/

	double height;
	Test1(double length,double height) {
		super(length);
		this.height=height;
	}
	Test1(double length,double breadth ,double height) {
		super(length,breadth);
		this.height=height;
	}
	double calculate() {
		return super.breadth*super.length*height;	
	}
	
//...............................................................................
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);//Create an object to read                                                               
	                                          //input
		double l=sc.nextDouble(); //Read length
		double b=sc.nextDouble(); //Read breadth	
		double h=sc.nextDouble(); //Read height
		Test1 myshape1 = new Test1(l,h);
		Test1 myshape2 = new Test1(l,b,h);
		double volume1;
		double volume2;
		volume1 = myshape1.calculate();
		volume2=myshape2.calculate();
		System.out.println(volume1);
		System.out.println(volume2);
		}
	}


//+++++ Its shown some presentation error  +++++