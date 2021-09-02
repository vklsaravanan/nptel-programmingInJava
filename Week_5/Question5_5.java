 /* Week 5 : Programming Assignment 5
  
QN : In the following program, there may be multiple exceptions. You have to
     complete the code using only one try-catch block to handle all the possible exceptions.
      
...............................................................................*/
import java.util.Scanner;
public class Question5_5{
	public static void main (String   args[ ] ) {
           Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
	    int j; 
    
/*Answer is given below for --+ NPTEL +--
...............................................................................*/
    
    try{      
	switch (i) {
	    case 0 : 
		int zero = 0; 
		j = 92/ zero; 		
		break;
            case 1 :
		int b[ ] = null; 
		j = b[0] ; 	
		break;
      	    default:
	       System.out.print("No exception");
	}
}
    catch(Exception e) {
	 System.out.print(e); 
    }
    
//...............................................................................
  }
}
