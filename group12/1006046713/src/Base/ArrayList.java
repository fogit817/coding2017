package Base;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class ArrayList  implements List{
     private int size;
     private Object[] data;
     public  ArrayList(){
    	  data=new Object[10]; 
     }
     /**
      * ArrayList末尾追加元素
      * @param o
      */
	@Override
	public void add(Object o) {
		    size=size();
		    if(size<data.length){
		    	for(int j=0;j<data.length;j++){
		    		if(null==data[j]){
		    			data[j]=o;
		    			break;
		    		}
		    	}
		    }else{
		    	Arrays.copyOf(data, data.length+1);
		    	data[data.length+1]=o;
		    }
	}
	/**
	 * insert by index
	 * 插入元素在下标对应元素之前
	 * @param index
	 * @param o
	 */
	@Override
	public void add(int index, Object o) {
             size=size();//length of ArrayList
         	if(index>size){
        		throw new IndexOutOfBoundsException();
        	}else if(index==0){
        		 Object[] tempData=new Object[data.length+1];
        		 tempData[0]=o;
        		 System.arraycopy(data, 0, tempData, 1, data.length);
        		 data=tempData;
        	}else{
        		Object[] tempData=new Object[data.length+1];
        		System.arraycopy(data, index, tempData, index+1, data.length-index);
        		Object[] otherData=new Object[index];
        		otherData=Arrays.copyOf(data, index);
        		System.arraycopy(otherData, 0, tempData, 0, otherData.length);
        		data=tempData;
        		data[index]=o;
        	}
            
             
	}
	@Override
	public Object get(int index) {
		size=size();
		if(index>size){
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}
	@Override
	public void remove(int index) {
		size=size(); 
		if(index>size){
			throw new IndexOutOfBoundsException();
		}else if(index==size){
			Object[] temp=null;
			temp=Arrays.copyOf(data, data.length-1);
		}else{
			Object[] tempData=null; 
			tempData=Arrays.copyOf(data, data.length-1);
			System.arraycopy(data, index+1, tempData, index, data.length-index-1);
			data=tempData;
		}
		
	}
	/**
	 * ArrayList长度
	 * @return size
	 */
	
     public int size(){
    	 size=0;
	     for(int i=0;i<data.length;i++){
	    	 if(null!=data[i]){
	    		 size++; 
	    	 }
	     }
    	 return size;
     }
     @Test
     public void text1(){
    	 
     }
}
