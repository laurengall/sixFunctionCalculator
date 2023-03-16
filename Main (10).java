import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean running = true;
    Scanner input = new Scanner(System.in);
    while (running) {
      System.out.println("What function would you like to perform?");

      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Raise to a Power");
      System.out.println("6. Find the Square Root");
      int function = input.nextInt();

      System.out.println("Enter your first number");
      double double1 = input.nextDouble();
      System.out.println("Enter your second number or type any number if getting a square root.");
      double double2 = input.nextDouble();
      switch (function) {
        case 1:
          System.out.println(add(double1, double2));
          break;
        case 2:
          System.out.println(sub(double1, double2));
          break;
        case 3:
          System.out.println(mult(double1, double2));
          break;
        case 4:
          System.out.println(div(double1, double2));
          break;
        case 5:
          System.out.println(pow(double1, double2));
          break;
        case 6:
          System.out.println(sqrt(double1));
          break;
        default:
          System.out.println("Not a function from the menu.");

          break;
      }

      System.out.println("Would you like to perform another calculation?\nEnter 1 for yes and 2 for no.");
      int runAgain = input.nextInt();
      if (runAgain == 2) {
        System.out.println("Have a nice day!");
        break;
      } else {
        running = true;
      }
    }
  }

  public static double add(double a, double b) {
    return a + b;
  }

  public static double sub(double a, double b) {
    return a - b;
  }

  public static double mult(double a, double b) {
    return a * b;
  }

  public static double div(double a, double b) {
    // check for divide by zero
    if (b == 0) {
      System.out.print("Cannot divide by zero: ");
      return 0;

    }
    return a / b;
  }

  public static double pow(double a, double b) {
    return Math.pow(a, b);
  }

  public static double sqrt(double a) {
    return Math.sqrt(a);
  }
}