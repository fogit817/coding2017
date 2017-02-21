package TestCollection;

import static util.Print.*;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

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
		Random random = new Random();
		Set<Integer> expected =  new TreeSet<Integer>();
		int size = 50;
		int j = 0 ;
		while (expected.size() != size) {
			j = random.nextInt(200);
			expected.add(j);
			myTree.insert(j);
		}
		
		assertEquals(size,myTree.size());
		assertEquals(expected,myTree.preOrderTranverse(myTree));
	}
	
	public void testSize() {
		
		for (int i = 0; i < 10; i++) {
			myTree.insert(18);
			myTree.insert(-19);
			myTree.insert(1);
			assertEquals(3,myTree.size());
		}	
	}
}