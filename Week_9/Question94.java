/* Week 9 : Programming Assignment 4

QN : A program needs to be developed which can mirror reflect any 5 × 5 2D character array
     into its side-by-side reflection. Write suitable code to achieve this transformation as shown below:
     
 INPUT:            OUTPUT:
        OOXOO               OOXOO
        OOXOO               OOXOO
        XXXOO               OOXXX
        OOOOO               OOOOO
        XOABC               CBAOX

...............................................................................*/
import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    
    /*          Answer is given below for --+ NPTEL +--
...............................................................................*/
    
    / Output 5x5 2D Reflection Array
      String arr[]=new String[5];
    for(int i=0;i<5;i++)
        arr[i]=sc.nextLine();
    
char matrix[][]=new char[5][5];
for(int i=0;i<5;i++){
 char[] chararray=arr[i].toCharArray();
  for(int j=0;j<5;j++){
   matrix[i][j]=chararray[j];
  }
}
for(int i=0;i<5;i++){
    for(int j=4;j>=0;j--)
        System.out.print(matrix[i][j]);
    System.out.println();
}
//...............................................................................
  }
}
