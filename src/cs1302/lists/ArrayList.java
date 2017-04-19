package cs1302.lists;

import java.io.IOException;

import javax.lang.model.type.ArrayType;

// Implement this class according to the instructions

public class ArrayList<T extends Comparable<T>> implements List<T> {

	@SuppressWarnings("unchecked")
	private T[] _array = (T[]) new Comparable[0];
	
	@Override
	public void append(T elem) {
		
		// create a temporary array
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[_array.length + 1];
		
		// copy elements from the original array into the temp array
		for (int i = 0; i < _array.length; i++) {
			tmp[i] = _array[i];
		} // for
		
		// add the element to the last position in the temp array
		tmp[tmp.length - 1] = elem;

		// replace the array with the temp array
		_array = tmp;
		
	} // append

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		try{
			@SuppressWarnings("unchecked")
			T[] tmp = (T[]) new Comparable[_array.length + 1];
			// copy elements from the original array into the temp array
			for (int i = 0; i < _array.length; i++) {
				tmp[i] = _array[i];
			}
			// places the element in the array
			for (int k = idx; k<_array.length;k++){
				tmp[k+1] = _array[k];
			}
			tmp[idx]= elem;
			_array = tmp;
			
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	} // add

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		try{
			for (int i = 0; i < _array.length; i++) {
				if (i == idx){	
					T elem = _array[i];
					return elem;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			return null;
		}
		return null;
		
		
	 // get
	}
	@Override
	public void prepend(T elem) {
		// create a temporary array
				@SuppressWarnings("unchecked")
				T[] tmp = (T[]) new Comparable[_array.length + 1];
				
				// copy elements from the original array into the temp array
				for (int i = 0; i < _array.length; i++) {
					tmp[i+1] = _array[i];
				} // for
				
				// add the element to the first position in the temp array
				tmp[0] = elem;

				// replace the array with the temp array
				_array = tmp;
	} // prepend

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		try{
		// create a temporary array
				@SuppressWarnings("unchecked")
				T[] tmp = (T[]) new Comparable[_array.length-1];
				
				// copy elements from the original array into the temp array
				for (int i=0 ,j = 0; i < _array.length; i++) {
					if (i == idx){
						continue;
					}
					else{
						tmp[j] = _array[i];
						j++;
					}
				} // for
		
				// add the element to the last position in the temp array
				_array = tmp;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
				
				// replace the array with the temp array
				
				
	

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		try{
		if (lo >= _array.length || hi >= _array.length){ 
			throw new IndexOutOfBoundsException(); 
		}
		for (int i= 0;i <_array.length; i++){
			T elem = _array[i];
			if (elem == s){
				return i;
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			return -1;
		}
		return 0;
	} // search

	@Override
	public int size() {
		int size=0;
		for (int i = 0; i < _array.length; i++) {
			size++;
		}
		return size;
	} // size
	
} // ArrayList
