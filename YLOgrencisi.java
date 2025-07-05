package Tum_2245;

public class YLOgrencisi extends Ogrenci {
	public int idcount=4999;
	private int ogrID=0;
	private String Durum;
	
	
	public YLOgrencisi(int bolNo, String ogrAd, String grSoyad) {
		super(bolNo, ogrAd, grSoyad);
		this.ogrID=idcount+1;
		idcount+=1;
		this.Durum="Yuksek Lisans";
		
	}
	
	
	public int getOgrID() {
		return ogrID;
	}
	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}
	
	
	public String getDurum() {
		return Durum;
	}
	public void setDurum(String durum) {
		Durum = durum;
	}
	
	
	
	
	
	
	

}
