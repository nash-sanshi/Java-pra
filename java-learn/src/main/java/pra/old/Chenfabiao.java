package src.main.java.pra.old;

public class Chenfabiao {
    public static void printtest() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printtest();
    }

}