package deleteNode;
import java.util.LinkedList;

import Search.Search;
import node.Node;

public class DeleteNode {

	// find is node is present or not
	public void deleteNode(Node root, int value)	{
		
		boolean isPresent = new Search().search(root, value);
		
		if(!isPresent) System.out.println(value+" is not found");
		
		else replace(root, value);
	}
	
	// now replace the value of the node which wants to delete by value of deepest node
	public void replace(Node root, int value)	{
		
		LinkedList<Node> dequeue = new LinkedList();
		dequeue.add(root);
		Node deleteNode = null;
		Node temp = null;
		
		while(!dequeue.isEmpty())	{
			
			temp = dequeue.removeFirst();
			
			if(temp.getValue()==value) deleteNode = temp;
			
			if(temp.getLeftNode()!=null)	dequeue.addLast(temp.getLeftNode());
			
			if(temp.getRightNode()!=null)dequeue.addLast(temp.getRightNode());	
		}
		deleteNode.setValue(temp.getValue());
		delete(root, temp);
		System.out.println(value+" is deleted");
	}
	
	// this is used to delete deepest node
	public void delete(Node root, Node deepNode)	{
		
		LinkedList<Node> dequeue = new LinkedList();
		dequeue.add(root);
		Node temp;
		
		while(!dequeue.isEmpty())	{
				
				temp = dequeue.removeFirst();
				
				if(temp.getLeftNode()!=null)	{
					if(temp.getLeftNode()==deepNode) {
						temp.setLeftNode(null); 
						return;
					}
					dequeue.addLast(temp.getLeftNode());
				}
				
				if(temp.getRightNode()!=null)	{
					if(temp.getRightNode()==deepNode)	{
						temp.setRightNode(null);
						return;
					}
					dequeue.addLast(temp.getRightNode());
				}
		}
	}
}
