package Collection;

public abstract class AbstractList<E> implements List<E> {

	protected static final String PREFIX = "[";
	protected static final String SUFFIX = "]";
	protected static final String SEPERATOR = ", ";
	protected static final int MAX_SIZE = Integer.MAX_VALUE/3;
	
	protected void checkIndex(int i) {
		if( i < 0 || i > Math.min(size() - 1, MAX_SIZE))
			throw new IndexOutOfBoundsException(i+"");
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	

	public int indexOf(E e) {
		Iterator<E> it = iterator();
		for (int index = 0; it.hasNext(); index++) {
			if (it.next().equals(e))
				return index;
		}
		return -1;
	}

	protected abstract Iterator<E> iterator();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(PREFIX);
		for (int i = 0; i < size(); i++) {
			sb.append(get(i));
			if (i < size()-1)
				sb.append(SEPERATOR);
		}
		sb.append(SUFFIX);
		return sb.toString();
	}
	
}
