
public class ListElement {
	private ListElement next ;
	private ListElement head;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
		this.head = null;
	}
	public void setData(int Data){
		this.data = Data;
	}
	public int getData(){
		return this.data;
	}
	public void addElement(ListElement le){
		if(this.head == null){
			ListElement newElement = new ListElement();
			newElement.setData(le.getData());
			this.head = newElement;
		}
		else{
			ListElement curr = this.head;
			while(curr != null){
				curr = this.next;
			}
			ListElement newElement = new ListElement();
			newElement.setData(le.getData());
			curr = newElement;
		}
	}
	public void printLinkedListHead(){
		ListElement curr = head;
		do{
			System.out.print(this.data);
			curr = this.next;
		}while(curr != null);
	}
}
