package supermarket;

class SuperMarket {
    private double hgBarang1;
    private double hgBarang2;
    private double hgBarang3;
    private double hgBarang4;
    private double hgBarang5;
    private double hgBarang6;

    // Konstruktor
    public SuperMarket(double hgBarang1, double hgBarang2, double hgBarang3, double hgBarang4, double hgBarang5, double hgBarang6) {
        this.hgBarang1 = hgBarang1;
        this.hgBarang2 = hgBarang2;
        this.hgBarang3 = hgBarang3;
        this.hgBarang4 = hgBarang4;
        this.hgBarang5 = hgBarang5;
        this.hgBarang6 = hgBarang6;
    }

    public void tampilkanHarga() {
        System.out.println("=====================================");
        System.out.println("        Harga Awal SuperMarket             ");
        System.out.println("=====================================");
        System.out.printf("%-20s: Rp %,10.2f\n", "Sabun Lux", hgBarang1);
        System.out.printf("%-20s: Rp %,10.2f\n", "Pepsodent", hgBarang2);
        System.out.printf("%-20s: Rp %,10.2f\n", "Charm", hgBarang3);
        System.out.printf("%-20s: Rp %,10.2f\n", "Hilo Teen", hgBarang4);
        System.out.printf("%-20s: Rp %,10.2f\n", "Nivea Deo", hgBarang5);
        System.out.printf("%-20s: Rp %,10.2f\n", "Parfume Paris", hgBarang6);
        System.out.println("=====================================");
    }

    // Getter untuk harga barang
    public double getHgBarang1() {
        return hgBarang1;
    }

    public double getHgBarang2() {
        return hgBarang2;
    }

    public double getHgBarang3() {
        return hgBarang3;
    }

    public double getHgBarang4() {
        return hgBarang4;
    }

    public double getHgBarang5() {
        return hgBarang5;
    }

    public double getHgBarang6() {
        return hgBarang6;
    }
}

class PeriodePromosi extends SuperMarket {

    // Konstruktor
    public PeriodePromosi(double hgBarang1, double hgBarang2, double hgBarang3, double hgBarang4, double hgBarang5, double hgBarang6) {
        super(hgBarang1, hgBarang2, hgBarang3, hgBarang4, hgBarang5, hgBarang6);
    }

    @Override
    public void tampilkanHarga() {
        System.out.println("=====================================");
        System.out.println("       Periode Promosi DISC30%       ");
        System.out.println("=====================================");
        System.out.printf("%-20s: Rp %,10.2f\n", "Sabun Lux", hitungDiskon(getHgBarang1()));
        System.out.printf("%-20s: Rp %,10.2f\n", "Pepsodent", hitungDiskon(getHgBarang2()));
        System.out.printf("%-20s: Rp %,10.2f\n", "Charm", hitungDiskon(getHgBarang3()));
        System.out.printf("%-20s: Rp %,10.2f\n", "Hilo Teen", hitungDiskon(getHgBarang4()));
        System.out.printf("%-20s: Rp %,10.2f\n", "Nivea Deo", hitungDiskon(getHgBarang5()));
        System.out.printf("%-20s: Rp %,10.2f\n", "Parfume Paris", hitungDiskon(getHgBarang6()));
        System.out.println("=====================================");
    }

    // Metode untuk menghitung harga Diskon 30%
    private double hitungDiskon(double harga) {
        return harga * 0.7;
    }
}
