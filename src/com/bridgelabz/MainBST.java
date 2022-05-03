package com.bridgelabz;
/*
 * @author: Nikhil Deshnukh
 * Ability to create a BST by adding 56 and then adding 30 & 70
 */
public class MainBST {
	public static void main(String[] args) {
		System.out.println("Binary Search Tree");
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.print();
	}
}