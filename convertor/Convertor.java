import java.util.Scanner;

class Convertor {
    double value;

    public static void main(String args[]) {
        Convertor converter = new Convertor();
        converter.userInput();
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Distance Converter!");

        System.out.println("Select an option:");
        System.out.println("1. Centimeter to Meter");
        System.out.println("2. Meter to Centimeter");
        System.out.println("3. Meter to Kilometer");
        System.out.println("4. Kilometer to Meter");
        System.out.println("5. Kilometer to Centimeter");
        System.out.println("6. Centimeter to Kilometer");

        int choice = scanner.nextInt();

        System.out.println("Enter the value to convert:");
        value = scanner.nextDouble();

        switch (choice) {
            case 1:
                centimeterToMeter();
                break;
            case 2:
                meterToCentimeter();
                break;
            case 3:
                meterToKilometer();
                break;
            case 4:
                kilometerToMeter();
                break;
            case 5:
                kilometerToCentimeter();
                break;
            case 6:
                centimeterToKilometer();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }

        scanner.close();
    }

    public void centimeterToMeter() {
        double meters = value / 100;
        System.out.println(value + " centimeters is equal to " + meters + " meters.");
    }

    public void meterToCentimeter() {
        double centimeters = value * 100;
        System.out.println(value + " meters is equal to " + centimeters + " centimeters.");
    }

    public void meterToKilometer() {
        double kilometers = value / 1000;
        System.out.println(value + " meters is equal to " + kilometers + " kilometers.");
    }

    public void kilometerToMeter() {
        double meters = value * 1000;
        System.out.println(value + " kilometers is equal to " + meters + " meters.");
    }

    public void kilometerToCentimeter() {
        double centimeters = value * 100000;
        System.out.println(value + " kilometers is equal to " + centimeters + " centimeters.");
    }

    public void centimeterToKilometer() {
        double kilometers = value / 100000;
        System.out.println(value + " centimeters is equal to " + kilometers + " kilometers.");
    }
}

