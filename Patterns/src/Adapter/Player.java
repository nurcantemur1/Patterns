package Adapter;

import java.util.ArrayList;

public class Player {

	private ArrayList<Muzik> list;
	public Player() {
		list = new ArrayList<Muzik>();
	}
	public void Add(Muzik m) {
		list.add(m);
	}
	public void Play() {
		for(Muzik m: list) {
			m.Mp3player();
		}
	}

}
