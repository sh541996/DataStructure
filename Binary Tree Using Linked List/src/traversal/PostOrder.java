package traversal;

import node.Node;

public class PostOrder {
	
	public void postOrder(Node root)	{
		
		if(root==null)	return;
		
		else {
			postOrder(root.getLeftNode());
			postOrder(root.getRightNode());
			System.out.print(root.getValue()+" ");
		}
	}
}
