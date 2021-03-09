package traversal;

public class LevelOrder {

	public void levelOrder(int[] node, int lastUsedIndex) {
		
		if(lastUsedIndex==0) System.out.print("tree is empty");
		
		for(int i=1; i<=lastUsedIndex; i++)	System.out.print(node[i]+" ");		
		
	}
}
