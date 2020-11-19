package okulprojesi;

public class OnIkiA extends Oniki{
	
	public static void main(String[] args) {
		
		Ogrenci ogrencibilgiler=new OnIkiA();
		
		System.out.println("Ogrenci Isim="+ogrencibilgiler.getOgrenci12AIsim());
		
		System.out.println("Ogrenci No ="+ogrencibilgiler.getOgrenciVeliDemirelNo());
		System.out.println("Ogrenci Brans="+ogrencibilgiler.getOgrenciVeliDemirelBrans());
		System.out.println("Ogrenci klup="+ogrencibilgiler.getOgrenciVeliDemirelKlup());
		
		
		ogrencibilgiler.setOgrenciVeliDemirelKlup("Spor Klubu");
		ogrencibilgiler.setOgrenciVeliDemirelBrans("Sözel");
		
		System.out.println("Ogrenci yeni klup="+ogrencibilgiler.getOgrenciVeliDemirelKlup());
		System.out.println("Ogrenci yeni  Brans="+ogrencibilgiler.getOgrenciVeliDemirelBrans());
		
		
		Ogretmen ogretmenbilgiler=new Ogretmen();
		System.out.println("Rehber Ogretmen="+ogretmenbilgiler.getOgretmen12AIsim());
		System.out.println("Ogretmen Not="+ogretmenbilgiler.getOgretmen12AUzmanlikNot());
		
		ogretmenbilgiler.setOgretmen12AUzmanlikNot('B');
		System.out.println("Ogretmen Uzmanlik Not="+ogretmenbilgiler.getOgretmen12AUzmanlikNot());
		
		
		
		ogrencibilgiler.ogrenciAldigiDersler();
		
		ogrencibilgiler.ogrenciVeliDemirelNotlar.put("Matematik",not(85,90) );
		
		ogrencibilgiler.ogrenciVeliDemirelNotlar.put("Fizik", not(80,70));
		
		ogrencibilgiler.ogrenciVeliDemirelNotlar.put("Turkce", not(75,85,95));
		
		System.out.println("Ders Notlari="+ogrencibilgiler.ogrenciVeliDemirelNotlar);
		
		
		
		
	}

	@Override
	public void ogrenciAldigiDersler() {
		System.out.println(" Velinin aldigi dersler=Matematik,Fizik,Turkce,Geometri");
	}
	
	
	public static int not (int a,int b) {
		return (a+b)/2;	
		}
	public static int not (int a,int b,int c) {
		return (a+b+c)/3;
	}

	@Override
	public void yonetmelik() {
		System.out.println("Siniflar Temiz birakilacak");
	}
	
	
	
	
	
	
	
}

