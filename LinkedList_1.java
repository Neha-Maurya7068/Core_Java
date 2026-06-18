package our_list;

import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.addFirst(12);
		list.addLast(50);

//		list.remove(3);
//		list.removeFirst();

//		list.removeLast();

//		System.out.println(list.get(0));
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());

//		System.out.println(list.size());

//		System.out.println(list.contains(4));
//		list.clear();

//		System.out.println(list);

		LinkedList<Integer> list2 = new LinkedList<>();

		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);

//		System.out.println(list2);

//		list.addAll(list2);

//		list.addAll(2, list2);

//		System.out.println(list);

//		Queue *****  FIFO

//		System.out.println(list.size());
//		
//		System.out.println(list.poll());
//		
//		System.out.println(list.size());
//		
//		System.out.println(list.peek());
//		
//		System.out.println(list.size());

//		list.offer(90);
//		list.offer(112);
//		list.offerFirst(22);
//		list.offerLast(89);
//		
//		System.out.println(list);

		// Deque ***************

		list.addFirst(144);
		list.addLast(890);

//		System.out.println(list);

//		System.out.println(list.removeFirst());
//		
//		System.out.println(list.removeLast());

//		System.out.println(list.peekFirst());
//		System.out.println(list.peekLast());

//		System.out.println(list.poll());

//		System.out.println(list.pollFirst());
//		System.out.println(list.pollLast());

//		list.addAll(list2);
//		
//		list.removeAll(list2);

		System.out.println(list);

	}

}
