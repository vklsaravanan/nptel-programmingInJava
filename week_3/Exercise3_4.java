//Week 3 : Programming Assignment 4

/*QN : This program to exercise the call of static and non-static methods. 
  A partial code is given defining two methods, namely sum( ) and multiply ( ). You...,.*/

//...............................................................................

import java.util.Scanner;

import week3.QuestionScope;
class QuestionScope {
int sum(int a, int b){ //non-static method
        return a + b;
    }
static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Exercise3_4{
public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		
/* Answer is given below for --+ NPTEL +--
...............................................................................*/
		
		QuestionScope obj =new QuestionScope();
		System.out.println(obj.sum(n1,n2));
		System.out.print(QuestionScope.multiply(n1,n2));
		
//...............................................................................
	}
}
