import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ListElement head = new ListElement();
		System.out.print("What would you like to do today?(Enter a Integer): \n"
				+ "1.Add a Element. \n"
				+ "2.Retrieve a Element. \n"
				+ "3.Delete a Element. \n"
				+ "4.Print List. \n"
				+ "5.Quit. \n");
		int input = in.nextInt();
		int element;
		do{
			
		
		switch(input){
			case 1:
				System.out.print("Value of Element: \n");
				element = in.nextInt();
				ListElement temp1 = new ListElement();
				temp1.setData(element);
				head.addElement(temp1);
				break;
			case 2:
				System.out.print("Value of Element: \n");
				element = in.nextInt();
				ListElement temp2 = new ListElement();
				temp2 = head.getElement(element);
				break;
			case 3:
				System.out.print("Value of Element: \n");
				element = in.nextInt();
				head.deleteElement(element);
				break;
			case 4:
				head.printLinkedListHead();
				break;
			case 5:
				break;
			default:
				System.out.print("Invalid Input");
				break;
				
		}
		System.out.print("What would you like to do today?: \n "
				+ "1.Add a Element. \n"
				+ "2.Retrieve a Element. \n"
				+ "3.Delete a Element. \n"
				+ "4.Print List. \n"
				+ "5.Quit. \n");
		input = in.nextInt();
		}while(input != 5);
		
	}

}
