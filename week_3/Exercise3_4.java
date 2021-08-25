//Week 3 : Programming Assignment 4

/*QN : A class Shape is defined with two overloading constructors in it. Another class Test1 is partially 
 *    defined which inherits the class Shape. The class Test1 should include two overloading constructors as 
 *    appropriate for some object instantiation shown in main() method. You should define the constructors using the super class constructors. 
 *    Also, override the method calculate( ) in Test1 to calculate the volume of a Shape.*/

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