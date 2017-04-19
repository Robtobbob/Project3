
package cs1302.lists;


public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> head;
	
	
	
	public LinkedList()
    {
        head = null;
        
        
    }
	
	@Override
	public void append(T elem) {
		Node<T> newLast = new Node<T>(elem,null,null);
		if (head == null){
			head = newLast;
		}
		else {	
			Node<T> nextNode ;
			nextNode = head;
			while (nextNode.getLinkNext() != null) {
				nextNode = nextNode.getLinkNext();
			}
			nextNode.setLinkNext(newLast);
            
			/*
			Node<T> oldLast = first;
			while(oldLast.next != null){
				oldLast = oldLast.next;
			}
			oldLast.next = newLast;
			*/
		}
			
	}

	@Override
	public void prepend(T elem) {
		Node<T> newHeadNode = new Node<T>(elem,head,null);        
        head = newHeadNode;
        
        
		
	}

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		Node<T> newNode = new Node<T>(elem, null, null);        
        Node<T> current = head;
        if (idx == 0){
        	prepend(elem);
        	return;
        }
        int length = size();
        if(idx> length)
        	throw new IndexOutOfBoundsException();
        for(int i = 0;i<idx-1 && current.getLinkNext() != null;i++){
        	current = current.getLinkNext();
        }
        newNode.setLinkNext(current.getLinkNext());
        current.setLinkNext(newNode);
        /*
        for (int i = 2; i <= length; i++)
        {
            if (i == idx)
            {
                Node<T> tmp = ptr.getLinkNext();
                ptr.setLinkNext(nptr);         
                nptr.setLinkNext(tmp);       
            }
            ptr = ptr.getLinkNext();        
		
	}
	*/
	}
	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		Node<T> node = head;
		int lSize = size();
		if(idx> lSize)
			throw new IndexOutOfBoundsException("The idx you have entered is out of bounds");
		for (int i = 0; i <= idx; ++i){
			if(i == idx ){
				return node.value;
			}
			node = node.next;
		}
		return null;
	}

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		int length = size();
		if(idx< 1 || idx> length )
			throw new IndexOutOfBoundsException();
		Node<T> current = head; 
		if (head != null) {
			for (int i = 0; i < idx; i++) {
				if (current.getLinkNext() == null)
					throw new IndexOutOfBoundsException();
				current = current.getLinkNext();
			}
			current.setLinkNext(current.getLinkNext().getLinkNext());
		
	}
	}
	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		Node<T> current = head;
		int lSize = size();
		if (lo >= lSize|| hi>=lSize)
			throw new IndexOutOfBoundsException();
		for(int j = 0;j<lo;j++,current = current.next);
		for (int i = lo;i <=hi ;i++, current = current.next){
			if(current.value == s)
			 return i;
		 else if(current.next.equals(null))
			 return -1;
		}
		return 0;
	}

	@Override
	public int size() {			
		int size = 0;
		for (Node<T> node = head; node != null; node = node.next)
			size += 1;
		return size;
	}
}
// Implement this class according to the instructions

