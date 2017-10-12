package lab7;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		
		// Creates first linked list.
		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("Tulsa");
		linkedList1.add("Ada");
		linkedList1.add("Broken Arrow");
		linkedList1.add("Owasso");
		
		// Adds "OKC" as the second element in the list.
		System.out.println("First List: " + linkedList1);
		linkedList1.add(1, "OKC");
		System.out.println("First List (after addition): " + linkedList1);
		
		//Creates second linked list.
		LinkedList<String> linkedList2 = new LinkedList<String>();
		linkedList2.add("74104");
		linkedList2.add("74135");
		linkedList2.add("foo");
		linkedList2.add("Hello World");
		linkedList2.add("777");
		System.out.println("Second List: " + linkedList2);

		/* Merges the two linked lists.
		 * Wasn't sure how they were to be merged, so I
		 * did both concatenation and alternating.
		 */
		LinkedList<String> mergedList = new LinkedList<String>();
		mergedList.addAll(linkedList1);
		mergedList.addAll(linkedList2);
		System.out.println("Merged (concatenated): " + mergedList);
		System.out.println("Merged (alternating): " + myMerge(linkedList1, linkedList2));
		
		// Removes every second word from the first linked list.
		for (int i = 0; i < linkedList1.size(); i++) {
			linkedList1.remove(i);
		}
		System.out.println("First List (after deletion): " + linkedList1);

		// Clones the second list (deep copy)
		LinkedList<String> cloneOf2 = (LinkedList<String>) linkedList2.clone();
		// linkedList2.removeFirst();
		// System.out.println("Second List (after deletion, used as test case.): " +
		// linkedList2);
		System.out.println("Clone of 2: " + cloneOf2);

		// Also clones the second list (deep copy)
		LinkedList<String> clone2Of2 = new LinkedList<String>();
		for (String s : linkedList2) {
			clone2Of2.add(s);
		}
		System.out.println("Clone 2 of 2: " + cloneOf2);
	}
	/**
	 * Alternating merge method...
	 * 
	 * @author wesmaxwell
	 * @since 2017-10-12
	 * @param a
	 * @param b
	 * @return
	 */
	private static LinkedList<String> myMerge(LinkedList<String> a, LinkedList<String> b){
		LinkedList<String> c = new LinkedList<String>();
		
		for(int i = 0; i < a.size() || i < b.size(); i++) {
			if (i < a.size()) c.add(a.get(i));
			if (i < b.size()) c.add(b.get(i));
			
		}
		
		return c;
	}
}
