package ornekler;

import java.util.ArrayList;
import java.util.Scanner;

public class ornek1 {
	static Scanner giris=new Scanner(System.in);
	static ArrayList<String> isim = new ArrayList<String>();
	static ArrayList<Boolean> medeniDurum = new ArrayList<Boolean>();
	static ArrayList<Byte> cocukSayisi = new ArrayList<Byte>();
	static ArrayList<Integer> brutMaas = new ArrayList<Integer>();
	static ArrayList<Integer> netMaas = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		byte secim;
		do {
			secim=Soru1Devam.menu();
			switch (secim) {
			case 1:
				Soru1Devam.Giris(); break;
			case 2:
				Soru1Devam.Listeleme(); break;
			case 3:
				Soru1Devam.İsimArama(); break;
			case 4:
				Soru1Devam.Ortalama(); break;
			case 5:
				Soru1Devam.EvlilerinBilgisi();break;
			case 6:
				Soru1Devam.KayitDuzeltme();	break;
			case 7:
				Soru1Devam.Silme();	break;	
			case 8:
				System.out.println("Program bitti"); System.exit(0); break;

			default:
				System.out.println("Yanlş menü değeri girdiniz");
				break;
			}
			} while(true);
		

	}

}
