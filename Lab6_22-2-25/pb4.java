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
    private int hours;
    private int minutes;
    private int seconds;
    public void inputTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours > 24 || hours < 0) {
            throw new HrsException("InvalidHourException: hour must be between 0 and 24.");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes >= 60 || minutes < 0) {
            throw new MinException("InvalidMinuteException: minute must be between 0 and 59.");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds >= 60 || seconds < 0) {
            throw new SecException("InvalidSecondException: second must be between 0 and 59.");
        }
    }
    public void displayTime() {
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class pb4 {
    public static void main(String[] args) {
        Time time = new Time();

        try {
            time.inputTime();
            time.displayTime();
        } catch (HrsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
