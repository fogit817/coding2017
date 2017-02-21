package TestCollection;

import static util.Print.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Collection.Concrete.BinaryTreeNode;
import javafx.application.Preloader;
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
		Random random = new Random(47);
		Set<Integer> expected =  new TreeSet<Integer>();
		int size = 10;
		int j;
		while (expected.size() != size) {
			j = random.nextInt(100);
			expected.add(j);
			
		}
		println(expected);
		

		myTree.insert(5);
		myTree.insert(8);
		myTree.insert(3);
		myTree.insert(9);
		myTree.insert(0);
		myTree.insert(4);
		myTree.insert(18);
		myTree.insert(1);
		
		myTree.preOrder(myTree);

		

	}

}
