package okulprojesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


//Cucumber veya TestNg nin OOP ile iliskisi nedir? Nerede kullanilir?

public abstract class Personel implements Okul,Sgk {

	public abstract int maas(int a,int b);
	
	public abstract int calismaSaatleri();
	
	private int ogretmenSaatlikUcret=20;
	private int memurSaatlikUcret=18;
	private int hizmetliSaatlikUcret=14;
	
	
	List<String> ogretmenlist=new ArrayList<>();	
	
	List<String> kitapEnvanter=new LinkedList<>();
	
	Set<Integer> ogretmenId=new HashSet<>();
	
	HashMap<String,Integer> ogretmenmaaslar =new HashMap<>();

	public int getOgretmenSaatlikUcret() {
		return ogretmenSaatlikUcret;
	}

	public int getMemurSaatlikUcret() {
		return memurSaatlikUcret;
	}

	public int getHizmetliSaatlikUcret() {
		return hizmetliSaatlikUcret;
	}
	
	
	
	
	
}
