//ToDoList Class Definition

import java.util.*;
import ToDo.*;
import java.util.Scanner;

public class  ToDoList {
	
	public static void main (String [] args) {
		
		Scanner inputDevice=new Scanner(System.in);
		final int MAXTODOLIST =10;
		
		ToDo[] itemList = new ToDo [MAXTODOLIST];
		
		//ArrayList<String> al= new ArrayList<String>();
		//ArrayList<ToDo> todo = new ArrayList<ToDo>();
		
		char next='a';
		String todo = "";
		
		while(next != 'x') {
			System.out.println();
			System.out.println("\nShow ToDo list (s)");
			System.out.println("\nAdd to list (a)");
			System.out.println("\nDone list item (d)");
			System.out.println("\nPrint count of ToDos (p)");
			System.out.println("\nExit list app (x)");
			System.out.println("\nWhat do you want to do: ");
			
			next = inputDevice.next().charAt(0);
			inputDevice.nextLine(); // need it right after input taking a char or int - or will occupy the next input
			
			if(next == 's'){
				// use for loop to print array
			} else if (next == 'a'){
				System.out.println(" Type your ToDo item ");
				todo = inputDevice.nextLine();
				itemList[ToDo.count]= new ToDo(); // empty constructor
				itemList[ToDo.count].addToDo(todo);
				// the same as:
				//int count = ToDo.count;
				//itemList[count]= new ToDo(); // empty constructor
				//itemList[count].addToDo(todo);
			} else if (next == 'd') {
				//Mark done
			} else if (next == 'p'){
				
				System.out.println(" You have "+ ToDo.count + " ToDo items.");
			} else {
				//Bad choice
			}
		}
	
	}
	
	 	
	
}