package cs1302.lists;

/**
 * A sorted collection (also known as a sorted sequence). The position of each 
 * element within this list is governed by the Comparable interface. The user 
 * can access elements by their integer index (position in the list), and search 
 * for elements in the list.
 */
public interface SortedList<T extends Comparable<T>> {

    /**
     * Inserts this element into the list. If an element with the same value 
     * already exists in the list then the new element is added after it. 
     * Elements should be inserted according to sorted order as defined by
     * the Comparable interface.
     * 
     * @param elem the element to be inserted.
     */
    public void add(T elem);

    /**
     * Returns the element at the specified index. If the index
     * is out of bounds then an IndexOutOfBoundsException should be thrown.
     * 
     * @param elem the element to be inserted.
     */
    public T get(int idx) throws IndexOutOfBoundsException;

    /**
     * Removes the element at specified index. This will reduce the size of
     * the list by one element. If the index is out of bounds then an 
     * IndexOutOfBoundsException should be thrown.
     * 
     * @param idx the index of the element that is to be removed.
     */
    public void remove(int idx) throws IndexOutOfBoundsException;

    /**
     * Returns the index of the specified search element in the list if it
     * exists within the range. If the search element does not exist in the 
     * list then this method should return -1. Array-based implementation 
     * of this interface should implement binary search for this method. 
     * Otherwise, a linear search implementation is reccommended. If either
     * or both the lower and upper bounds on the search space are out of
     * bounds then an IndexOutOfBoundsException should be thrown.
     *
     * @param s the specified search element.
     * @param lo an index indicating the lower bound on the search space
     * @param hi an index indicating the upper bound on the search space
     * @return the index where the search element was found or -1.
     */
    public int search(T s, int lo, int hi) throws IndexOutOfBoundsException;

    /**
     * Returns the size of the list
     *
     * @return the size of the list
     */
    public int size();

} // SortedList

