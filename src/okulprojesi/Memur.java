package okulprojesi;

import java.util.Hashtable;

public class Memur extends Personel{
	
	
	public static void main(String[] args) {
		
	Personel list=new Memur();
	
	list.ogretmenlist.add("Ahmet Demir");
	list.ogretmenlist.add("Mustafa Ozturk");
	list.ogretmenlist.add("Emre Yilmaz");
	list.ogretmenlist.add("Ayse demirel");
	
	
	list.ogretmenId.add(2000123654);
	list.ogretmenId.add(965412368);
	list.ogretmenId.add(78952364);
	list.ogretmenId.add(365478921);
	
	Hashtable<String,Integer> liste=new Hashtable<>();
	liste.put(null, null);
	//System.out.println(liste);
	
	
	list.ogretmenmaaslar.put("Ayse demirel", list.maas(list.getOgretmenSaatlikUcret(), 25));
	list.ogretmenmaaslar.put("Ahmet Demir", list.maas(list.getOgretmenSaatlikUcret(), 42));
	list.ogretmenmaaslar.put("Mustafa ozturk", list.maas(list.getOgretmenSaatlikUcret(), 38));
	list.ogretmenmaaslar.put("Emre yilmaz", list.maas(list.getOgretmenSaatlikUcret(), 48));
	list.ogretmenmaaslar.compute(null, null);
	
	
		
	System.out.println(list.ogretmenlist);
	System.out.println(list.ogretmenId);
	System.out.println(list.ogretmenmaaslar);
	
	
	System.out.println(list.ogretmenlist.get(3));
	System.out.println(list.ogretmenlist.contains("Ahmet Demir"));
	list.ogretmenlist.remove(1);
	System.out.println(list.ogretmenlist);
	list.ogretmenlist.set(2, "Fatma");
	System.out.println(list.ogretmenlist);
	System.out.println(list.ogretmenlist.subList(1, 3));
	
	
	System.out.println(list.ogretmenmaaslar.containsKey("Emre yilmaz"));
	System.out.println(list.ogretmenmaaslar.get("Emre yilmaz"));
	list.ogretmenmaaslar.putIfAbsent("Ali", 5000);
	System.out.println(list.ogretmenmaaslar);
	list.ogretmenmaaslar.replace("Emre yilmaz", 450);
	System.out.println(list.ogretmenmaaslar);
	
	
		
	}

	@Override
	public void yonetmelik() {
		System.out.println("Ogretmenler Onluk giymek zorundadir");
		
	}

	@Override
	public void sgkNo() {
		System.out.println("Her calisanin sgk Numarasi olmalidir");
		
	}

	

	@Override
	public int calismaSaatleri() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maas(int a, int b) {
		
		return 4*a*b;
	}

}
