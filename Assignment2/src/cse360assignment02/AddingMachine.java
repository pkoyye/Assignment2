package cse360assignment02;

public class AddingMachine {
	  //Instance variables are going to be defined here
	  private int total;
	  private String machine="0";
	  
	  
	  //This is a default constructor called AddingMachine
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  //This is a method to get the total value
	  public int getTotal () {
	    return 0;
	  }
	  //This is a method to add the int variable value into total
	  public void add (int value) {
		  total+=value;
		  machine+=" + "+value;
	  }
      //This is a method to subtract the int variable value from total
	  public void subtract (int value) {
		  total-=value;
		  machine+=" - "+value;
	  }
      //This is a toString method that returns the string representation
	  public String toString () {
	    return machine;
	  }
      
	  public static void main(String[] args) {
         AddingMachine myAddingMachine = new AddingMachine();
         myAddingMachine.add(4);
         myAddingMachine.subtract(2);
         myAddingMachine.add(5);
         System.out.println(myAddingMachine.toString());
	  }
	//This is a method to clear the memory
	  public void clear() {
		  
	  }
	}