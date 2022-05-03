package com.bridgelabz;

/*
 * @author: Nikhil Deshnukh
 * Ability to create the binary tree
 */
public class MainBST {
	public static void main(String[] args) {
		System.out.println("Binary Search Tree");
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.add(22);
		tree.add(40);
		tree.add(11);
		tree.add(3);
		tree.add(16);
		tree.add(60);
		tree.add(95);
		tree.add(65);
		tree.add(63);
		tree.add(67);
		tree.print();

		int size = tree.getSize();
		System.out.println(size);
	}
}