
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> sigara = new LinkedList<String>();
         Random random = new Random();
        Scanner scn = new Scanner(System.in);
        
        sigara.offer("20");
        sigara.offer("19");
        sigara.offer("18");
        sigara.offer("17");
        sigara.offer("16");
        sigara.offer("15");
        sigara.offer("14");
        sigara.offer("13");
        sigara.offer("12");
        sigara.offer("11");
        sigara.offer("10");
        sigara.offer("9");
        sigara.offer("8");
        sigara.offer("7");
        sigara.offer("6");
        sigara.offer("5");
        sigara.offer("4");
        sigara.offer("3");
        sigara.offer("2");
        sigara.offer("1");
        System.out.println("Büfe programına hoşgeldiniz");
        String islemler = "1.islem markaları göster \n"
                + "2.islem ürün isteğinde bulun\n"
                + "3.işlemleri tekrar görmek\n"
                + "q çıkış\n"
                + "4.Sigara ile kendiniz zehirle";
        while (true) {  
            System.out.println("********************************************");
            System.out.println(islemler);
            System.out.println("********************************************");
            String islem = scn.nextLine();

            if(islem.equals("1")){
                System.out.println("markalarımız = ");
                System.out.println("Winston\n"
                        + "Camel\n"
                        + "Monte Carlo\n"
                        + "LD\n"
                        + "Kent\n"
                        + "Rothmans\n"
                        + "Viceroy\n"
                        + "Pall Mall\n"
                        + "Tekel 2000\n"
                        + "Tekel 2001\n"
                        + "Samsun\n"
                        + "Maltepe\n");
                
            }else if(islem.equals("2")){
                System.out.println("Lütfen sigaranızın markasını giriniz.");
                String marka = scn.nextLine();
                System.out.println("Lütfen sigara modelinizi giriniz");
                String model = scn.nextLine();
                System.out.println("Sigranız raftan çıkarılıyor Lütfen bekleyiniz...");
                Thread.sleep(3000);
                Sigara newgoods = new Sigara(marka, model);
                System.out.println("İşleminiz devam ediyor lütfen bekleyiniz...");
                Thread.sleep(1500);
                
                while(true){
                    System.out.println("Ürün fiş kontrolü için lütfen 1'e basınız'e\n"
                        + "para üstü için 2 'e basınız"
                            + "ana döngüye dönmek için q'ya basınız");
                    String dd = scn.nextLine();
                if(dd.equals("1")){
                    System.out.println("Sigara kontrol ediliyor...");
                    System.out.println("marka model fiyat doğrulanıyor....");
                    System.out.println("Marka :"+newgoods.getMarka()+" Model : "+newgoods.getModel()+" Fiyat : "+newgoods.getFiyat());
                }else if(dd.equals("2")){
                System.out.println("Lütfen kasiyere verdiğiniz tutarı giriniz = ");
                Double fiyat = scn.nextDouble();
                scn.nextLine();
                System.out.println("Para üstü hesaplanıyor lütfen bekleyiniz ...");
                Thread.sleep(5000);
                double toplamSonuc = fiyat-newgoods.getFiyat();
                    System.out.println("Paza üstünüz = "+toplamSonuc);
                }else if(dd.equals("q")){
                    break;
                }
                }
            }else if(islem.equals("3")){
                 System.out.println("********************************************");
                 System.out.println(islemler);
                 System.out.println("********************************************");
                }else if(islem.equals("q")){
                    System.out.println("Büfe işlemleri sonlandırılıyor\n"
                            + "Bizi Tercih ettiğiniz için Teşekkür ederiz.Lütfen Bekleyiniz..\n" );
                    
                    System.out.println("BÜfe işlemlerinin sonlandırılması için dosyalar doğrulanıyor Lütfen büfeden ayrılmayınız....");
                    System.out.println("Loading %7 Tahmini süre 10 sn");
                    Thread.sleep(1000);
                     System.out.println("Loading %11 Tahmini süre 9.8 sn");
                    Thread.sleep(1000);
                     System.out.println("Loading %19 Tahmini süre 8.8 sn");
                    Thread.sleep(1000);
                    System.out.println("Loading %33 Tahmini süre 7 sn");
                    Thread.sleep(5000);
                    System.out.println("Loading %89 Tahmini süre 2 sn");
                    Thread.sleep(2000);
                    System.out.println("Sistemden başarı ile çıkıldı ....");
                    break;
                }else if(islem.equals("4")){
                    System.out.println("Sigara tüketiliyor.");
                     int sigaraadet = 1+random.nextInt(20);
                    System.out.println("sigara paketinizdeki sigara adeti = " + sigaraadet);
                    while(sigaraadet != 0){
                         System.out.println(sigara.poll()+"  .(ıncı/inci) sigara içiliyor");
                             Thread.sleep(1000);
                                sigaraadet--;
                    }
                    System.out.println("İçilecek Sigaranız kalmadı paket boş Lütfen Büfeye gidip yeni bir Zehir paketi talep edin...");
                }
            }
            
        }
             
           
    }
    

