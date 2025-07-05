package Tum_2245;

public class LisansOgrencisi extends Ogrenci {
	public int idcount=999;
	private int ogrSinif;
	private int ogrID=0;
	private String Durum;
	

	
	
	
	
	public LisansOgrencisi(int bolNo, String ogrAd, String ogrSoyad, int ogrSinif) {
		super(bolNo, ogrAd, ogrSoyad);
		this.ogrSinif = ogrSinif;
		this.ogrID=idcount+1;
		idcount=idcount+1;
		this.Durum="Lisans";
	}
	
	public int getOgrSinif() {
		return ogrSinif;
	}
	public void setOgrSinif(int ogrSinif) {
		this.ogrSinif = ogrSinif;
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
