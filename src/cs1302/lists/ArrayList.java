package cs1302.lists;

// Implement this class according to the instructions

public class ArrayList<T extends Comparable<T>> implements List<T> {

	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Comparable[0];
	
	@Override
	public void append(T elem) {
		
		// create a temporary array
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[array.length + 1];
		
		// copy elements from the original array into the temp array
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		} // for
		
		// add the element to the last position in the temp array
		tmp[tmp.length - 1] = elem;

		// replace the array with the temp array
		array = tmp;
		
	} // append

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		
	} // add

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		return null;
	} // get

	@Override
	public void prepend(T elem) {
		
	} // prepend

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {

	} // remove

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		return 0;
	} // search

	@Override
	public int size() {
		return 0;
	} // size
	
} // ArrayList
