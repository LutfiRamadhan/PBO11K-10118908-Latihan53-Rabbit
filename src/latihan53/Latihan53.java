/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan53;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is "+r.getName());
        System.out.println("Peter is Vegetarian? "+r.isVegetarian());
        System.out.println("Peter eats "+r.getEats());
        System.out.println("Peter has "+r.getNoOfLegs()+" legs.");
        System.out.println("Peter color is "+r.getColor());
    }

}
