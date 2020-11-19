package okulprojesi;

public class Oniki extends Ogrenci{

	public static void main(String[] args) {
		
		Ogrenci ogrencibilgiler=new Oniki();
		
		System.out.println(ogrencibilgiler.getOgrenci12AIsim());
		
		System.out.println(ogrencibilgiler.getOgrenciVeliDemirelNo());
		System.out.println(ogrencibilgiler.getOgrenciVeliDemirelBrans());
		System.out.println(ogrencibilgiler.getOgrenciVeliDemirelKlup());

		ogrencibilgiler.setOgrenciVeliDemirelKlup("Spor Klubu");
		ogrencibilgiler.setOgrenciVeliDemirelBrans("Sözel");
		
		System.out.println(ogrencibilgiler.getOgrenciVeliDemirelKlup());
		System.out.println(ogrencibilgiler.getOgrenciVeliDemirelBrans());
		
		
		
		
	}

	@Override
	public void ogrenciAldigiDersler() {
		System.out.println("Matematik,Fizik,Turkce,Geometri");
	}

	@Override
	public void yonetmelik() {
		
		
	}
	
	

}
