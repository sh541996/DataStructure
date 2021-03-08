package traversal;

import node.Node;

public class PreOrder {
	
	public void preOrder(Node root)	{
		if(root==null)	return;
		else {
			System.out.print(root.getValue()+" ");
			preOrder(root.getLeftNode());			
			preOrder(root.getRightNode());
		}
	}

}
