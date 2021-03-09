package traversal;

public class InOrder {

	public void inOrder(int[] node, int lastUsedIndex, int index) {
		if(lastUsedIndex==0)	{
			System.out.println("tree is empty");
			return;
		}
		
		if(index>lastUsedIndex)	return;
		
		inOrder(node, lastUsedIndex, index*2);
		System.out.print(node[index]+" ");
		inOrder(node, lastUsedIndex, index*2+1);
		
	}

}
