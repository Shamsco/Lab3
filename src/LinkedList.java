
public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListElement le = new ListElement();
		le.setData(5);
		ListElement another = new ListElement();
		another.setData(6);
		le.addElement(another);
		le.printLinkedListHead();
	}

}
