package IteratorPattern;

import java.util.ArrayList;

public class Dizi extends Aggregate {
	public ArrayList<Integer> list; 
	public Dizi() {
		list= new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
	}
	@Override
	public Iterator createIterator() {
		return new DiziIterator(this);
	}

}
