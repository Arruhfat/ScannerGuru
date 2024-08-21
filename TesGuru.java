// Drive Class
import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
     Scanner  in = new Scanner(System.in);
     System.out.println("Nama");
     String nama = in.nextLine();
     System.out.println("Mapel");
     String mapell = in.nextLine();
     System.out.println("Alamat");
     String alamat = in.nextLine();
     System.out.println("Id");
     int id = in.nextInt();

     
        Guru buChusnul = new Guru (7,"Chusnul","Ipas","Malang");     
        Guru Bupasha = new Guru ();
            Bupasha.id = 1 ;
            Bupasha.nama = "Pasha Tania indah lestari" ;
            Bupasha.mapel = "produktif" ;
            Bupasha.alamat = "Malang";
            System.out.println("ini data Bu Pasha");
            System.out.println(Bupasha.id);
            System.out.println(Bupasha.nama);
            System.out.println(Bupasha.mapel);
            System.out.println(Bupasha.alamat);

            Guru Buaulia = new Guru();
            Buaulia.id = 2;
            Buaulia.nama = "aulia Mas' adah";
            Buaulia.mapel = "produktif";
            Buaulia.alamat = "malang";
            System.out.println("ini data Bu Aulia Mas' adah");
            System.out.println(Buaulia.id);
            System.out.println(Buaulia.nama);
            System.out.println(Buaulia.mapel);
            System.out.println(Buaulia.alamat);

            Guru Bufeni = new Guru (); 
            Bufeni.id = 3;
            Bufeni.nama = "feni";
            Bufeni.mapel = "Matematika";
            Bufeni.alamat = "Malang";
            System.out.println("ini data Bu feni");
            System.out.println(Bufeni.id);
            System.out.println(Bufeni.nama);
            System.out.println(Bufeni.mapel);
            System.out.println(Bufeni.alamat);


            Guru Buraka = new Guru ();
            Buraka.id = 4;
            Buraka.nama = "Buraka";
            Buraka.mapel = "PPKN";
            Buraka.alamat = "Malang";
            System.out.println("ini data Buraka");
            System.out.println(Buraka.id);
            System.out.println(Buraka.nama);
            System.out.println(Buraka.mapel);
            System.out.println(Buraka.alamat); 
            
            Guru Pakmunif = new Guru ();
            Pakmunif.id = 5;
            Pakmunif.nama = "Pak Munif";
            Pakmunif.mapel = "Agama";
            Pakmunif.alamat = "Malang";
            System.out.println("ini data Pakmunif");
            System.out.println(Pakmunif.id);
            System.out.println(Pakmunif.nama);
            System.out.println(Pakmunif.mapel);
            System.out.println(Pakmunif.alamat);
            
           buChusnul.println();
           Pakmunif.println();
           Bufeni.println();
           Buaulia.println();
           Bupasha.println();
           Buraka.println();

    }
    
        
    }
    

