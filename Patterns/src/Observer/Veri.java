package Observer;

import java.util.ArrayList;
import java.util.Random;

public class Veri implements Subject {

	private ArrayList<Integer> list;
	private ArrayList<Observer> gozlemciler;
	private Random random;
	public Veri() {
		random = new Random(System.currentTimeMillis());
		list = new ArrayList<Integer>();
		list.add(random.nextInt(100));
		list.add(random.nextInt(100));
		list.add(random.nextInt(100));
		list.add(random.nextInt(100));
		gozlemciler = new ArrayList<Observer>();
	}
	
	@Override
	public void Attach(Observer o) {
		gozlemciler.add(o);
	}

	@Override
	public void Detach(Observer o) {
		gozlemciler.remove(o);
	}

	@Override
	public void Notify() {
		for(Observer o : gozlemciler) {
			o.Update();
		}
	}
	public void yeniVeri() {
		list.add(random.nextInt());
		Notify();
	}
	public ArrayList<Integer> veriAl(){
		return list;
	}

}
