/*
 * Nama : Maulana Hafizul Haq
 * Nim  : 21343054
 */
public class Nomor2 {
    public static void main(String[] args) {
        int x = 5;

        for (int a = 0; a <= x - 1; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= x - 1; c++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int a = x; a >= 0; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= x - 1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
