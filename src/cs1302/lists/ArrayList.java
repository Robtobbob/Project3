package cs1302.lists;

import java.io.IOException;

import javax.lang.model.type.ArrayType;

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
		try{
			@SuppressWarnings("unchecked")
			T[] tmp = (T[]) new Comparable[array.length + 1];
			// copy elements from the original array into the temp array
			for (int i = 0; i < array.length; i++) {
				tmp[i] = array[i];
			}
			// places the element in the array
			for (int j = 0; j<tmp.length;j++){
				T test = array[j];
				if( j == idx && test == elem){
					tmp[j]=elem;
				}
				else {
					if (j == idx){
						for (int k = idx; k<tmp.length;k++){
							tmp[k+1] = tmp[k];
						}
						tmp[j] = elem;
					}
				}
				
				
			}
			array = tmp;
			
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	} // add

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		try{
			for (int i = 0; i < array.length; i++) {
				if (i == idx){	
					T elem = array[i];
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
				T[] tmp = (T[]) new Comparable[array.length + 1];
				
				// copy elements from the original array into the temp array
				for (int i = 0; i < array.length; i++) {
					tmp[i+1] = array[i];
				} // for
				
				// add the element to the first position in the temp array
				tmp[0] = elem;

				// replace the array with the temp array
				array = tmp;
	} // prepend

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		try{
		// create a temporary array
				@SuppressWarnings("unchecked")
				T[] tmp = (T[]) new Comparable[array.length + 1];
				
				// copy elements from the original array into the temp array
				for (int i = 0; i < array.length; i++) {
					if (i == idx){
						continue; 
					}
					tmp[i] = array[i];
				} // for
		
				// add the element to the last position in the temp array
				array = tmp;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
				
				// replace the array with the temp array
				
				
	

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		try{
		if (lo > array.length || hi > array.length){ 
			throw new IndexOutOfBoundsException(); 
		}
		for (int i= 0;i <array.length; i++){
			T elem = array[i];
			if (elem == s){
				return 1;
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
		for (int i = 0; i < array.length; i++) {
			size++;
		}
		return size;
	} // size
	
} // ArrayList
