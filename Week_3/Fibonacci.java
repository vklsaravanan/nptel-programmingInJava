// Week 3: Programming Assignment 1

/*QN : This program is related to the generation of Fibonacci numbers.>
   For example: 0,1, 1,2, 3,5, 8, 13,… is a Fibonacci sequence where 13 is the 8th Fibonacci number.*/
//..........................................................................
    
import java.util.Scanner; //This package for reading input
public class Fibonacci { 

public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); //Read an integer
System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
//number
    } 
static int fib(int n) {
	
// Answer is given below for NPTEL
//...............................................................................

	if (n==1) //Terminate condition
		return 0;
		else if(n==2)
		return 1;
		  return fib(n - 1) + fib(n - 2);


//...............................................................................
}
}
