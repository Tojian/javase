package offer;



/**
 * 
 * @author taojian
 * @time  2017年3月31日上午9:57:23
 * @ClassName Test03.java
 * @description 链表
 */
class LinkNode{
	int data;
	LinkNode pnext;
	public LinkNode(int data) {
		this.data=data;
	}
	public LinkNode() {
		
	}
}
public class Test03 {
	private LinkNode first=null;
	public static void printListReversing(LinkNode phead){
		if(phead!=null){
			if(phead.pnext!=null){
				 printListReversing(phead.pnext);
				 }
			System.out.println(phead.data);
		}
	} 
	/**
	 * 插入一个结点，在头结点后进行插入
	 */
	public void insertFirst(int value) {
		LinkNode node = new LinkNode(value);
		node.pnext = first;
		first = node;
	}
	
	public static void main(String[] args) {
		Test03 linklist=new Test03();
		linklist.insertFirst(3);
		linklist.insertFirst(4);
		linklist.insertFirst(5);
		linklist.insertFirst(6);
		linklist.insertFirst(7);
		linklist.insertFirst(8);
		printListReversing(linklist.first);
	}
}
