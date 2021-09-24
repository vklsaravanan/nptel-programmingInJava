/* Week 9 : Programming Assignment 1

QN : Problem statement:

Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division.

Note the following points carefully:
1. Use only double datatype to store calculated numeric values.
2. Assume input to be of integer datatype.
3. The output should be rounded using Math.round() method.
4. Take care of the spaces during formatting output (e.g., single space each before and after =).
5. The calculator should be able to perform required operations on a minimum of two operands as shown in the below example:

Input: 5+6 
Output: 5+6 = 11

...............................................................................*/
import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6

/*          Answer is given below for --+ NPTEL +--
...............................................................................*/

int firstValue,secondValue;
String sign;
double finalAnswer=0;

	firstValue=Character.getNumericValue(input.charAt(0));
	sign=Character.toString(input.charAt(1));
	secondValue=Character.getNumericValue(input.charAt(2));

switch (sign){
	case "+": finalAnswer=firstValue+secondValue;
	break;
 	case "-": finalAnswer=firstValue-secondValue;
  	break;
  	case "/": finalAnswer=firstValue/secondValue;
  	break;
  	case "*": finalAnswer=firstValue*secondValue;
  	break;
}
System.out.print(input+" = "+Math.round(finalAnswer));

//...............................................................................
  }
}

