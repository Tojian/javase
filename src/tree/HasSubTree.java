package tree;

public class HasSubTree {
	public static void main(String args[]) 
	{ 
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
	  TreeNode root2=new TreeNode(); 
	  TreeNode a=new TreeNode(); 
	  TreeNode b=new TreeNode(); 
	  root2.leftNode=a; 
	  root2.rightNode=b; 
	  root2.data=8; 
	  a.data=9; 
	  b.data=2; 
	  HasSubTree hst=new HasSubTree(); 
	  System.out.println(hst.hasSubTree(root1, root2)); 
	} 
	 public boolean hasSubTree(TreeNode root1,TreeNode root2){ 
	  boolean result=false; 
	  if(root1!=null&&root2!=null){ 
		    if(root1.data==root2.data){ 
		        result=doesTree1HavaTree2(root1,root2); 
		        if(!result) 
		          result=hasSubTree(root1.leftNode, root2); 
		           if(!result) 
		             result=hasSubTree(root1.rightNode, root2); 
		      }   
		      }   
		     return result;  
		    } 
		  private boolean doesTree1HavaTree2(TreeNode root1, TreeNode root2) { 
		    if(root2==null){ 
		      return true; 
		    }else if(root1==null) 
		      return false; 
		    if(root1.data!=root2.data){ 
		      return false; 
		    } 
		    return doesTree1HavaTree2(root1.leftNode, root2.leftNode)&& 
		        doesTree1HavaTree2(root1.rightNode, root2.rightNode); 
		  } 
		  
	  
}
