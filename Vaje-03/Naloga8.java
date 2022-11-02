import java.util.Scanner;
class Naloga8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steviloLetZaposlitve = sc.nextInt();
        int steviloOtrokZaposlenega = sc.nextInt();
        int placa = 400 + steviloLetZaposlitve * 20 + steviloOtrokZaposlenega * 30;
        System.out.println("Skupna placa zaposlenega znasa: " + placa + " enot");
        System.out.println("----------------");
        System.out.println("Osnova: " + 400 + " enot");
        System.out.println("Dodatek za leta: " + steviloLetZaposlitve * 20 + " enot za " + steviloLetZaposlitve + " let zaposlitve");
        System.out.println("Otroci: " + steviloOtrokZaposlenega * 30 + " enot za " + steviloOtrokZaposlenega + " otroka");

    }
}