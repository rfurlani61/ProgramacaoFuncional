package application;

import java.util.Comparator;

import entities.Produto;

public class MyComparator implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
	}

}
