package cs1302.lists;

 class Node<T extends Comparable<T>> {

	 T value;
	 Node<T> next;
	 Node<T> prev;
	
	 Node(T value) {
		 this.value = value;
	 }
	 public Node(T d, Node<T> n, Node<T> p)
	    {
	        value = d;
	        next = n;
	        prev = p;
	    }
	 public void setLinkNext(Node<T> n)
	    {
	        next = n;
	    }
	    /* Function to set link to previous node */
	    public void setLinkPrev(Node<T> p)
	    {
	        prev = p;
	    } 
	    public Node<T> getLinkNext()
	    {
	        return next;
	    }
	    /* Function to get link to previous node */
	    public Node<T> getLinkPrev()
	    {
	        return prev;
	    }
	    /* Function to set data to node */
	    public void setData(T d)
	    {
	        value = d;
	    }
	    /* Function to get data from node */
	    public T getData()
	    {
	        return value;
	    }
}
