package supermarket;

public class MainToko {
    public static void main(String[] args) {
        SuperMarket toko = new SuperMarket(17000, 12000, 33700, 77400, 20000, 53000);
        toko.tampilkanHarga();

        PeriodePromosi periodePromosi = new PeriodePromosi(17000, 12000, 33700, 77400, 20000, 53000);
        periodePromosi.tampilkanHarga();
    }
}
