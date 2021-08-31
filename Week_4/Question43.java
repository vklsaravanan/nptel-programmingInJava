interface ExtraLarge{
	String extra = "This is extra-large";
	public void display();      // remove 'static'
}

class Large {                                       
    public void Print() {
        System.out.println("This is large");  //add ' ; '
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.Print();          //remove 'super.'
        System.out.println("This is medium");
    }
}
class Small extends Medium implements ExtraLarge{ //add 'implements ExtraLarge'
    public void Print() {
        super.Print(); ; 
        System.out.println("This is small");
    }

	public void display() {              //create override method
	System.out.print("This is extra-large");
  }
}
 
class Question43{
    public static void main(String[] args) {
        Small s = new Small();
     // remove unused object 'Question43 q = new Question43();' 
      s.Print();   
	  s.display();  //change object name q to s
    }
}
