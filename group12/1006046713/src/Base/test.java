package Base;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class test {

	public static void main(String[] args) {
           //Object[] data=new Object[10];
	// List<String> data=new ArrayList<String>();
	  //data.add(1,"ceshi");
           //for(int i=0;i<data.size();i++){
        	 //  System.out.print(data.get(0)+",");   
         //  }
		/*
		 * ArrayList list=new ArrayList();
             list.add("a");
            list.add("c");
            list.add("d");
            list.add("e");
            list.remove(3);
            for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            }
            
         
       for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            }
            */
		   //java.util.LinkedList list=new  LinkedList();
		   //list.add(2,"lianbiao");
	      LinkedList linklist=new LinkedList();
		   linklist.add("ÖæË¹");
		   linklist.add("°¢²¨ÂÞ");
		  linklist.add(0,"²âÊÔ");
		 linklist.add(1,"²âÊÔ1");
		  linklist.add(4,"²âÊÔ2");
		linklist.remove(4);
		  //System.out.print(linklist.size());
		  for(int i=0;i<linklist.size();i++){
	           System.out.print(linklist.get(i)+",");
	       }
	}
		  
	

}
