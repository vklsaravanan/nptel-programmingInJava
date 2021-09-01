/* Week 5 : Programming Assignment 4

QN : In the following program, an array of integer data to be initialized.
      During the initialization, if a user enters a value other than integer value,
      then it will throw InputMismatchException exception. On..,
      
...............................................................................*/
//Prefixed Fixed Code:
import java.util.*;
public class Question5_4{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int length = sc.nextInt(); 
      // create an array to save user input 
      int[] name = new int[length];
      int sum=0;//save the total sum of the array.
    
 /*Answer is given below for --+ NPTEL +--
...............................................................................*/

int b=0;
while(b<=name.length-1){
  try{
  name[b]= sc.nextInt();
  sum=sum+name[b];
  }
  catch(InputMismatchException e){
    System.out.print("You entered bad data."); 
    return;
  }
  b++;
}
System.out.print(sum);
    
//...............................................................................
 }
}
