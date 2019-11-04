
public class tries {
	private TrieNode root;
	
	public tries(){
		root = new TrieNode();
	}
	
	private class TrieNode {
		private TrieNode[] children;
		boolean isWord;
		
		public TrieNode() {
			this.children=new TrieNode[26];//because alphabets 
			this.isWord=false;
		}
	}
	
	public void InsertWord(String word) {
		if(word==null||word.isEmpty()) {
			  throw new IllegalArgumentException("Invalid input");
		}
		word=word.toLowerCase();
		TrieNode current=root;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			int index=c-'a';
			if(current.children[index]==null) {
				TrieNode node=new TrieNode();
				current.children[index]=node;
				current=node;
			}else {
				current=current.children[index];
			}
		}
		current.isWord=true;
	}
	public boolean Search(String word) {
		
		
		return false;
	}
	
	public static void main(String args[]) {
		tries t=new tries();
		t.InsertWord("word");
		t.InsertWord("work");
		
		
	}
}
