package week1;
import java.util.Scanner;
public class Exercise1_2 {
 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); 
		         int x = s.nextInt(); 
		         int y = s.nextInt();
		 int z = s.nextInt();
		 int result = 0;
if(x>y && x>z) {
	result=x;
	System.out.print(result);
}
if(y>x && y>z) {
	result=y;	
	System.out.print(result);
}
else{
	result=z;
	System.out.print(result);
}

		 
		 
		 
		 
 }
}
