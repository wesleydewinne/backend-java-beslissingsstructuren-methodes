public class Main {
    public static void main(String[] args) {
        int number = 0;
        int input1 = 5;
        int input2 = 20;
        String name = "Henk";



        hello();
        positiveOrNegative(number);
        postiveOrZeroOrNegativ(number);
        bartender(name);
        sum(input1, input2);


    }

    private static void hello() {
        System.out.println("Hello World!");
    }

    private static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    private static void postiveOrZeroOrNegativ(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    private static void bartender(String name) {
        switch (name) {
            case "Henk":
                System.out.println("Henk wants a Bacardi cola");
                break;
            case "Klaas":
                System.out.println("Klaas wants a safari lemon");
                break;
            default:
                System.out.println("Vraag naar wat hij/zij wil drinken");

        }
    }

    private static void sum(int input1, int input2) {
        int sum = input1 + input2;
        System.out.println(sum);
    }

}