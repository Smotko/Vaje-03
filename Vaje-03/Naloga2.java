import java.util.Scanner;
class Naloga2 {
    public static void main(String[] args) {
        System.out.print("Vnesite uporabnisko ime:");
        Scanner sc = new Scanner(System.in);
        String ime = sc.nextLine();
        System.out.println("Pozdravljeni, " + ime + "!");
    }
}
