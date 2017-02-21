package util;

import Collection.List;
import Collection.Concrete.ArrayList;
import Collection.Concrete.LinkedList;
import junit.framework.TestCase;


public class TestUtil<E> extends TestCase {
	
	public static void addIntWithNatureOrder(List<Integer> myList, int num) {
		
		int expected = Integer.MAX_VALUE - 100;
		for (int acutal = 0; acutal < num ; acutal++) {
			myList.add(acutal);
			expected = myList.get(acutal);
		}
	}
	
	public static void testAddIntWithNatureOrder(List<Integer> myList, int num) {
		addIntWithNatureOrder(myList, num);
	}
	
	public static void addString(List<String> myList, int num) {
		
		String actual;
		String expected = Integer.MAX_VALUE - 100 + "";
		for (int index = 0; index < num ; index++) {
			actual = index + "";
			myList.add(actual);
			expected = myList.get(index);	
			assertEquals(actual,expected);
		}
	}
	
	public static <E> void testRemoveAndGetFromTail(ArrayList<E> myList) {
		E get;
		E remove;
		for(int i = myList.size()-1; i >= 0; i--) {
			get = myList.get(i);
			remove = myList.remove(i);
			assertEquals(get,remove);
		}
	}
	
	public static <E> void testRemoveAndGetFromTail(LinkedList<E> myList) {
		E get;
		E remove;
		for(int i = myList.size()-1; i >= 0; i--) {
			get = myList.get(i);
			remove = myList.remove(i);
			assertEquals(get,remove);
		}
	}
	



}
