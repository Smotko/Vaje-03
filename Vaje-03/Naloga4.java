import java.util.Scanner;
class Naloga4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Pred zamenjavo: a=" + a + ", b=" + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Po zamenjavi: a=" + a + ", b=" + b);
    }
}
