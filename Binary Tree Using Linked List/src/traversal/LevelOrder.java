package traversal;

import java.util.LinkedList;
import java.util.Optional;

import node.Node;

public class LevelOrder {
	
	public void levelOrder(Node root)	{
		
		if(root == null)	System.out.println("root is blank");
		
		LinkedList<Node> dequeue = new LinkedList();
		
		dequeue.add(root);
		
		while(!dequeue.isEmpty())	{
			
			Node temp = dequeue.removeFirst();
			
			if(temp.getLeftNode()!=null)	dequeue.addLast(temp.getLeftNode());
			
			if(temp.getRightNode()!=null)dequeue.addLast(temp.getRightNode());
			System.out.print(temp.getValue()+" ");
		}
	}

}
