package okulprojesi;

import java.util.HashMap;

public abstract class Ogrenci implements Okul {
	
	
	private String ogrenci12AIsim="Veli Demirel";
	private int ogrenciVeliDemirelNo=300;
	private String ogrenciVeliDemirelBrans="Sayisal";
	private String ogrenciVeliDemirelKlup="Kitap okuma klubu";
	public int sinifNo=12;
	
	
	public String getOgrenci12AIsim() {
		return ogrenci12AIsim;
	}



	public String getOgrenciVeliDemirelBrans() {
		return ogrenciVeliDemirelBrans;
	}



	public void setOgrenciVeliDemirelBrans(String ogrenciVeliDemirelBrans) {
		this.ogrenciVeliDemirelBrans = ogrenciVeliDemirelBrans;
	}



	public String getOgrenciVeliDemirelKlup() {
		return ogrenciVeliDemirelKlup;
	}



	public void setOgrenciVeliDemirelKlup(String ogrenciVeliDemirelKlup) {
		this.ogrenciVeliDemirelKlup = ogrenciVeliDemirelKlup;
	}



	public int getOgrenciVeliDemirelNo() {
		return ogrenciVeliDemirelNo;
	}
	
	
	public void ogrenciAldigiDersler() {
		System.out.println("Mat,Sosyal");
	}
	
	HashMap<String,Integer> ogrenciVeliDemirelNotlar=new HashMap<>();
	
	
	
	

}
