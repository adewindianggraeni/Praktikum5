public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Ade Windi Anggraeni", 8000000, 5000000);
        Programmer programmer = new Programmer("Indri Yanni", 6000000, 3000000);

        System.out.println("\n====== TUGAS PERTEMUAN 9 ======\n");

        System.out.println("===== MANAGER =====");
        System.out.println("Nama        : " + manager.nama);
        System.out.println("Gaji Pokok  : " + manager.gajiPokok);
        System.out.println("Tunjangan   : " + manager.tunjangan);

        System.out.println();

        System.out.println("===== PROGRAMMER =====");
        System.out.println("Nama        : " + programmer.nama);
        System.out.println("Gaji Pokok  : " + programmer.gajiPokok);
        System.out.println("Bonus       : " + programmer.bonus);

    }
}
