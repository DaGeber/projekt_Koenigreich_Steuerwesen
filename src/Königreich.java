import java.util.Scanner;

public class Königreich {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        boolean ablauf = true;
        String name;
        int einkommen;
        Einwohner einwohner;
        while (ablauf) {
            System.out.println("Was wollen Sie tun?");
            System.out.println("1. Steuerausgabe");
            System.out.println("2. Beenden");
            System.out.print("Eingabe: ");
            int auswahl = eingabe.nextInt();
            switch (auswahl) {
                case 1:
                    boolean richitgeGruppe = false;
                    while (!richitgeGruppe){
                        System.out.print("Geben Sie die Bevölkerungsgruppe an: ");
                        String gruppe = eingabe.next();
                        switch (gruppe) {
                            case "König":
                                System.out.print("Geben Sie den Namen an: ");
                                name = eingabe.next();
                                System.out.print("Geben Sie das Einkommen an: ");
                                einkommen = eingabe.nextInt();
                                einwohner = new König(name,einkommen);
                                richitgeGruppe = true;
                                break;
                            case "Adel":
                                System.out.print("Geben Sie den Namen an: ");
                                name = eingabe.next();
                                System.out.print("Geben Sie das Einkommen an: ");
                                einkommen = eingabe.nextInt();
                                einwohner = new Adel(name,einkommen);
                                richitgeGruppe = true;
                                break;
                            case "Bauer":
                                System.out.print("Geben Sie den Namen an: ");
                                name = eingabe.next();
                                System.out.print("Geben Sie das Einkommen an: ");
                                einkommen = eingabe.nextInt();
                                einwohner = new Bauer(name,einkommen);
                                richitgeGruppe = true;
                                break;
                            case "Leibeigen":
                                System.out.print("Geben Sie den Namen an: ");
                                name = eingabe.next();
                                System.out.print("Geben Sie das Einkommen an: ");
                                einkommen = eingabe.nextInt();
                                einwohner = new Leibeigen(name,einkommen);
                                richitgeGruppe = true;
                                break;
                            default:
                                System.out.println("Bitte geben Sie eine richtige Bevölkerungsgruppe ein.");
                                System.out.println("Auswahl: König, Adel, Bauer oder Leibeigen");
                                break;
                        }
                    }




                    break;
                case 2:
                    System.out.println("Sie haben das Programm beendet!");
                    ablauf = false;
                    break;
                default:
                    System.out.println("Bitte treffen Sie ein Auswahl!");
                    break;
            }
        }
    }
}
