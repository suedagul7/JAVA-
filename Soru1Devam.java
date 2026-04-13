package ornekler;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru1Devam {
	static Scanner giris=new Scanner(System.in);
	static ArrayList<String> isim = new ArrayList<String>();
	static ArrayList<Boolean> medeniDurum = new ArrayList<Boolean>();
	static ArrayList<Byte> cocukSayisi = new ArrayList<Byte>();
	static ArrayList<Integer> brutMaas = new ArrayList<Integer>();
	static ArrayList<Integer> netMaas = new ArrayList<Integer>();
	public static void main(String[] args) {
		

	}

	public static byte menu() {
		System.out.println("1-Veri Giriş\n2-Listleme\n3-İsim Arama\n4-Ortalama\n5-Evlilerin Bilgisi\n6-Kayıt Düzeltme\n7-Silme\n8-Çıkış");
        byte secim=giris.nextByte();
		return secim;
	}

	public static void Giris() {
		System.out.println("İsim Giriniz : ");
		isim.add(giris.next());
		boolean evlimi=MedeniDurumAl();
		medeniDurum.add(evlimi);
		System.out.println("Çocuk sayısı giriniz : ");
		byte cSayi=giris.nextByte();
		cocukSayisi.add(cSayi);
		System.out.println("Brüt maaşı giriniz: ");
		int bmaas=giris.nextInt();
		if(evlimi)bmaas+=5000;
		bmaas+=cSayi*2500;
		brutMaas.add(bmaas);
		netMaas.add((int) (bmaas-bmaas*0.25));
	}
	
	private static boolean MedeniDurumAl() {
		System.out.println("Medeni Durum Giriniz(E/B) : ");
		String veri=giris.next().toUpperCase();
		char karakter = veri.charAt(0);
		if (karakter=='E') return true;
		else if (karakter=='B') return false;
		else System.out.println("hatalı giriş");
		return false;
	}

	public static void Listeleme() {
		 
		       
		                         
	}


	public static void İsimArama() {
		System.out.println("Aramak istediğiniz ismi giriniz : ");
		String arananİsim=giris.next();
		boolean bulundu=false;
		for (int i = 0; i < isim.size(); i++) {
			
			
		}
		
		
	}

	public static void Ortalama() {
		// TODO Auto-generated method stub
		
	}

	public static void EvlilerinBilgisi() {
		// TODO Auto-generated method stub
		
	}

	public static void KayitDuzeltme() {
		// TODO Auto-generated method stub
		
	}

	public static void Silme() {
		// TODO Auto-generated method stub
		
	}

}
