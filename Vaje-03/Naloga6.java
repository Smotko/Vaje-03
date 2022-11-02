import java.util.Scanner;
class Naloga6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int skupnaCena = sc.nextInt();
        int ddv = sc.nextInt();
        System.out.println("Skupna cena racunalnika: " + skupnaCena + " enot");
        System.out.println("DDV: " + ddv + "%");
        int osnovnaCena = 100 * skupnaCena / (100 + ddv);
        System.out.println("---------------------------------");
        System.out.println("Osnovna cena: " + osnovnaCena + " enot");
    }
}
