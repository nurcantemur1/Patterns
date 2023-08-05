package IteratorPattern;


public class Listeleme {

	public static void Listele(Aggregate e) {
		Iterator i = e.createIterator();
		for (i.First(); !i.IsDone(); i.Next()) {
			System.out.println(i.CurrentItem());
			
		}

	}

}
