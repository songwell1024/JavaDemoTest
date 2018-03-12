package DemoTest;

import java.time.*;


public class pairtest {
	public static void main(String[] args) {
		LocalDate[] birthdays = {
				LocalDate.of(1900, 01, 01),
				LocalDate.of(1901, 01, 01),
				LocalDate.of(1902, 01, 02),
				LocalDate.of(1903, 01, 01)
			};
		
		Pair<LocalDate>  mm = ArrayAlg.minmax(birthdays);
		System.out.println("min=" + mm.getFirst());
		System.out.println("max=" + mm.getSecond());
		
		
	}
}

class ArrayAlg{
	public static <T extends Comparable> Pair<T> minmax(T[] a){
		if(a == null || a.length ==0) {
			return null;
		}
		
		T min = a[0];
		T max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(min.compareTo(a[i]) > 0) min = a[i];
			if(max.compareTo(a[i]) < 0) max = a[i];
		}
		
		return new Pair<>(min, max);
	}
}
 class Pair<T>{
	 private T first;
	 private T second;
	 
	 public Pair() {
		 first = null;
		 second =null;
				
	 }
	 
	 public  Pair(T first, T second) {
		 this.second = second;
		 this.first = first;
	 }
	 
	 public T getFirst() {
		 return first;
	 }
	 
	 public T getSecond() {
		 return second;
	 }
	 
	 public void setFirst(T newValue) {
		 first = newValue;
	 }
	 
	 public void setSecond(T newValue) {
		 second = newValue;
	 }
 }