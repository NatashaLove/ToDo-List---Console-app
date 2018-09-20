//ToDo class Definition

package ToDo;

public class ToDo {

	public static int count=0;
	private String item;
	private boolean isDone = false;

	public void addToDo (String item){
		this.item=item;
		count++;
	}
	public void markDone (){
		  isDone=true;
	}
	
	public int getCount () {
		return count;
	}
	
	public String getToDo () {
		return item;
	}


}