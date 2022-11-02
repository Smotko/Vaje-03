import java.util.Scanner;
class Naloga5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cenaRacunalnika = sc.nextInt();
        int ddv = sc.nextInt();
        System.out.println("Cena racunalnika: " + cenaRacunalnika + " enot");
        System.out.println("DDV: " + ddv + "%");
        System.out.println("--------------------------");
        int skupnaCena = cenaRacunalnika + cenaRacunalnika * ddv / 100;
        System.out.println("Skupna cena: " + skupnaCena + " enot");
    }
}
