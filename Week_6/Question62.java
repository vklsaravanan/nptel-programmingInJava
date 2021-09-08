/* Week 6 : Programming Assignment 2

QN : In the following program, a thread class Question62 is created using the Runnable interface 
     Complete the main() to create a thread object of the class Question62 and run the thread. It should print the output as given below.
      
...............................................................................*/
public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }
  
   /*   Answer is given below for --+ NPTEL +--
...............................................................................*/
  
  // Create main() method and appropriate statements in it

public static void main(String[] args){
	  Question62 Obj =new Question62();	
  	Thread t =new Thread(Obj);
  	
  	t.setName("Welcome to Java Week 6 New Question.\nMain Thread");
  
  	t.start();
}
  
//...............................................................................
}
