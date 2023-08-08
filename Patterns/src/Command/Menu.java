package Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	private ArrayList<ICommand> komutlar;
	public Menu() {
		komutlar = new ArrayList<ICommand>();
	}
	public void komutEkle(ICommand c) {
		komutlar.add(c);
	}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int s =0;
		while(s!=-1) {
			for (int i = 0; i<komutlar.size();i++) {
				System.out.println(i+":"+komutlar.get(i));
				
			}
			System.out.println("çýkmak için -1");
			try {
				s=sc.nextInt();
			} catch (Exception e) {
			}
		}
		sc.close();
	}
}
