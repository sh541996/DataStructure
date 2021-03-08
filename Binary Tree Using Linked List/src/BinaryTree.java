import java.util.Scanner;

import Search.Search;
import deleteNode.DeleteNode;
import insertion.InsertNode;
import node.Node;
import traversal.InOrder;
import traversal.LevelOrder;
import traversal.PostOrder;
import traversal.PreOrder;

public class BinaryTree {

	public static void main(String[] args) {
	
		// create a scanner to take input
		Scanner sc = new Scanner(System.in);
		
		// initialize root to null
		Node root = null;
		
		// again value which track your choice
		int again = 1;
		
		// while loop runs until user give value 1 else it breaks
		while(again==1)	{
			
			// choose operation from given options
			System.out.println("give your choice \n1. insert node \n2. levelorder traversal \n3. inorder traversal "
					+ "\n4. preorder traversal \n5. postorder traversal \n6. search the item \n7. delete node \n8. delete tree");
			
			// variable to choose operation from given list
			int choice;
			choice = sc.nextInt();
			
			switch(choice) {
				
				// for inserting node
				case(1) : {
					sc.nextLine();
					System.out.println("give value to insert using space ");
					
					String str = sc.nextLine();
					String []strArray = str.split(" ");
					
					for(String s : strArray) {
						InsertNode insert = new InsertNode();
						root = insert.insertNode(root, Integer.parseInt(s));
					}
					break;
				}
				
				// level order traversal
				case(2) : {
					
					new LevelOrder().levelOrder(root);
					System.out.println();
					break;
				}
				
				// Inorder Traversal
				case(3) : {
					new InOrder().inOrder(root);
					System.out.println();
					break;
				}
				
				// preorder traversal
				case(4) : {
					new PreOrder().preOrder(root);
					System.out.println();
					break;
				}
				
				// postorder traversal
				case(5) : {
					new PostOrder().postOrder(root);
					System.out.println();
					break;
				}
				
				// delete node 
				case(6) : {
					
					System.out.println("give value to search");
					int value = sc.nextInt();
					boolean isPresent = new Search().search(root,value);
					String res = isPresent?" ": " not ";
					System.out.println(value+" is"+res+"present");
				}
				
				// delete whole tree
				case(7)	:	{
					System.out.println("give value to delete");
					int value = sc.nextInt();
					new DeleteNode().deleteNode(root,value);
				}
				
				case (8)  :  {
					root = null;
					break;
				}
				
				default : {
					System.out.println("you insert wrong input");
				}
			}
			System.out.println("press 1 to continue or any key to exist");
			again = sc.nextInt();
		}
			
		
	}

}
