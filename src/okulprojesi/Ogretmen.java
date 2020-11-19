package okulprojesi;

public class Ogretmen extends Personel{
	
	
	private String ogretmen12AIsim="Ahmet ozturk";
	
	private int ogretmen12APersonelNo=123456;
	
	private char ogretmen12AUzmanlikNot='A';
	
	private boolean ogretmenBelge=true;
	
	

	public char getOgretmen12AUzmanlikNot() {
		return ogretmen12AUzmanlikNot;
	}

	public void setOgretmen12AUzmanlikNot(char ogretmen12aUzmanlikNot) {
		ogretmen12AUzmanlikNot = ogretmen12aUzmanlikNot;
	}

	public String getOgretmen12AIsim() {
		return ogretmen12AIsim;
	}

	public int getOgretmen12APersonelNo() {
		return ogretmen12APersonelNo;
	}

	public boolean isOgretmenBelge() {
		return ogretmenBelge;
	}

	@Override
	public void yonetmelik() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sgkNo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int maas(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calismaSaatleri() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

}
