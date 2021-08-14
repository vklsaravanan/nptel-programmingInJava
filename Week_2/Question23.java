Week 2 : Programming Assignment 3

QN : call print() method of class Question by creating a method named ‘studentMethod()’.
­­
...............................................................................

// This is the main class Question
public class Question23{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		Question23 q = new Question23();
		// Print method on object of Question class is called
		q.studentMethod();
    }
	
	// 'print()' method is defined in class Question
	void print(Question23 object){
		System.out.print("Well Done!");
	} 
  
        
// Answer is given below for NPTEL
...............................................................................

// Define a method named 'studentMethod()' in class Question
	private void studentMethod(){

// Call the method named 'print()' in class Question
      print(this);
    }

...............................................................................


 
}
