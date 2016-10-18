
public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListElement head = new ListElement();
		ListElement le = new ListElement();
		le.setData(5);
		ListElement another = new ListElement();
		another.setData(6);
		ListElement another1 = new ListElement();
		another1.setData(4);
		ListElement another2 = new ListElement();
		another2.setData(7);
		head.addElement(le);
		head.addElement(another);
		head.addElement(another1);
		head.addElement(another2);
		head.printLinkedListHead();
	}

}
