package TreeSet;

import java.util.*;

public class TreeSetTest {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4567));
		parts.add(new Item("Modemm", 9912));
		System.out.println(parts);;
		
		NavigableSet<Item> sortByDescription =  new TreeSet<>(
				Comparator.comparing(Item::getDescription));
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
		
	}

}
