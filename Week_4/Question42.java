//Week 4 : Programming Assignment 2

/*QN :Complete the code segment to print the current year. Your code should 
      compile successfully.

...............................................................................*/

// The following is the declaration of the main class named Question42
public class Question42 { 
	public static void main(String args[]){
		int year; // integer type variable to store year
    
    
  /*Answer is given below for --+ NPTEL +--
...............................................................................*/

  java.util.Calendar calendarObj; //using java.util.. Because there is not imported java.util.. packages
    //so we can't call directly, Simply use java.util.Calender to call Calender class
    calendarObj = java.util.Calendar.getInstance(); 
  
    year=calendarObj.get(java.util.Calendar.YEAR);
    
//...............................................................................
    // Print the current Year
		System.out.println("Current Year: "+year);
/*    ~~~THERE IS SOME INVISIBLE CODE HERE~~~
      That code is :                               */
   java.util.Calendar objName=java.util.Calendar.getInstance(); 
   System.out.print("Current Month: "+objName.get(java.util.Calendar.MONTH));
    //you don't need to find this code on nptel, 
    //just know this a little bit
    
        }  
}
