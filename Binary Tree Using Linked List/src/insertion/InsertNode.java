package insertion ;

import java.util.LinkedList;

import node.Node;

public class InsertNode {
	
	public Node insertNode(Node root, int value) {
		
		Node node = new Node(value);
		
		if(root == null) return node;
		
		LinkedList<Node> dequeue = new LinkedList();
		
		dequeue.add(root);
		
		while(!dequeue.isEmpty())	{
			
			Node temp = dequeue.removeFirst();
			
			if(temp.getLeftNode()==null) {
				temp.setLeftNode(node);
				return root;
			}
			else dequeue.addLast(temp.getLeftNode());
			
			if(temp.getRightNode()==null) {
				temp.setRightNode(node);
				return root;
			}
			else dequeue.addLast(temp.getRightNode());
			
		}
		
		return root;
		
		
	}
}
