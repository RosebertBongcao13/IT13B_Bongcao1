/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm;
/**
 *
 * @author User
 */
public class Bongcao_Multi_Dimensional_Array_Number_2 {

    public static void main(String[] args) {
        int numbers[][] = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
        };
        
        for (int m = 0; m < numbers.length; m++) {
         System.out.print("The elements in Row " + (m + 1) + ": ");                 
         for (int j = 0; j < numbers[m].length; j++) {
         //System.out.print("The elements in Row " + (m + 1) + ": ");System
         //System.out.println(sds);
                System.out.print(numbers[m][j] + " ");
                
            }
            System.out.println();
        }

    }
}
