class Uji {

    private static int x;

    public static void main(String[] args) {
        bujurSangkar bujur = new bujurSangkar();
        x = bujur.hitungLuas(4);
        System.out.println("luas bujurSangkar" + x);
        x = bujur.hitungKeliling(5);
        System.out.println("keliling bujur sangkar" + x);
        Persegi persegipanjang = new Persegi();
        x = persegipanjang.hitungLuas(6, 4);
        System.out.println("Luas persegi" + x);
        x = persegipanjang.hitungKeliling(6, 4);
        System.out.println("Keliling persegi" + x);
    }
}
