import java.util.Scanner;
class Naloga0 {
    public static void main(String[] args) {
        int a = 5;
        String s =  "vrednost";
        System.out.println("naloga0: " + s + " " + a);

        System.out.print("Vnesi vrednost: ");
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        System.out.println(stevilo);
    }
}