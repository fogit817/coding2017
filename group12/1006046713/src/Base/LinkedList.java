package Base;
public class LinkedList  implements List{
	private Node head;//首节点
	private Node last; //尾节点
	int size;
	public LinkedList(){
	};
	/**
	 * LinkedList尾部追加
	 */
	@Override
	public void add(Object o) {
		Node l=last;
		Node node=new Node(l,o,null);
		last=node;
		if(l!=null){
			l.next=node;
		}else{
			head=node;
		}
	}
/**
 * add by index
 */
	@Override
	public void add(int index, Object o) {
		size=size();
		int i=0;
		Node before=null;
		if(index>size){
			throw new IndexOutOfBoundsException();
		}else if(index==0){
			if(head!=null){
				Node newNode=new Node(null,o,head);
				head.pre=newNode;
				head=newNode;
			}else{
				add(o);
			}
		}else if(index==size){
			   add(o);
		}else{
			before=head.next;
			 while(true){
				 i++;
				if(i==index){
					Node newNode=new Node(before.pre,o,before);
					before.pre.next=newNode;
					before.pre=newNode;
					break;
				}
				before=before.next;
			}
			
		}
	}
/*
 * (non-Javadoc)find by index
 * @see Base.List#get(int)
 */
	@Override
	public Object get(int index) {
		 size=size();
		 Node before=head.next;
         Node returnNode=null;
		 if(index>size){
			     throw new IndexOutOfBoundsException();
		 }else if(index==0){
			    returnNode=head;
		 }else if(index==size-1){
			   returnNode=last;
		 }else{
	         int i=0;
	         while(true){
	        	 returnNode=before;
	        	 i++;
	        	 before=before.next;
	        	 if(i==index){
	        		 break;
	        	 }
	         }
		 }
		return returnNode.data;
	}

	/**
	 *remove by index 
	 */
	@Override
	public void remove(int index) {
		size=size();
		Node before=head.next;//head:0 head.next:1
		int i=0;
		if(index>=size){
			throw new IndexOutOfBoundsException();
		}else if(index==0){
			removeFirst();
		}else if(index==size-1){
			removeLast();
		}else{
			while(true){
				i++;
				if(i==index){
					before.pre.next=before.next;
				    break;
				}
				before=before.next;
			}
		}
	}
	/**
	 * length of LinkedList 
	 * nc return size 即可
	 * @return
	 */
   public int size(){
	   int size=0;
	   Node before=head;
	   if(before==null){
		   return size;
	   }
	   while(true){
		     size++;
			 before= before.next;
		     if(before==null){
		    	 break;
		     }
	   }
	   return size;
   }
   
   /**
    * 头部添加
    * @param o
    */
	public void addFirst(Object o){
	             add(0,o);	
	}
	
	/**
	 * 尾部添加
	 * @param o
	 */
	public void addLast(Object o){
		       add(o);
	}
	
	/**
	 * 移除Linkeklist头部
	 * @return what?
	 */
	public Object removeFirst(){
		head=head.next;
		head.pre=null;
		return head;
	}
	
	/**
	 * 移除LinkedList尾部
	 * @return what?
	 */
	public Object removeLast(){
		last=last.pre;
		last.next=null;
		return last;
	}
	
	/*
	 * 内部类不与引用绑定
	 */
	private static class Node{
		Object data;
		Node next;
		Node pre;
		Node(Node pre,Object o,Node next){
			this.data=o;
			this.next=next;
			this.pre=pre;
		}
	}
}
