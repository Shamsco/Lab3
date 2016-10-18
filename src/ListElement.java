
public class ListElement {
	private ListElement next ;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
	}
	public void setData(int Data){
		this.data = Data;
	}
	public int getData(){
		return this.data;
	}
	public ListElement(ListElement le){
		this.data = le.getData();
		this.next = null;
	}
	public void addElement(ListElement le){
		if(this.next == null){
			ListElement newElement = new ListElement(le);
			this.next = newElement;
		}
		else{
			ListElement curr = this.next;
			while(curr.next != null){
				curr = curr.next;
			}
			ListElement newElement = new ListElement(le);
			
			curr.next = newElement;
		}
	}
	public void printLinkedListHead(){
		ListElement curr = next;
		while(curr != null){
			System.out.print(curr.data + "\n");
			curr = curr.next;
		}
	}
}
