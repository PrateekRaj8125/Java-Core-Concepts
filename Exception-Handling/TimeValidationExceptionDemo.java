/* Write a Java program to validate time using user-defined exceptions.
The program should:

Accept hours, minutes, and seconds from the user
Validate:
    Hours → 0 to 24
    Minutes → 0 to 59
    Seconds → 0 to 59
Create separate custom exceptions for invalid hours, minutes, and seconds
Throw and handle exceptions appropriately
Display the time if all inputs are valid
*/
import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours, minutes, seconds;

    public void inputTime(Scanner sc) throws HrsException, MinException, SecException {

        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new HrsException("InvalidHourException: hour must be between 0 and 24.");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes < 0 || minutes >= 60) {
            throw new MinException("InvalidMinuteException: minute must be between 0 and 59.");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds < 0 || seconds >= 60) {
            throw new SecException("InvalidSecondException: second must be between 0 and 59.");
        }
    }

    public void displayTime() {
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class TimeValidationExceptionDemo {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Time time = new Time();

            try {
                time.inputTime(sc);
                time.displayTime();
            } catch (HrsException | MinException | SecException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}