package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午8:30:27
 * @ClassName BinaryTreePrintFromTopToButtom.java
 * @description 层次遍历
 */
public class BinaryTreePrintFromTopToButtom {

	
	
	public void printFromTopBottom(TreeNode root){
		if(root==null){
			return;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){ 
			  TreeNode node=queue.poll(); 
			  System.out.print(node.data); 
			  if(node.leftNode!=null){ 
			    queue.add(node.leftNode); 
			  } 
			  if(node.rightNode!=null){ 
			    queue.add(node.rightNode); 
			  } 
			} 
	}
	public static void main(String[] args) {
		TreeNode root1=new TreeNode(); 
		TreeNode node1=new TreeNode(); 
		TreeNode node2=new TreeNode(); 
		TreeNode node3=new TreeNode(); 
		TreeNode node4=new TreeNode(); 
		TreeNode node5=new TreeNode(); 
		TreeNode node6=new TreeNode(); 
		  root1.leftNode=node1; 
		  root1.rightNode=node2; 
		  node1.leftNode=node3; 
		  node1.rightNode=node4; 
		  node4.leftNode=node5; 
		  node4.rightNode=node6; 
		  root1.data=8; 
		  node1.data=8; 
		  node2.data=7; 
		  node3.data=9; 
		  node4.data=2; 
		  node5.data=4; 
		  node6.data=7; 
		  BinaryTreePrintFromTopToButtom test=new BinaryTreePrintFromTopToButtom(); 
		  test.printFromTopBottom(root1); 
	}
}
