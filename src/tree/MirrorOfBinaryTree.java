package tree;

import java.util.Stack;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午7:19:16
 * @ClassName MirrorOfBinaryTree.java
 * @description 二叉树的镜像
 */
public class MirrorOfBinaryTree {

	
	public TreeNode mirrorBinaryTree(TreeNode root){
		if(root==null)
			return null;
		if(root.leftNode==null&&root.rightNode==null)
			return null;
		
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(root!=null||stack.isEmpty()){
			while(root!=null){
				TreeNode temp=root.leftNode;
				root.leftNode=root.rightNode;
				root.rightNode=temp;
				stack.push(root);
				root=root.leftNode;
			}
			root=stack.pop();
			root=root.rightNode;
		}
		return root;
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
		  MirrorOfBinaryTree mobt=new MirrorOfBinaryTree(); 
		  TreeNode rootTreeNode=mobt.mirrorBinaryTree(root1); 
		 System.out.println(root1.rightNode.data); 
	}
}
