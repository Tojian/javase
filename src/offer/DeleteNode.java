package offer;



/**
 * @author taojian
 * @time  2017年4月5日下午7:04:40
 * @ClassName DeleteNode.java
 * @description 在O(1)时间删除链表结点
 */
class LinkNodeO{
	int value;
	LinkNodeO nodeNext;
	public LinkNodeO(int value) {
     this.value=value;
	}
}
public class DeleteNode {
	//头结点
		private LinkNodeO first;
		
	
	public void insertFirst(int value) {
		LinkNodeO node = new LinkNodeO(value);
		
		node.nodeNext = first;
		first = node;
	}
	
	
	public static void deleteNode(LinkNodeO linknode,int data){
		
	}
	
}
