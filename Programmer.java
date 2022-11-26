public class Programmer extends Pegawai{

    protected double bonus;

    public Programmer(String nama, double gajiPokok, double bonus){
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    // SETTER
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    // GETTER
    public double getBonus(){
        return bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakBonus();
    }

    public void cetakBonus(){
        setNama("Indri Yanni");
        setGajiPokok(6000000);
        setBonus(3000000);

        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Bonus: " + getBonus());
    }
}