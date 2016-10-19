
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
	public ListElement getElement(int index){
		ListElement curr = next;
		while(curr != null){
			if(curr.getData() == index){
				break;
			}
			curr = curr.next;
		}
		if(curr == null){
			System.out.print("No item found");
			ListElement empty = new ListElement();
			empty.setData(0);
			return empty;
		}
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
