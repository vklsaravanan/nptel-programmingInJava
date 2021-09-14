/* Week 7 : Programming Assignment 1

QN :Complete the following code fragment to read three integer values from the keyboard 
    and find the sum of the values. Declare a variable "sum" of type int and store the result in it.
 
/*   Answer is given below for --+ NPTEL +--
...............................................................................*/

import java.io.*;

public class Question1{ 
  public static void main (String[] args) throws Exception{

    InputStreamReader isr =new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(isr);
    
    int input_1=Integer.parseInt(br.readLine());
    int input_2=Integer.parseInt(br.readLine());
    int input_3=Integer.parseInt(br.readLine());
    
    int sum = input_1+input_2+input_3;
    
//...............................................................................
    System.out.println(sum);
  }
}
