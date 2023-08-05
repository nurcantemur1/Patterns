package IteratorPattern;

public class DiziIterator  extends Iterator{

	private Dizi dizi;
	private int i;
	
	public DiziIterator(Dizi d) {
		dizi=d;
		i=0;

	}
	@Override
	public void First() {
		i=0;
		
	}

	@Override
	public void Next() {
		i++;
		
	}

	@Override
	public boolean IsDone() {
		
		return i==dizi.list.size();
	}

	@Override
	public int CurrentItem() {
		return dizi.list.get(i);
	}

}
