package ornekprojeler;

import java.util.Scanner;

public class MiniMarket {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		
		String[]urunler= {"Ekmek","Yumurta","Süt","Çikolata","Makarna"};
		double[]fiyatlar = {15,12,25,30,20};
		
		double toplamTutar= 0;
		int secim;
		
		System.out.println("HOŞGELDİNİZ :)");
		System.out.println("----ÜRÜNLER----");
		for (int i = 0; i < urunler.length; i++) {
			System.out.println((i+1) + "." + urunler[i] + "-" + fiyatlar[i] + "TL");
		}
          do {
        	  System.out.println("\n1-Ürün satın al");
              System.out.println("2-Kasaya git");
              System.out.println("Seçiminiz : ");
              secim=giris.nextInt();
              
              switch (secim) {
			case 1:
				System.out.println("Ürün numarası (1-5): ");
				int urunNo=giris.nextInt();
				
				if(urunNo < 1 || urunNo >5) {
					System.out.println("Hatalı ürün numarası! ");
				break;
				
				}
				
				System.out.println("Kaç adet almak istiyorsunuz : ");
				int adet=giris.nextInt();
				
				double araToplam = fiyatlar[urunNo-1]*adet;
				toplamTutar+=araToplam;
				
				System.out.println(urunler[urunNo - 1] + " sepete eklendi! Ara Toplam: "+ araToplam+"TL");
				break;
				
				
            case 2:
            	System.out.println("\nKasaya yönlendiriliyorsunuz...");
				break;
          

			default:
				System.out.println("Hatalı seçim yaptınız!");
				break;
			}
          } while (secim!=2); 
           
           System.out.println("\n---KASA---");
           System.out.println("Ödenecek toplam tutar :"+toplamTutar+"TL");
          
               System.out.println("İYİ GÜNLER:)");
          }
         
	}

           
	


