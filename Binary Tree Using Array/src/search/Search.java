package search;

public class Search {

	public boolean search(int[] node, int lastUsedIndex, int value) {
		
		if(lastUsedIndex==0) return false;
		
		for(int i=1; i<=lastUsedIndex; i++)	{
			if(node[i]==value) return true;
		}
		return false;
	}

}
