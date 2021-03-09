package insert;

public class InsertNode {

	public int insert(int[] node, int lastUsedIndex, int value)	{
		
		if(lastUsedIndex==(node.length)-1) System.out.println("array is already full");
		
		else {
			node[++lastUsedIndex] = value;
		}
		
		return lastUsedIndex;
	}
}
