package ornekprojeler;

import java.util.Scanner;

public class Sinemaİsletmesi {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		int[]koltuklar=new int[20];
		byte secim;
		
		do {
			System.out.println("\n -SİNEMA SALONUNA HOŞGELDİNİZ- ");
		    System.out.println("1- Koltukları Göster ");
		    System.out.println("2- Koltuk Seç");
		    System.out.println("3- Çıkış");
		    secim=giris.nextByte();
		    
		    switch (secim) {
			case 1:    
				 System.out.println("\n KOLTUK DURUMU: ");  
				 for (int i = 0; i < koltuklar.length; i++){
					if (koltuklar[i]==0)
					    System.out.println((i+1)+". Koltuk : BOŞ");
					else 
						System.out.println((i+1)+". Koltuk : DOLU");}
				 break;
				 
			case 2:   
				System.out.println("Seçmek istediğiniz koltuk numarası(1-20)");
				int secilen=giris.nextInt(); 
				
				 if (secilen<1||secilen>20)   
					 System.out.println("Geçersiz koltuk seçtiniz");
				 else if (koltuklar[secilen-1]==1)
					 System.out.println("Bu koltuk dolu başka koltuk seçiniz.");
				 else 
				 koltuklar[secilen - 1] = 1;
                 System.out.println("Koltuk başarıyla rezerve edildi.");
				 break;
			
			case 3:   
				System.out.println("İşleminiz bitmiştir çıkış yapıldı İYİ SEYİRLER:)");
				break;

			default:System.out.println("Geçersiz seçimler yaptınız !!");
				break;
			}
		}while (secim!=3);
		
	}
}
