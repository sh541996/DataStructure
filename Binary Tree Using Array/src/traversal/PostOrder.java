package traversal;

public class PostOrder {

	public void postOrder(int[] node, int lastUsedIndex, int index) {
		if(lastUsedIndex==0)	{
			System.out.println("tree is empty");
			return;
		}
		
		if(index>lastUsedIndex)	return;
		
		postOrder(node, lastUsedIndex, index*2);
		postOrder(node, lastUsedIndex, index*2+1);
		System.out.print(node[index]+" ");
		
	}

}
