package traversal;

public class PreOrder {

	public void preOrder(int[] node, int lastUsedIndex, int index) {
		if(lastUsedIndex==0)	{
			System.out.println("tree is empty");
			return;
		}
		
		if(index>lastUsedIndex)	return;
		
		System.out.print(node[index]+" ");
		preOrder(node, lastUsedIndex, index*2);
		preOrder(node, lastUsedIndex, index*2+1);		
	}

}
