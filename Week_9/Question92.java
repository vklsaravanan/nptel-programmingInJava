/* Week 9 : Programming Assignment 2

QN : Complete the code to develop an ADVANCED CALCULATOR that emulates all the functions of the 
     GUI Calculator as shown in the image.
     
     Note the following points carefully:
1. Use only double datatype to store all numeric values.
2. Each button on the calculator should be operated by typing the characters from 'a' to 'p'.
3. To calculate 25-6, User should input fjhkc (where, f for 2, j for 5, h for '-', k for 6 and c for '=' ).
3. You may use the already defined function gui_map(char).
4. Without '=', operations won't give output as shown in Input_2 and Output_2 example below.
5. The calculator should be able to perform required operations on two operands as shown in the below example:
Input_1:
                   klg
Output_1:
                        18.0
...............................................................................*/
import java.util.Scanner;
public class Question92{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
    
/*          Answer is given below for --+ NPTEL +--
...............................................................................*/ 
    
		double total=0;
		Double firstNo=0.0,secondNo=0.0;
		int i=0,j=0,k=0,matrixSignIndex = 0;
		char matrixSign=0,equalSign,
				tempFirstNo[]= new char[100],
				inputs[]=new char[input.length()] ,
				tempSecondNo[]= new char[100];

		for( i=0; i<input.length(); i++ ) {
			inputs[i]=gui_map(input.charAt(i)); 
			}
		for(i=0; i<input.length(); i++ ) {
			char sign=inputs[i];
			
			if(sign=='-'||sign=='+'||sign=='X'||sign=='/') {
				matrixSign=sign;
				for(j=0; j<i; j++) {
					tempFirstNo[j] = inputs[j] ;
				String tempFirstnum= String.valueOf(tempFirstNo);
				firstNo=Double.valueOf(tempFirstnum);
				}
				matrixSignIndex=i;
			}
			else if(sign =='=') {
				equalSign=sign;
				j=0;
				for(k=matrixSignIndex+1; k<i; k++) {
					tempSecondNo[j] = inputs[k];
					String tempSecondnum= String.valueOf(tempSecondNo);
					secondNo=Double.valueOf(tempSecondnum);
					j++;
				}
			}
		}
		switch (matrixSign){
			case '+': total=firstNo+secondNo;
		  	break;
			case '-': total=firstNo-secondNo;
		    break;
		    case '/': total=firstNo/secondNo;
		    break;
		    case 'X': total=firstNo*secondNo;
		    break;
		}
		if(inputs[inputs.length-1]=='=') {
			System.out.print(total);
		}

//...............................................................................
	}// The main() method ends here.
	
// A method that takes a character as input and returns the corresponding GUI character	
	static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','.'}
					,{'b','0'}
					,{'c','='}
					,{'d','+'}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','-'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','X'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','/'}};
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}
