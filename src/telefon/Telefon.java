/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefon;

/**
 *
 * @author nurik
 */
public class Telefon {

    String marka; int ekranBoyu; double islemciHizi; String islemciTürü;
    String ekranTipi;//marka,ekranBoyu,islemciHizi,islemciTürü,ekranTipi adında değişken tanımladık.
    public static void main(String[] args) {
      Telefon telefon= new Telefon();//Telefon adında telefon nesnesi oluşturdum.Ve bu nesneye özelliklerini atadım.
      telefon.marka= "Apple";//telefonun marka değerine "apple" değerini verdim.
      telefon.ekranBoyu= 6;//telefonun ekranboyu değerine “6” değerini verdim.
      telefon.islemciHizi= 2.50;//telefonun islemcihizi değerine “2.50 “değerini verdim.
      telefon.islemciTürü= "A12 Bionic";//telefonun islemciTürü değerine “A12 Bionic” değerini verdim.
      telefon.ekranTipi="LCD,HD Plus";//telefonun ekranTipi değerine” LCD,HD Plus” değerini verdim.
      
    System.out.println("marka : "+telefon.marka+"\nEkranboyu : "+telefon.ekranBoyu+"\nİşlmeciHızı : "
   +telefon.islemciHizi+"\nİşlmeciTürü : "+telefon.islemciTürü+"\nEkranTipi : "+telefon.ekranTipi);
    //Verdiğim değerleri ekrana çıktı olarak yazdırdım.
    }
    
}
