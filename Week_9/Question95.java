
/* Week 9 : Programming Assignment 5

QN : Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5,
     which replaces all input elements with values 0 by 1 and 1 by 0. An example is shown below:

INPUT:         00001
               00001
               00001
               00001
               00001
OUTPUT:
               11110
               11110
               11110
               11110
               11110
...............................................................................*/
import java.util.Scanner;
public class Question95{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

    /*          Answer is given below for --+ NPTEL +--
...............................................................................*/ 

    String inputArray[]=new String[5];
         for(int i=0;i<5;i++) {
             inputArray[i]=sc.nextLine();
         }
     char flipFlopNo[][]=new char[5][5];
     for(int i=0;i<5;i++){
      char[] chararray=inputArray[i].toCharArray();
       for(int j=0;j<5;j++){
        flipFlopNo[i][j]=chararray[j];
       }
     }
     
     for(int i=0;i<5;i++){
       for(int j=0;j<5;j++){
        if(flipFlopNo[i][j]=='0') {
           System.out.print('1');}
        else {
           System.out.print('0');}
       }
       System.out.println();
     }
    
//...............................................................................
  }
}
