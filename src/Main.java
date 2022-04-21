import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRepeat = true;
        while(isRepeat == true){
            System.out.print("Number: ");
            byte number = scanner.nextByte();
            if (number % 5 == 0 && number % 3 == 0){
                System.out.println("FizzBuzz");
            }else if (number % 3 == 0 ){
                System.out.println("Buzz");
            } else if (number % 5 == 0) {
                System.out.println("Fizz");
            } else{
                System.out.println(number);
            }

            boolean isRepeatValidated = false;
            while(isRepeatValidated == false){
                System.out.println("Again (y/n): ");
                String input = scanner.next();
                switch (input){
                    case "y":
                        isRepeat = true;
                        isRepeatValidated = true;
                        break;
                    case  "n":
                        isRepeat = false;
                        isRepeatValidated = true;
                        break;
                    default:
                        System.out.println("Please input \"y\" for yes or \"n\" for no");
                        isRepeatValidated = false;
            }

            }
        }
    }
}