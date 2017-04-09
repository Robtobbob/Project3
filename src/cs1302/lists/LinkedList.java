
package cs1302.lists;


public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> first;
	private Node<T> end;
	
	@Override
	public void append(T elem) {
		Node<T> newLast = new Node<T>(elem);
		if (first == null){
			first = newLast;
			end = first;
		}
		else {	
			newLast.setLinkPrev(end);
            end.setLinkNext(newLast);
            end = newLast;
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
		Node<T> nptr = new Node<T>(elem, null, null);        
        if(first == null)
        {
            first = nptr;
            end = first;
        }
        else
        {
            first.setLinkPrev(nptr);
            nptr.setLinkNext(first);
            first = nptr;
        }
        size();
		
	}

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		Node<T> nptr = new Node<T>(elem, null, null);    
        if (idx == 1)
        {
            append(elem);
            return;
        }            
        Node<T> ptr = first;
        int length = size();
        for (int i = 2; i <= length; i++)
        {
            if (i == idx)
            {
                Node<T> tmp = ptr.getLinkNext();
                ptr.setLinkNext(nptr);
                nptr.setLinkPrev(ptr);
                nptr.setLinkNext(tmp);
                tmp.setLinkPrev(nptr);
            }
            ptr = ptr.getLinkNext();        
		
	}
	}
	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		Node<T> node = first;
		for (int i = 0; i < idx; ++i)
			node = node.next;
		return node.value;
	}

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		int length = size();
		if (idx == 1) 
        {
            if (length == 1)
            {
                first = null;
                end = null;
              //  size = 0;
                return; 
            }
            first = first.getLinkNext();
            first.setLinkPrev(null);
           // size--; 
            return ;
        }
        if (idx == length)
        {
            end = end.getLinkPrev();
            end.setLinkNext(null);
           // size-- ;
        }
        Node<T> ptr = first.getLinkNext();
        for (int i = 2; i <= length; i++)
        {
            if (i == idx)
            {
                Node<T> p = ptr.getLinkPrev();
                Node<T> n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                //size-- ;
                return;
            }
            ptr = ptr.getLinkNext();
	}
	}

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		Node<T> node = first;
		for (int i = lo;i <=hi ; node = node.next){
			 
		}
		return 0;
	}

	@Override
	public int size() {			
		int size = 0;
		for (Node<T> node = first; node != null; node = node.next)
			size += 1;
		return size;
	}
}
// Implement this class according to the instructions

