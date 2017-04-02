package offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {  
    Node left = null;  
    Node right = null;  
    int value;  
}  
public class BinaryTreeBuilder {  
    
    public static Node buildTree(int[] preOrder, int start,  
            int[] inOrder, int end, int length) {  
  
        if (preOrder == null || preOrder.length == 0 || inOrder == null  
                || inOrder.length == 0 || length <= 0) {  
            return null;  
        }  
          

        int value = preOrder[start];  
        Node root = new Node();  
        root.value = value;  
          
  
        if (length == 1)  
            return root;  
          

        int i = 0;  
        while (i < length) {  
            if (value == inOrder[end - i]) {  
                break;  
            }  
            i++;  
        }  
          
      
        root.left = buildTree(preOrder, start + 1, inOrder, end - i - 1, length - 1 - i);  
 
        root.right = buildTree(preOrder, start + length - i, inOrder, end, i );  
          
        return root;  
    }  
    

    public static void levelSelectTree(Node root){
    	if(root==null)return ;
    	Queue<Node> queue=new LinkedList<>();
    	queue.add(root);
    	while(queue.size()!=0){
    		int len=queue.size();
    		for(int i=0;i<len;i++){
    			Node temp=queue.poll();
    			System.out.print(temp.value+" ");
    			
    			if(temp.left!=null)
    				queue.add(temp.left);
    			if(temp.right!=null)
    				queue.add(temp.right);
    		}
    	}
    }
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int []preOrder=new int[n];
    	int []inOrder=new int[n];
    	for(int i=0;i<n;i++)
    		preOrder[i]=sc.nextInt();
    	for(int i=0;i<n;i++)
    		inOrder[i]=sc.nextInt();
        Node root = buildTree(preOrder, 0, inOrder, inOrder.length - 1, inOrder.length);  
        levelSelectTree(root);
      
    }  
}  