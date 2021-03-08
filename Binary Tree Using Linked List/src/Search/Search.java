package Search;
import java.util.LinkedList;

import node.Node;

public class Search {
	
	public boolean search(Node root, int value)	{
		
		if(root == null)	{
			System.out.println("root is blank");
			return false;
		}
		
		LinkedList<Node> dequeue = new LinkedList();
		dequeue.add(root);
		
		while(!dequeue.isEmpty())	{
			
			Node temp = dequeue.removeFirst();
			
			if(temp.getValue()==value) return true;
			
			if(temp.getLeftNode()!=null)	dequeue.addLast(temp.getLeftNode());
			
			if(temp.getRightNode()!=null)dequeue.addLast(temp.getRightNode());
			
		}
		
		return false;
	}

}
