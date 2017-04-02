package offer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
class Ladder {  
    String word;  
    Ladder prev;  
    Ladder(String word, Ladder prev) {  
        this.word = word;  
        this.prev = prev;  
    }  
}
public class Solution { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String beginWord=sc.nextLine();
		String endWord=sc.nextLine();
		
		Set<String> set=new HashSet<>();
		while(sc.hasNext()){
			set.add(sc.nextLine());
		}
		findLadders(beginWord, endWord, set);
	}
    private static List<List<String>> find(List<Ladder> ladders, String endWord, Set<String> wordList) {  
        List<List<String>> results = new ArrayList<>();  
        for(Ladder ladder : ladders) {  
            if (ladder.word.equals(endWord)) {  
                List<String> result = new ArrayList<>();  
                while (ladder != null) {  
                    result.add(0, ladder.word);  
                    ladder = ladder.prev;  
                }  
                results.add(result);  
            }  
        }  
        if (!results.isEmpty()) return results;  
          
        List<Ladder> nexts = new ArrayList<>();  
        for(Ladder ladder : ladders) {  
            char[] la = ladder.word.toCharArray();  
            for(int i=0; i<la.length; i++) {  
                char origin = la[i];  
                for(char ch = 'a'; ch <= 'z'; ch ++) {  
                    if (ch == origin) continue;  
                    la[i] = ch;  
                    String s = new String(la);  
                    if (wordList.contains(s)) nexts.add(new Ladder(s, ladder));  
                }  
                la[i] = origin;  
            }  
        }  
        if (nexts.isEmpty()) return new ArrayList<>();  
        for(Ladder ladder : nexts) wordList.remove(ladder.word);  
        return find(nexts, endWord, wordList);  
    }  
    public static List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {  
        wordList.remove(beginWord);  
        List<Ladder> ladders = new ArrayList<>();  
        ladders.add(new Ladder(beginWord, null));  
        return find(ladders, endWord, wordList);  
    }  
    
  
}  
  