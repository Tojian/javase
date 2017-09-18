package tree;

import java.util.Stack;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午8:49:14
 * @ClassName FindPathForTree.java
 * @description 输入一个二叉树，和一个整数，找到所有根到叶子结点的路径，并打印出来
 */
public class FindPathForTree {

	
	public static void main(String[] args) {
		TreeNode root1=new TreeNode(); 
		TreeNode node1=new TreeNode();
		
		  TreeNode node2=new TreeNode(); 
		  TreeNode node3=new TreeNode(); 
		  TreeNode node4=new TreeNode(); 
		  root1.leftNode=node1; 
		  root1.rightNode=node2; 
		  node1.leftNode=node3; 
		  node1.rightNode=node4; 
		  root1.data=10; 
		  node1.data=5; 
		  node2.data=12; 
		  node3.data=4; 
		  node4.data=7; 
		  FindPathForTree testFindPath=new FindPathForTree(); 
		  testFindPath.findPath(root1, 22);     
	}
	
	public  void  findPath(TreeNode root,int sum){
		if(root==null)
			return ;
		
		Stack<Integer> stack=new Stack<>();
		
		int currentsum=0;
		
		findPath(root,sum,stack,currentsum);	}

	private void findPath(TreeNode root, int sum, Stack<Integer> stack, int currentsum) {
		currentsum+=root.data;
		
		stack.push(root.data);
		
		if(root.leftNode==null&&root.rightNode==null){
			if(currentsum==sum){
				System.out.println("找到一个路径");
				for(int path:stack){
					System.out.print(path+" ");
				}
				System.out.println();
			}
		}
		if(root.leftNode!=null){
			findPath(root.leftNode,sum,stack,currentsum);
		}
		
		if(root.rightNode!=null){
			findPath(root.rightNode,sum,stack,currentsum);
		}
	}
}
