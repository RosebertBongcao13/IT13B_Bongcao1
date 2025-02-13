package Prelim;

public class Lab_act1_Arithmetics {

    public static void main(String[] args) {

        // Initialize the variables
        int x = 10;
        int y = 4;
        int z = 6;

        // Expected Output: 10+4+6-46
        System.out.println(x + "+" + y + "+" + z + "-46 = " + (x + y + z - 46));

        // Expected Output: (10-4)%6-0
        System.out.println("(" + x + "-" + y + ")% " + z + "-0 = " + ((x - y) % z - 0));

        // Expected Output: (10+4+6)/3-6
        System.out.println("(" + x + "+" + y + "+" + z + ")/3-6 = " + ((x + y + z) / 3 - 6));

        // Expected Output: 106-(4*4)-44
        System.out.println("106-(" + y + "*" + y + ")-44 = " + (106 - (y * y) - 44));
    }
}
