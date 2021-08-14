Week 2 : Programming Assignment 1

QN : Complete the code segment to call the method  print() of class Student first and then call print() method of class School.
­­
...............................................................................

// This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}
public class Question21{ 
    public static void main(String args[]){   
    
        
// Answer is given below for NPTEL
...............................................................................

// Creating an object of class Student
	Student objStudent = new Student();

// Calling 'print()' method of class Student 
	objStudent.print();

// Creating an object of class School
	School objSchool = new School();

// Calling 'print()' method of class School
	objSchool.print();
	
...................................................
NOTE : This will show some presentation error.
	  But you will get passed status.
	  Reason : error occurred in main method when printing ,thats can't able to change in this code, 
	  If we have any possiblities to fix this error we can update this specific code file
...............................................................................


 }
}


