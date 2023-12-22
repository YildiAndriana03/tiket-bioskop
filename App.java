import java.util.Scanner;

public class App{
    public static void main (String[]args) {
        String kode = "0";
        String jam = "0";
        int harga = 35000;
        Scanner input = new Scanner (System.in);
        Tiket user = new Tiket();
        System.out.println("=============PEMESANAN TIKET BIOSKOP============");
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan no.Kursi:");
        String nomor = input.next();


        user.setNama(nama);
        user.setKursi(nomor);

        System.out.println("===============================================");
        System.out.println("==== LIST FILM YANG SEDANG TAYANG ====");
        System.out.println("1. HARRY FOTER");
        System.out.println("2. UPIN IPIN THE MOVIE");
        System.out.println("3. SARANJANA");
        System.out.println("4. IMAM TANPA MA'MUM ");
        System.out.println("5. JENDELA SYURGA");
        System.out.println(" Masukkan Pilihan: ");
        int  n = input.nextInt();
        if(n==1){
            kode = "A001";
        }else if (n==2){
            kode ="A002";
        }else if (n==3){
            kode ="A003";
        }else if (n==4){
            kode = "A004";
        }else if(n==5){
            kode = "A005";
        }else {
            System.out.println("Error!");
        }

        System.out.println("=============================================");
        System.out.println("========== Pilih Jam Tayang ==========");
        System.out.println("1. 14.00");
        System.out.println("2. 16.00");
        System.out.println("3. 17.30");
        System.out.println("4. 20.00");
        System.out.println("5. 22.00");
        System.out.println(" Masukkan Pilihan: ");
        int i = input.nextInt();
        if (i==1){
            jam = "14.00";
        }else if (i==2){
            jam = "16.00";
        }else if (i==3){
            jam = "17.30";
        }else if (i==4){
            jam = "20.00";
        }else if(i==5){
            jam = "22.00";
        }else {
            System.out.println("Tidak Tersedia");
        }

        user.setKode(kode);
        user.setJam(jam);
        user.setHarga(harga);

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("=========================INVOICE PEMESANAN TIKET=====================");
        System.out.println("Nama Pelanggan \t\t: "+ user.getNama());
        System.out.println("No.Kursi \t\t: "+ user.getKursi());
        System.out.println("=====================================================================");
        System.out.println("Kode Film \t\t: "+ user.getKode());
        System.out.println("Jam Tayang \t\t: "+ user.getJam()  + "WIB");
        System.out.println(" Harga Tiket \t\t: "+ user.getHarga());
        System.out.println("=====================================================================");
        System.out.println("============================ TERIMAKASIH ============================");
        System.out.println("============== SELAMAT MENONTON DAN SELAMAT WEEKEND =================");
        System.out.println("\n");
        input.close();

    }
}