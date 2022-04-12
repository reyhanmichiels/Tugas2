package TugasPemlan2;
import java.util.*;

public class MenghitungLuas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pilih = scan.nextInt();

        if (pilih == 1){
            int n = scan.nextInt();
            Persegi persegi = new Persegi(n);
            System.out.println(persegi.getLuas());
        }

        else if (pilih == 2){
            int n = scan.nextInt();
            int m = scan.nextInt();
            Segitiga segitiga = new Segitiga(n, m);
            System.out.println(segitiga.getLuas());
        }

        else if (pilih == 3){
            int n = scan.nextInt();
            Lingkaran lingkaran = new Lingkaran(n);

            if (n % 7 == 0)
                System.out.println(lingkaran.getLuas());
            else
                System.out.println(lingkaran.getLuas2());
        }

        else
            System.out.println("Input yang anda masukan tidak sesuai");
    }
}

class Lingkaran{
    int jari;

    Lingkaran(int jari){
        this.jari = jari;
    }

    double getLuas(){
        return 22 / 7 * jari * jari ;
    }

    double getLuas2(){
        return (int) (3.14 * jari * jari);
    }
}

class Persegi{
    int sisi;

    Persegi (int sisi) {
        this.sisi = sisi;
    }

    int getLuas() {
        return sisi * sisi;
    }
}

class Segitiga{
    int alas;
    int tinggi;

    Segitiga (int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    int getLuas (){
        return alas * tinggi / 2;
    }
}
