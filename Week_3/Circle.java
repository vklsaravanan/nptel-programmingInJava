
//Week 3 : Programming Assignment 2

/*QN :  Define a class Point with two fields x and y each of type double. Also, define a method distance(Point p1, Point p2)
 *  to calculate the distance between points p1 and p2 and return the value in double.*/

//...............................................................................

import java.util.Scanner;

public class Circle extends Point{
	
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 Point p1=new Point();
	 p1.x=sc.nextDouble();
	 p1.y=sc.nextDouble();
	 Point p2=new Point();
	 p2.x=sc.nextDouble();
	 p2.y=sc.nextDouble(); 
	 Circle c1=new Circle();
	c1.distance(p1,p2);
	
  }

}
//...............................................................................

//We know that formula for distance between two points
//formula > d(P,Q) = √ (x2 − x1)2 + (y2 − y1)2

/* Answer is given below for --+ NPTEL +--
...............................................................................*/

class Point{
double x,y ;
	 void distance(Point p1Obj,Point p2Obj){
		
double total,xPoint,yPoint;

xPoint= Math.pow((p2Obj.x-p1Obj.x),2);
yPoint=Math.pow((p2Obj.y-p1Obj.y),2);

total=Math.sqrt(xPoint +yPoint );
      
System.out.print(total);
	}
}

//...............................................................................


 
