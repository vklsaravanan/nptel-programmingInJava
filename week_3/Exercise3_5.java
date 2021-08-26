///Week 3 : Programming Assignment 5

/*QN : Complete the code segment to swap two numbers using call by object reference.*/

//...............................................................................

import java.util.Scanner;
class Question {  //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class Exercise3_5{

/* Answer is given below for --+ NPTEL +--
...............................................................................*/

	static void swap(Question t) {
		int tmp=t.e2;
		 	t.e2=t.e1;
		  	t.e1=tmp;
	}

//...............................................................................

	public static void main(String[] args) {
		//Create an object of class Question
			Question t = new Question ();
		  //Call the method swap()
		swap(t);
		System.out.println(t.e1+" "+t.e2);    
  }
}	
