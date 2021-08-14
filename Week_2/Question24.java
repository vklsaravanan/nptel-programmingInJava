Week 2 : Programming Assignment 4

QN :  to call default constructor first and then any other constructor in the class.
нн
...............................................................................

// This is the main class Question
public class Question214{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}	
  
        
// Answer is given below for NPTEL
...............................................................................

//creating class Answer
class Answer{
  //creating default constructor
	Answer(){
		System.out.println("You got nothing.");
	}
  
  //creating 2nd constructor with requires int and string parameter
	Answer(int mark, String testMethod){
        this();  //calling default method with this keyword
		System.out.print("You got "+mark+" for an "+ testMethod);
       
	}
}

...............................................................................


 

