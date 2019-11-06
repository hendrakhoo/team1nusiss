import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean done = false;
			System.out.println("Welcome to our To Do List Manager");
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			ToDoList TDL = new ToDoList();
			
		  
	   while(!done) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Add new Tasks");
		System.out.println("2) Remove a Task");
		System.out.println("3) Complete a Task");
		System.out.println("4) Search for a Task");
		System.out.println("5) View All Current Task");
		System.out.println("6) Exit");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	
	    System.out.print("Enter Choice : ");
	    

	    int choice = myObj.nextInt();  // Read user input
	    
	    Scanner myObj1 = new Scanner(System.in); 
	    String description = "";
	    switch(choice) {
	   
	    case 1:
	      // code block
	    	
	    	System.out.print("Enter task description : ");
	    	description = myObj1.nextLine();	    	
	    	TDL.addTask(new Task(description));
	    	System.out.println(description + " added successfully ");
	    	
	    	
	      break;
	    case 2:
	      // code block
	    	System.out.print("Enter task description to remove : ");
	    	description = myObj1.nextLine();	
	    	TDL.removeTask(description);
	      break;
	    case 3:
		      // code block
	    	System.out.print("Enter task description to remove : ");
	    	description = myObj1.nextLine();	
	    	TDL.completeTask(description);
	   
		      break;
	    case 4:
		      // code block
	    	System.out.print("Enter task description to remove : ");
	    	description = myObj1.nextLine();
	    	Collection<Task> temp1 = TDL.partialWordSearchTasks(description);
	    	Iterator<Task> iterator1 = temp1.iterator();
	    	 int count1 = 0;
	         // while loop
	         while (iterator1.hasNext()) {
	        	 count1 ++;
	        	 Task temptask = iterator1.next();
	         System.out.println(count1 +")Description : " + temptask.getDescription() +" status : " + temptask.isComplete());
	         }
	         if(count1 == 0 )
	        	 System.out.println("Tasks not found in Database");
	    	
	    	
		      break;
	    case 5:
		      // code block
	    	Collection<Task> temp = TDL.getAllTasks();
	    	 Iterator<Task> iterator = temp.iterator();
	    	 int count = 0;
	         // while loop
	         while (iterator.hasNext()) {
	        	 count ++;
	        	 Task temptask = iterator.next();
	         System.out.println(count +")Description : " + temptask.getDescription() +" status : " + temptask.isComplete());
	         }
	         if(count == 0 )
	        	 System.out.println("No Tasks in Database");
		      break;
		      
	    case 6:
	    	System.out.println("byebye");
		      done = true;
		      break;
		      
	    default:
	      // code block
	  }
	    }
	}

}
