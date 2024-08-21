//  Objec Class

public class Guru {
        int id;
        String nama,mapel,alamat;


        // Constructor nama dgn nama class
        public Guru() {
            id = 0;
            nama = "";
            mapel = "";
            alamat = "";
        }



            //Constructor Parameter
            public Guru (int id ,String nama, String mapel, String alamat){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
            }
        //method
        public void println(){
        System.out.println("ini data dari guru" + nama);
        System.out.println("id : " + id);
        System.out.println("Mapel" + mapel);
        System.out.println("Alamat" + alamat);
        }        
                
 }
