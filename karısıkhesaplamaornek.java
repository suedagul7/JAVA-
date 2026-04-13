package ForDonguleri;

import java.util.Scanner;

public class karısıkhesaplamaornek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String ad;
		byte yas,kisisayisi;
		short dogumtarihi;
		int maas,maasTop=0,yasTop=0,dtTop=0;
		
		System.out.println("Program kaç kişi için çalışacak ");
		kisisayisi=giris.nextByte();
		for (int i = 1; i <= kisisayisi; i++) {
			
			System.out.println(i+". kişinin adı : ");
			ad=giris.next();
			
			System.out.println(i+". kişinin maaşı :");
			maas=giris.nextInt();
			
			System.out.println(i+".kişinin doğum tarihi : " );
			dogumtarihi=giris.nextShort();
			
			yas=(byte) (2025-dogumtarihi);
			
			System.out.println(ad + "yaşın " + yas);
			maasTop+=maas; yasTop+=yas; dtTop+=dogumtarihi;
			
			System.out.println("Maaş ortalaması :"+(maasTop / kisisayisi));
			System.out.println("Yaş ortalaması :"+(yasTop / kisisayisi));
			System.out.println("Doğum tarihi ortalaması :"+(dtTop / kisisayisi));
			
			
			
			
		}

	}

}
