package traversal;

import node.Node;

public class InOrder {
	
	public void inOrder(Node root)	{
		if(root==null)	return;
		else {
			inOrder(root.getLeftNode());
			System.out.print(root.getValue()+" ");
			inOrder(root.getRightNode());
		}
	}

}
