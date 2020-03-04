import java.util.Random;
public class Exercize1 {
    public static void main(String[] args) {
        int bread=0;
        Random eggs = new Random();
        if (eggs.nextBoolean() == true) {
            bread = 10;
            System.out.println("булок принёс" + " " + bread);
        }
        else
        System.out.println("булок принёс" + " " + (bread+1));
    }
}
