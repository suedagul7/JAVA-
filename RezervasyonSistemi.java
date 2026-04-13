package ornekprojeler;

import java.util.Random;
import java.util.Scanner;

public class RezervasyonSistemi {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Rezervasyon kaç kişi için yaptırılacak : ");
	    int ks=klavye.nextInt();
	    
	    String []isimler=new String[ks];
	    for (int i = 0; i < ks; i++) {
	    	System.out.println((i+1)+". kişinin adı: ");
	    	isimler[i]=klavye.next();
			
		}
	    Random rnd = new Random();
	    int masaNo = rnd.nextInt(20) + 1;

        System.out.println("Restoran adı: ");
        String restoranAdi=klavye.next();
        System.out.println("Rezervasyon günü: ");
        String gun=klavye.next();
        System.out.println("Rezervasyon saati: ");
        String saat=klavye.next();
        
        byte secim;
        do {
        	System.out.println("\n--- REZERVASYON MENÜSÜ ---");
            System.out.println("1- İsimleri Göster");
            System.out.println("2-Masa Numarasını Göster");
            System.out.println("3-Kişi Sayısını Göster");
            System.out.println("4- Restoran Adını Göster");
            System.out.println("5- Gün ve Saat Bilgisini Göster");
            System.out.println("6- Çıkış");
            System.out.println("Seçiminiz: ");
            secim=klavye.nextByte();
            
            switch (secim) {
			case 1:	  
				System.out.println("Rezervasyondaki kişiler:");
				for (int i = 0; i < ks; i++) {
					System.out.println("- "+isimler[i]);		
				}break;
			
			case 2:	
				System.out.println("Masa numarası: "+masaNo); 
				break;
			
			case 3:	
				System.out.println("Kişi sayısı: "+ks);
				break;
				
			case 4:  
				System.out.println("Restoran adı: "+restoranAdi);
				break;
				
			case 5:	
				System.out.println("Gün: "+gun+"| Saat: "+saat);
				break;
				
			case 6:	System.out.println("Çıkış yapıldı ");
			break;

			default:
				System.out.println("Geçersiz seçim! ");
				break;
			}
            
            
	} while(secim!=6);
}
}

