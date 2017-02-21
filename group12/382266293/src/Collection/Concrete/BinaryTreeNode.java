package Collection.Concrete;

import java.util.HashSet;
import java.util.Set;

public class BinaryTreeNode<E extends Comparable<E>> {
	
	private E data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	private int size;
	private static Set mySet = new HashSet();
	
	
	public BinaryTreeNode() {
		this.data = null;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTreeNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
    public boolean isEmpty() {
        return data == null;
    }

    public int size() {
        return size;
    }

    public BinaryTreeNode<E> insert(E o) {
        BinaryTreeNode<E> res;
        if (isEmpty()) {
            data = o;
            size++;
            return this;
        } else {
            BinaryTreeNode<E> p = this;
            res = new BinaryTreeNode<E>(o);
            while (true) {
                if (res.getData().compareTo(p.getData()) < 0) {
                    if (p.left == null) {
                        p.setLeft(res);
                        break;
                    }
                    p = p.left;
                } else if (res.getData().compareTo(p.getData()) > 0) {
                    if (p.right == null) {
                        p.setRight(res);
                        break;
                    }
                    p = p.right;
                } else {
                	return null;
                }
            }
            size++;
        }
        return res;
    }
    
    

    public Set<E> preOrderTranverse(BinaryTreeNode<E> node) {
        if (node != null) {
        	preOrderTranverse(node.left);
        	mySet.add(node.data);
            preOrderTranverse(node.right);
        }
        return mySet;
    }

	@Override
	public String toString() {
		preOrderTranverse(this);
		return mySet.toString();
	}

	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaryTreeNode other = (BinaryTreeNode) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

}