package Prelim;

public class Lab_act1_Arithmetics {

    public static void main(String[] args) {

        int x = 10; // First number
        int y = 4;  // Second number
        int z = 6;  // Third number

        // Corrected output statements
        System.out.println(x + "*" + y + "+" + z + "-46"); // 10*4+6-46
        System.out.println("(" + x + "-" + y + ")%" + z + "=0"); // (10-4)%6=0
        System.out.println("(" + x + "+" + y + "+" + z + ")/3=" + ((x + y + z) / 3)); // (10+4+6)/3=6
        System.out.println(x + "*" + z + "-(" + y + "*" + y + ")=" + (x * z - (y * y))); // 10*6-(4*4)=44
    }
}