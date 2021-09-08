/* Week 6 : Programming Assignment 1

QN : Complete the code segment to print the following using the 
     concept of extending the Thread class in Java:
    ------------------OUTPUT-------------------
    Thread is Running.
    --------------------------------------------
    
   /*   Answer is given below for --+ NPTEL +--
...............................................................................*/
  
  public class Question61 extends Thread{ 
  public void run(){
    System.out.print("Thread is Running.");
  }
    
//...............................................................................
    	public static void main(String args[]){  

		// Creating object of thread class
		Question61 thread=new Question61();  

                // Start the thread
		thread.start();
	}  
}
