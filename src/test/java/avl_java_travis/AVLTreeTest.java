package test.java.avl_java_travis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.avl_java_travis.AVLTree;

public class AVLTreeTest {

	@Test
	public void testFind() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 10, 20, 30, 40, 50, 25 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		assertEquals(tree.find(60), null);
	}

	@Test
	public void testFind2() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 11, 22, 33, 44, 55, 26 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		assertEquals(tree.find(80), null);
	}

	@Test
	public void testFind3() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 9, 19, 29, 39, 49, 24 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		assertNotNull(tree.find(9));

	}

	@Test
	public void testRoot() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 100, 200, 300, 400, 500, 250 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		assertEquals(tree.getRoot(), tree.find(300));
	}

	@Test
	public void testTreeHeight() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 1000, 2000, 3000, 4000, 5000, 2500 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}

		assertEquals(tree.height(), 2);
	}

	@Test
	public void testTreeInsert() {

		AVLTree tree = new AVLTree();
		tree.insert(5);

		assertNotNull(tree.find(5));
	}

	@Test
	public void testTreeInsert2() {

		AVLTree tree = new AVLTree();
		tree.insert(5);

		assertEquals(tree.find(10), null);
	}

	@Test
	public void testTreeDelete() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 10, 20, 30, 40, 50, 25 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		tree.delete(10);
		assertEquals(tree.find(10), null);
	}

	@Test
	public void testTreeDelete2() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 1032, 2032, 3032, 4032, 5032, 2532 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}
		tree.delete(33);
		assertEquals(tree.find(33), null);
	}

	@Test
	public void testTreeBalance() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 120, 220, 320, 420, 520, 250 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}

		assertEquals(tree.getBalance(tree.find(30)), 0);
	}

	@Test
	public void testTreeBalance2() {
		// this array in this order allows to pass in all branches
		// of the insertion algorithm
		int[] array = { 110, 220, 330, 440, 550, 250 };
		AVLTree tree = new AVLTree();

		for (int i = 0; i < array.length; i++) {
			tree.insert(array[i]);
		}

		assertEquals(tree.getBalance(tree.find(60)), 0);
	}

}