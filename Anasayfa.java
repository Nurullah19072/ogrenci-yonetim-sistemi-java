package Tum_2245;

/*NURULLAH YILDIRIM
22100011045*/

import java.util.Scanner;

import Tum_2245.Bolum;
import Tum_2245.Ders;
import Tum_2245.LisansOgrencisi;
import Tum_2245.Ogrenci;
import Tum_2245.YLOgrencisi;

public class Anasayfa {
	
	public static void tumlistele(Bolum[] boldizi) {
		int i,j,k,t,m=0,n;
		
		for(i=0;i<boldizi.length;i++) {
			
			System.out.println("\nBolum No: "+boldizi[i].getBolNo()+" Bolum Ad: "+boldizi[i].getBolAd());
			System.out.println("Lisans ogrencileri");
			
			for(j=0;j<(boldizi[i].ogrenciler).length;j++) {
				if(boldizi[i].ogrenciler[j] instanceof LisansOgrencisi) {
					LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];	
				System.out.println("\t"+(j+1)+".Ogrenci: "+logr.getOgrID()
						+" "+boldizi[i].ogrenciler[j].getOgrAd()+" "+boldizi[i].ogrenciler[j].getOgrSoyad()
						+" "+logr.getOgrSinif());
				
				}
					
			}
			
			System.out.println("Yuksek Lisans ogrencileri");
			for(n=0;n<boldizi[i].ogrenciler.length;n++) {
				if(boldizi[i].ogrenciler[n]instanceof YLOgrencisi) {
					YLOgrencisi ylogr=(YLOgrencisi) boldizi[i].ogrenciler[n];
					
					System.out.println("\t"+(n+1)+".Ogrenci: "+ylogr.getOgrID()
							+" "+boldizi[i].ogrenciler[n].getOgrAd()+" "+boldizi[i].ogrenciler[n].getOgrSoyad());
					
				}
				
			}
				
				
				
				
			System.out.println("Dersler:");
			for( t=0;t<(boldizi[i].dersler).length;t++) {
				
				System.out.println("\t"+(t+1)+".Ders: "+ boldizi[i].dersler[t].getDersID()+" "
				+ boldizi[i].dersler[t].getDersAd()+" "
				+ boldizi[i].dersler[t].getDersKredi());
				
					
			}
			
		}
		
	}
	
	
	public static void lisanslistele(Bolum[] boldizi) {
		int i,j,k;
		System.out.println("Tum Bolumlerdeki Lisans Ogrencileri:");
		for(i=0;i<boldizi.length;i++) {
			
			for(j=0;j<boldizi[i].ogrenciler.length;j++) {
				LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];
				if(boldizi[i].ogrenciler[j]instanceof LisansOgrencisi) {
					
					if(logr.getOgrSinif()==1) {
						
						System.out.println("1. Sınıf Ogrencileri:");
						System.out.println("\t"+logr.getOgrID()+" "+boldizi[i].ogrenciler[j].getOgrAd()
								+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					}
					
				}
				
			}
			
			
			
			
			for(j=0;j<boldizi[i].ogrenciler.length;j++) {
				LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];
				if(boldizi[i].ogrenciler[j]instanceof LisansOgrencisi) {
					
					if(logr.getOgrSinif()==2) {
						
						System.out.println("2. Sınıf Ogrencileri:");
						System.out.println("\t"+logr.getOgrID()+" "+boldizi[i].ogrenciler[j].getOgrAd()
								+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					}
					
				}
				
			}
			
			
			for(j=0;j<boldizi[i].ogrenciler.length;j++) {
				LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];
				if(boldizi[i].ogrenciler[j]instanceof LisansOgrencisi) {
					
					if(logr.getOgrSinif()==3) {
						
						System.out.println("3. Sınıf Ogrencileri:");
						System.out.println("\t"+logr.getOgrID()+" "+boldizi[i].ogrenciler[j].getOgrAd()
								+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					}
					
				}
				
			}
			
			
			for(j=0;j<boldizi[i].ogrenciler.length;j++) {
				LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];
				if(boldizi[i].ogrenciler[j]instanceof LisansOgrencisi) {
					
					if(logr.getOgrSinif()==4) {
						
						System.out.println("4. Sınıf Ogrencileri:");
						System.out.println("\t"+logr.getOgrID()+" "+boldizi[i].ogrenciler[j].getOgrAd()
								+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					}
					
				}
				
			}
			
				
			}
		
			
		}
		
		
	public static void ylistele(Bolum[] boldizi) {
		
		int i,j,k;
		System.out.println("Tum Bolumlerdeki Yuksek  Lisans Ogrencileri:");
		for(i=0;i<boldizi.length;i++) {
			
			for(j=0;j<boldizi[i].ogrenciler.length;j++) {
				YLOgrencisi ylogr=(YLOgrencisi) boldizi[i].ogrenciler[j];
				if(boldizi[i].ogrenciler[j]instanceof YLOgrencisi) {
	
						System.out.println("\t"+ylogr.getOgrID()+" "+boldizi[i].ogrenciler[j].getOgrAd()
								+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					
				}
				
			
			}
		}
			
			
			
		}
	
	public static void derslistele(Bolum[] boldizi) {
		int a=1,i,j,t,syc;
		
		for(i=0;i<boldizi.length;i++) {
			
			for(j=0;j<boldizi[i].dersler.length;j++) {
				
				if(boldizi[i].dersler[j].getDersKredi()>=a) {
					
					a=boldizi[i].dersler[j].getDersKredi();
					
				}
				
				
				
			}
			
		}
		
		
		System.out.println("Tum Bolumlerdeki Dersler:");
		
		for(i=1;i<=a;i++) {
			syc=1;
			for(j=0;j<boldizi.length;j++) {
				for(t=0;t<boldizi[j].dersler.length;t++) {
					if(boldizi[j].dersler[t].getDersKredi()==i) {
						System.out.println(i+"Kredilik Dersler:");
						System.out.println("\t"+boldizi[j].dersler[t].getDersID()+" "+boldizi[j].dersler[t].getDersAd());
						
						
						
					}
					
				}
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
	}
		
		
		
	public static void arama(Bolum[] boldizi){
		int i,j,k;
		String kelime;
		Scanner input=new Scanner(System.in);
		System.out.println("Aradiginiz kelimeyi girin:");
		kelime=input.nextLine();
		
		for(i=0;i<boldizi.length;i++) {
			
			for(j=0;j<boldizi[i].ogrenciler.length;j++) {
				
				if(boldizi[i].ogrenciler[j].getOgrAd()==kelime){
					
					if(boldizi[i].ogrenciler[j] instanceof LisansOgrencisi) {
						LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];	
					System.out.println("Lisans Ogrencisi: "+logr.getOgrID()
							+" "+boldizi[i].ogrenciler[j].getOgrAd()+" "+boldizi[i].ogrenciler[j].getOgrSoyad()
							+" "+logr.getOgrSinif());
					
					}
					
					if(boldizi[i].ogrenciler[j]instanceof YLOgrencisi) {
						YLOgrencisi ylogr=(YLOgrencisi) boldizi[i].ogrenciler[j];
						
						System.out.println(" Yuksek Lisans Ogrencisi: "+ylogr.getOgrID()
								+" "+boldizi[i].ogrenciler[j].getOgrAd()+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					}
					
				}
				
				if(boldizi[i].ogrenciler[j].getOgrSoyad()==kelime){
					
					if(boldizi[i].ogrenciler[j] instanceof LisansOgrencisi) {
						LisansOgrencisi logr=(LisansOgrencisi) boldizi[i].ogrenciler[j];	
					System.out.println("Lisans Ogrencisi: "+logr.getOgrID()
							+" "+boldizi[i].ogrenciler[j].getOgrAd()+" "+boldizi[i].ogrenciler[j].getOgrSoyad()
							+" "+logr.getOgrSinif());
					
					}
					
					if(boldizi[i].ogrenciler[j]instanceof YLOgrencisi) {
						YLOgrencisi ylogr=(YLOgrencisi) boldizi[i].ogrenciler[j];
						
						System.out.println(" Yuksek Lisans Ogrencisi: "+ylogr.getOgrID()
								+" "+boldizi[i].ogrenciler[j].getOgrAd()+" "+boldizi[i].ogrenciler[j].getOgrSoyad());
						
					}
			}
			
			
			}
			}
		
		for(i=0;i<boldizi.length;i++) {
			
			for(j=0;j<boldizi[i].dersler.length;j++) {
				
				if(boldizi[i].dersler[j].getDersAd()==kelime) {
					System.out.println(boldizi[i].getBolAd()+"Bolumu "+ boldizi[i].dersler[j].getDersID()+" "
							+ boldizi[i].dersler[j].getDersAd()+" "
							+ boldizi[i].dersler[j].getDersKredi());
					
					
				}
				
				
			}
		}
		
		
	}
		
		
	
		
	

	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		int bolsayi,i,z,bolNo,tercih,ylsayi = 0 ,lisansayi=0 ,ogrsayi,j,ogrsin,dersayi,derkredi;
		String bolAd,ograd,ogrsoyad,dersad;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("kac adet bolum girmek istersiniz:");
		bolsayi=input.nextInt();
		
		Bolum[] boldizi= new Bolum[bolsayi];
		
		for(i=0;i<bolsayi;i++) {
			
			
			
			System.out.println("lutfen bolum numarasini giriniz:");
			bolNo=input.nextInt();
			
			input.nextLine();
			
			System.out.println("lutfen bolumun adini giriniz:");
			bolAd=input.nextLine();
			
			boldizi[i]=new Bolum(bolNo, bolAd);
			
			System.out.println(boldizi[i].getBolAd()+" bolumundeki yuksek lisans ogrencisi sayisini giriniz");
			ylsayi=input.nextInt();
			
			System.out.println(boldizi[i].getBolAd()+" bolumundeki lisans ogrencisi sayisini giriniz");
			lisansayi=input.nextInt();
			
			ogrsayi=lisansayi+ylsayi;
			
			boldizi[i].ogrenciler=new Ogrenci[ogrsayi];
			
			
			
			for(j=1;j<=lisansayi;j++) {
				
				input.nextLine();
				
				System.out.println(j+". Lisans Ogrencisinin adini giriniz:");
				ograd=input.nextLine();
				
				System.out.println(j+". Lisans Ogrencisinin soyadini giriniz:");
				ogrsoyad=input.next();
				
				
				System.out.println(j+". Lisans Ogrencisinin kacinci sinif oldugunu giriniz:");
				ogrsin=input.nextInt();
				
				boldizi[i].ogrenciler[j]= new LisansOgrencisi(bolNo, ograd, ogrsoyad, ogrsin);
				
			}
			
			
			
			for(z=1;z<=ylsayi;z++) {
				
				input.nextLine();
				
				System.out.println(z+".Yuksek Lisans Ogrencisinin adini giriniz:");
				ograd=input.nextLine();
				
				System.out.println(z+".Yuksek Lisans Ogrencisinin soyadini giriniz:");
				ogrsoyad=input.next();
				
				boldizi[i].ogrenciler[z]= new YLOgrencisi(bolNo, ograd, ogrsoyad);
				
			}
			
			
			
			
			System.out.println(bolAd+" bolumu icin kac adet ders acildigini giriniz:");
			dersayi=input.nextInt();
			
			boldizi[i].dersler=new Ders[dersayi];
			
			
			for(j=0;j<dersayi;j++) {
				
				input.nextLine();
				
				System.out.println((j+1)+". Dersin adini giriniz:");
				dersad=input.nextLine();
				
				System.out.println((j+1)+". Dersin kac kredi oldugunu giriniz:");
				derkredi=input.nextInt();
				
				boldizi[i].dersler[j]= new Ders(bolNo, dersad, derkredi);
				
				
			}
			
			
			
		}
		
		
		
		while(true) {
			
			System.out.println("\n1-Tum bolum bilgilerini listeleme");
			System.out.println("2-Lisans ogrencilerini listeleme");
			System.out.println("3-Yuksek lisans ogrencilerini listeleme");
			System.out.println("4-Dersleri listeleme");
			System.out.println("5-Arama");
			System.out.println("6-Cikis\n");
			
		System.out.print("lutfen yapmak istediginiz islemi secininz:");
		tercih=input.nextInt();
		

		
		if(tercih==1) {
			
			tumlistele(boldizi);
			
		}
		
		else if(tercih==2) {
			lisanslistele(boldizi);
			
		}
		
		else if(tercih==3) {
			ylistele(boldizi);
			
		}
		
		else if(tercih==4) {
			derslistele(boldizi);
			
		}
		
		else if(tercih==5) {
			arama(boldizi);
			
		}
		
		else if(tercih==6) {
			break;
		}
		
		
		}

	}

}