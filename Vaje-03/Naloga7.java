import java.util.Scanner;
class Naloga7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cas = sc.nextFloat();
        int pot = sc.nextInt();
        System.out.println("Pot: " + pot + " km");
        System.out.println("Cas: " + cas + " h");
        System.out.println("----------");
        float povprecnaHitrost = pot / cas;
        System.out.println("Povprecna hitrost: " + povprecnaHitrost + " km/h");
    }
}
