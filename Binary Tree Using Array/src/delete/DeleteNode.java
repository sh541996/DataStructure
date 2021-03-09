package delete;

public class DeleteNode {

	public int deleteNode(int[] node, int lastUsedIndex, int value) {
		
		if(lastUsedIndex==0) {
			System.out.println(value+" is not found");
			return lastUsedIndex;
		}
		
		int temp = 0;
		for(int i=0; i<=lastUsedIndex; i++) {
			if(node[i]==value)	{
				node[i]=node[lastUsedIndex];
				System.out.println(value+" is successfully deleted");
				return --lastUsedIndex;
				
			}
		}
		
		System.out.println(value+" is not found");
		return lastUsedIndex;
		
	}
}
