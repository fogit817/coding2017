package TestCollection;

import static util.Print.*;
import static util.TestUtil.*;
import java.util.Date;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Collection.Iterator;
import Collection.List;
import Collection.Concrete.ArrayList;
import junit.framework.TestCase;

public class ArrayListTest extends TestCase {


	private ArrayList<Integer> myAL;
	
	@Before
	public void setUp() throws Exception {
		
		myAL = new ArrayList<Integer>();
		assertEquals(true,myAL.isEmpty());
		
	}

	@After
	public void tearDown() throws Exception {
		myAL = null;
	}

	@Test
	public void testRawTypeArrayList() {
		
		List rawList = new ArrayList();
		assertEquals(rawList.size(), 0);
		rawList.add(new Date());
		assertEquals(1, rawList.size());
		rawList.add(5);
		rawList.add("ABC");
		rawList.add('f');
	}

	@Test
	public void testEmpty() {
		
		assertEquals(true,myAL.isEmpty());
		
		myAL.add(getRandomNumber());
		assertEquals(false,myAL.isEmpty());
		
	}

	@Test
	public void testAddWithIndex() {
		
		int size = getRandomNumber();
		addIntWithNatureOrder(myAL, size);
		int actual = 0;
		
		for (int i = 0; i < size; i++) {
			myAL.add(i,-1*i);
			actual = myAL.get(i);
			assertEquals(-1*i, actual);
		}

	}
	
	@Test
	public void testGet() {
		
		int[] result = addRandomInt(myAL, getRandomNumber());
		
		int actual,expected;
		
		for (int i = 0; i < result.length; i++) {
			actual = myAL.get(i);
			expected = result[i];
			assertEquals(expected, actual);
		}

	}

	@Test
	public void testRemove() {

		addIntWithNatureOrder(myAL, getRandomNumber());
		
		testRemoveAndGetFromTail(myAL);

	}

	@Test
	public void testSize() {
		
		assertEquals(0,myAL.size());
		int num = getRandomNumber();
		addRandomInt(myAL, num);
		assertEquals(num,myAL.size());
	}


	
	@Test
	public void testGrow() {
		
		int actualSize = 3;
		
		addIntWithNatureOrder(myAL, actualSize);
		assertEquals(actualSize,myAL.size());
	}
	

	@Test
	public void testIterator() {
		
		addIntWithNatureOrder(myAL,getRandomNumber());

		Iterator<Integer> it = myAL.iterator();

		for(int i = 0; it.hasNext(); i++){
			int actual = it.next();
			assertEquals(i,actual);
		}
		
		boolean reachedException = false;
		
	    try {
			it.next();
	    } catch (NoSuchElementException ex) {
	    	reachedException = true;
	        assertEquals(ex.getClass(),NoSuchElementException.class);
	    }
	    
	    assertEquals(true, reachedException);
	    
	}
	
	@Test
	public void testIndexOf() {
		
		int size = getRandomNumber();
		addIntWithNatureOrder(myAL,size);

		int expected,actual;
		for (int i = 0; i < myAL.size(); i++) {
			expected = i;
			actual = myAL.indexOf(i);
			assertEquals(expected, actual);
		}

	}

}
