
public class ListElement {
	private ListElement next ;
	private ListElement previous;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
		this.previous = null;
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
			this.previous = null;
		}
		else{
			ListElement curr = this.next;
			ListElement prev = this.previous;
			while(curr.next != null){
				prev = curr;
				curr = curr.next;
			}
			ListElement newElement = new ListElement(le);
			
			curr.next = newElement;
			newElement.previous = prev;
		}
	}
	public void printLinkedListHead(){
		ListElement curr = next;
		while(curr != null){
			System.out.print(curr.data + "\n");
			curr = curr.next;
		}
	}
	public void printLinkedListTail(){
		ListElement curr = next;
		while(curr != null){
			System.out.print(curr.data + "\n");
			curr = curr.next;
		}
	}
	public ListElement getElement(int index){
		ListElement curr = next;
		while(curr != null){
			if(curr.getData() == index){
				break;
			}
			curr = curr.next;
		}
		if(curr == null){
			System.out.print("No item found \n");
			ListElement empty = new ListElement();
			empty.setData(0);
			return empty;
		}
		System.out.print("Element Found:" + curr.getData() + "\n");
		return curr;
	}
	public void deleteElement(int index){
		ListElement curr = this;
		ListElement previous = null;
		while(curr != null){
			if(curr.getData() == index){
				if(curr == this){
					this.next = this.next.next;
					break;
				}
				else{
					previous.next = curr.next;
					break;
				}
			}
			previous = curr;
			curr = curr.next;
		}
		if(previous.next == curr){
			System.out.print("No item found \n");
		}
		
		
		
	}
}
