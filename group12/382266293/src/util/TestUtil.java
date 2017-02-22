package util;

import java.util.Random;

import Collection.List;
import Collection.Concrete.ArrayList;
import Collection.Concrete.LinkedList;
import Collection.Concrete.Queue;
import Collection.Concrete.Stack;
import junit.framework.TestCase;


public class TestUtil<E> extends TestCase {
	
	private static Random rnd = new Random();
	private static final int RANDOM_BOUND = 2<<15;
	private static final int SIZE_BOUND = 500;
	
	
	public static int getRandomNumber() {
		return rnd.nextInt(SIZE_BOUND);
	}
	
	public static void addIntWithNatureOrder(List<Integer> myList, int numbers) {
		
		int expected = Integer.MAX_VALUE - 100;
		for (int acutal = 0; acutal < numbers ; acutal++) {
			myList.add(acutal);
		}
	}
	
	public static int[] addRandomInt(List<Integer> myList, int numbers) {
		
		int actual = 0;
		int expected = Integer.MAX_VALUE - 100;
		int[] result = new int[numbers];
		for (int i = 0; i < numbers ; i++) {
			actual = rnd.nextInt(RANDOM_BOUND);
			result[i] = actual;
			myList.add(actual);
		}
		return result;
	}

	public static void addString(List<String> myList, int num) {
		
		String actual;
		for (int index = 0; index < num ; index++) {
			actual = index + "";
			myList.add(actual);
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
	
	public static <E> void pushIntWithNatureOrder(Stack<Integer> myStack, int numbers) {
		for (int i = 0; i < numbers; i++) {
			myStack.push(i);
		}
	}
		
	public static <E> void popNumTimes(Stack<E> myStack, int num) {
		for (int i = 0; i < num; i++) {
			myStack.pop();
		}
	}
	
	public static <E> void enQueueIntWithNatureOrder(Queue<Integer> myQueue, int numbers) {
		for (int i = 0; i < numbers; i++) {
			myQueue.enQueue(i);
		}
	}
	
	public static <E> void popNumTimes(Queue<Integer> myQueue, int num) {
		for (int i = 0; i < num; i++) {
			myQueue.deQueue();
		}
	}
	



}
