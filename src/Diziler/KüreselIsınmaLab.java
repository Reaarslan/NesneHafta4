package Diziler;

import java.util.Scanner;

public class KüreselIsınmaLab {

	public static void main(String[] args) {
		String[]array = {"a","b","c","d"};
		String[]arr = {"A","B","C","D"};
		int i = 0;
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("1) Aşağıdakilerden hangisi küresel ısınmanın sonuçlarından biri değildir?\n");
		System.out.println("A) Ortalama deniz seviyesinin yükselmesi");
		System.out.println("B) Tatlı su kaynaklarının azalması");
		System.out.println("C) Buzulların artması");
		System.out.println("D) İklim değişiklikleri\n");
		
		String cevap = s1.nextLine();
		if(array[2].equals(cevap) || arr[2].equals(cevap)) {
			System.out.println("Doğru!");
			i++;
		}
		else {
			System.out.println("Yanlış!");
		}
		
		
		System.out.println("2) Dünya'ya Güneş'ten gelen ışınlar, karbondioksit, metan ve su buharı gibi atmosferde bulunan gazlar tarafından tutulur. Böylece Dünya'nın sıcaklığı artar.\r\n"
				+ "\r\n"
				+ "Güneş enerjisinin bu gazlar tarafından tutulması olayına ne ad verilir?\n");
		System.out.println("A) Güneş Tutulması");
		System.out.println("B) Sera Etkisi");
		System.out.println("C) Buzulların Erimesi");
		System.out.println("D) Ozon Tabakasının Delinmesi\n");
		
		String cevap2 = s1.nextLine();
		if(array[1].equals(cevap2) || arr[1].equals(cevap2)) {
			System.out.println("Doğru!");
			i++;
		}
		else {
			System.out.println("Yanlış!");
		}
		
		System.out.println("3) Küresel Isınma: Atmosfere salınan CO2 gibi sera etkisi yaratan gazların, yer yüzeyi ve denizlerin ortalama sıcaklığını artırmasıdır.\r\n"
				+ "\r\n"
				+ "Buna göre; aşağıdakilerden hangisi küresel ısınmaya karşı alınabilecek önlemler arasında değildir?\n");
		System.out.println("A) Ambalajları fazla olan ürünleri kullanmaktan kaçınmak");
		System.out.println("B) Ev ve iş yerinde enerji yalıtımı sağlamak");
		System.out.println("C) Yenilenemez enerji kaynaklarını kullanmayı tercih etmek");
		System.out.println("D) Otomobillerin hava ve yakıt filtrelerinin her zaman temiz olmasına dikkat etmek\n");
		
		String cevap3 = s1.nextLine();
		if(array[2].equals(cevap3) || arr[2].equals(cevap3)) {
			System.out.println("Doğru!");
			i++;
		}
		else {
			System.out.println("Yanlış!");
		}
		
		System.out.println("4) Hangi ülke en çok sera gazı yaymaktadır?");
		System.out.println("A) Çin");
		System.out.println("B) Hindistan");
		System.out.println("C) Amerika");
		System.out.println("D) Japonya\n");
		
		String cevap4 = s1.nextLine();
		if(array[0].equals(cevap4) || arr[0].equals(cevap4)) {
			System.out.println("Doğru!");
			i++;
		}
		else {
			System.out.println("Yanlış!");
		}
		
		System.out.println("5) Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.println("A) Jüpiter");
		System.out.println("B) Venüs");
		System.out.println("C) Mars");
		System.out.println("D) Merkür");
		
		String cevap5= s1.nextLine();
		if(array[1].equals(cevap5) || arr[1].equals(cevap5)) {
			System.out.println("Doğru!");
			i++;
		}
		else {
			System.out.println("Yanlış!");
		}
		if(i == 5) {
			System.out.println("Doğru cevapladığınız soru sayısı = " +i +"\nMükemmel!");
		}
		else if(i == 4) {
			System.out.println("Doğru cevapladığınız soru sayısı = " +i +"\nÇok iyi!");
	}
		else if(i <= 3) {
			System.out.println("Doğru cevapladığınız soru sayısı = " +i +"\nKüresel ısınma hakkındaki bilgilerinizi tazeleme zamanı!");
	}
}
}
