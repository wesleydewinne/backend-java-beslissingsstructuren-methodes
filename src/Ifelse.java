import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Opdracht 1
        int number1 = 3;
        opdracht1(number1);

        // Opdracht 2
        float cijfer = 8f;
        opdracht2(cijfer);

        // Opdracht 3
        int count1 = 1;
        int count2 = 50;
        opdracht3(count1, count2);

        // Opdracht 4
        int number2 = 1;
        opdracht4(number2);

        // Opdracht 5
        int leeftijd = 80;
        opdracht5(leeftijd);

        // Opdracht 6
        String text = "Dit is meer dan 10 woorden";
        opdracht6(text);

        // Opdracht 7
        int jaar = 5;
        opdracht7(jaar);

        // Opdracht 8
        System.out.println("Voer het eerste getal in: ");
        int getal1 = scanner.nextInt();
        System.out.println("Voer het tweede getal in: ");
        int getal2 = scanner.nextInt();
        System.out.println("Voer het derde getal in: ");
        int getal3 = scanner.nextInt();

        opdracht8(getal1, getal2, getal3);

        // Opdracht 9
        System.out.println("Voer het eerste getal in: ");
        int driehoek1 = scanner.nextInt();
        System.out.println("Voer het tweede getal in: ");
        int driehoek2 = scanner.nextInt();
        int driehoek3 = 180 - (driehoek1 + driehoek2);

        opdracht9(driehoek1, driehoek2, driehoek3);

        // Opdracht 10
        System.out.println("Voer het eerste getal in: ");
        int count3 = scanner.nextInt();
        System.out.println("Voer het tweede getal in: ");
        int count4 = scanner.nextInt();
        System.out.println("Voeg een operator in ( + - * / )");
        String operator = scanner.next();

        opdracht10(count3, count4, operator);
    }

    // Opdracht 1
    private static void opdracht1(int number1) {
        if (number1 % 2 != 0) {
            System.out.println("Het getal " + number1 + " is oneven");
        } else {
            System.out.println("Het getal "+ number1 + " is even.");
        }
    }

    // Opdracht 2
    private static void opdracht2(float cijfer) {
        if (cijfer >= 8.0f) {
            System.out.println(cijfer + " A");
        } else if (cijfer >= 7.7f) {
            System.out.println(cijfer +  "A-");
        } else if (cijfer >= 7.4f) {
            System.out.println(cijfer + " B+");
        } else if (cijfer >= 7.0f) {
            System.out.println(cijfer + " B");
        } else if (cijfer >= 6.7f) {
            System.out.println(cijfer + " B-");
        } else if (cijfer >= 6.4f) {
            System.out.println(cijfer + " C+");
        } else if (cijfer >= 6.0f) {
            System.out.println(cijfer + " C");
        } else if (cijfer >= 5.5f) {
            System.out.println(cijfer + " C-");
        } else {
            System.out.println(cijfer + " F");
        }
    }

    //Opdracht 3
    private static void opdracht3(int count1, int count2) {
        if (count1 > count2) {
            System.out.println("De invoer van het tweede getal " + count1 + " groter getal dan de eerste invoer met getal " + count2);
        } else if (count2 > count1) {
            System.out.println("De invoer van het tweede getal " + count2 + " groter getal dan de eerste invoer met getal " + count1);
        } else {
            System.out.println("eerste invoer is gelijk" + count1 + "  met de tweede invoer " + count2 + "! ");
        }
    }

    //Opdracht 4
    private static void opdracht4(int number2) {
        if (number2 > 0) {
            System.out.println("Dit nummer " + number2 + " is positief");
        } else if (number2 < 0) {
            System.out.println("Dit nummer = " + number2 + " is negative");
        } else {
            System.out.println("Dit nummer = " + number2 + " is zero");
        }
    }

    //Opdracht 5
    private static void opdracht5(int leeftijd) {
        if (leeftijd <= 12) {
            System.out.println("Met deze leeftijd " + leeftijd + " ben je een kind");
        } else if (leeftijd <= 18) {
            System.out.println("Met deze leeftijd " + leeftijd + " ben je een puber");
        } else if (leeftijd <= 69) {
            System.out.println("Met deze leeftijd " + leeftijd + " ben je een volwassene");
        } else {
            System.out.println("Met deze leeftijd " + leeftijd + " ben je een senior");
        }
    }

    //opdracht 6
    private static void opdracht6(String text) {
        if (text.length() <= 20) {
            System.out.println("korter dan 10 tekens " + text);
        } else if (text.length() <= 40) {
            System.out.println("Tussen 10 en 20 tekens " + text);
        } else {
            System.out.println("langer dan 20 tekens " + text);
        }
    }

    //opdracht 7
    private static void opdracht7(int date) {
        if (date % 4 == 0){
            System.out.println("Dit jaar " + date + " is schrikkeljaar!");
        } else {
            System.out.println("Dit is " + date + " Geen schrikkeljaar");
        }
    }

    //Opdracht 8
    private static void opdracht8(int getal1, int getal2, int getal3) {
        if ( (getal1 > getal2) && (getal1 > getal3) ) {
            System.out.println(getal1 + " " + getal2 + " " + getal3 + " is getal de grootste " + getal1 );
        } else if ( (getal2 > getal1 ) && (getal2 > getal3)) {
            System.out.println(getal1 + " " + getal2 + " " + getal3 + " is getal de grootste " + getal2);
        } else {
            System.out.println(getal1 + " " + getal2 + " " + getal3 + " is getal de grootste " + getal3);
        }
    }

    //Opdracht 9
    private static void opdracht9(int driehoek1, int driehoek2, int driehoek3) {
        if ((driehoek1 + driehoek2 + driehoek3) == 180) {
            System.out.println("Dit is meer dan 180 graden  en is geen driehoek" );
        } else{
            System.out.println("\n Driehoek een is" + driehoek1 + "\n Driehoek twee is" + driehoek2 + "\n Dan is driehoek drie " + driehoek3 + " graden");
        }
            if (driehoek1 == driehoek2 && driehoek2 == driehoek3) {
                System.out.println("\n Gelijkzijdige driehoek");
            } else if ( (driehoek1 == driehoek2) || (driehoek1 == driehoek3) || (driehoek2 == driehoek3)){
                System.out.println("\n Gelijkbenige driehoek");
            } else {
                System.out.println("\n Ongelijkzijdige driehoek");
            }
    }

    // Opdracht 10
    private static void opdracht10(int count3, int count4, String operator) {
        if (operator.equals("+")) {
            System.out.println((count3 + count4) + " = " + count3 + " + " + count4);
        } else if (operator.equals("-")) {
            System.out.println((count3 - count4) + " = " + count3 + " - " + count4);
        } else if (operator.equals("*")) {
            System.out.println((count3 * count4) + " = " + count3 + " * " + count4);
        } else if (operator.equals("/")) {
            if (count4 != 0) {
                System.out.println((count3 / count4) + " = " + count3 + " / " + count4);
            } else {
                System.out.println("Delen door nul is niet toegestaan.");
            }
        } else {
            System.out.println("Ongeldige operator. Gebruik +, -, * of /.");
        }
    }

}