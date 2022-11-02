import java.util.Scanner;
class Naloga10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dolzina1 = sc.nextInt();
        int dolzina2 = sc.nextInt();
        int cenaNaKvadratniMeter = sc.nextInt();
        int skupnaCenaSobe = dolzina1 * dolzina2 * cenaNaKvadratniMeter;
        System.out.println("Dolzina strani 1: " + dolzina1 + " m");
        System.out.println("Dolzina strani 2: " + dolzina2 + " m");
        System.out.println("Cena na kvadratni meter: " + cenaNaKvadratniMeter + " enot");
        System.out.println("----------------------------------");
        System.out.println("Skupna cena sobe: " + skupnaCenaSobe + " enot");
    }
}
