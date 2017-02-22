package TestCollection;

import static util.TestUtil.*;

import java.util.Set;
import java.util.TreeSet;

import static util.Print.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Collection.Concrete.BinaryTreeNode;
import junit.framework.TestCase;

public class BinaryTreeNodeTest extends TestCase {

	BinaryTreeNode<Integer> myTree;
	
	@Before
	public void setUp() throws Exception {
		myTree = new BinaryTreeNode<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		myTree = null;
	}

	@Test
	public void testInsert() {

		Set<Integer> expected =  new TreeSet<Integer>();
		int size = getRandomNumber();
		int j = 0 ;
		while (expected.size() != size) {
			j = getRandomNumber();
			expected.add(j);
			myTree.insert(j);
		}
		
		assertEquals(size,myTree.size());
		assertEquals(expected.toString(),myTree.toString());
		println(expected);
		println(myTree);
	}

	
	public void testSize() {
		
		for (int i = 0; i < 10; i++) {
			myTree.insert(18);
			myTree.insert(-19);
			myTree.insert(1);
			myTree.insert(0);
			assertEquals(4,myTree.size());
		}	
	}
}