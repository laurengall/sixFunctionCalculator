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
          add(double1, double2);
          break;
        case 2:
          sub(double1, double2);
          break;
        case 3:
          mult(double1, double2);
          break;
        case 4:
          div(double1, double2);
          break;
        case 5:
          pow(double1, double2);
          break;
        case 6:
          sqrt(double1);
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

  public static void add(double a, double b) {
    double c = a + b;
    System.out.println(a + " + " + b + " = " + c);
  }

  public static void sub(double a, double b) {
    double c = a - b;
    System.out.println(a + " - " + b + " = " + c);
  }

  public static void mult(double a, double b) {
    double c = a * b;
    System.out.println(a + " x " + b + " = " + c);
  }

  public static void div(double a, double b) {
    // check for divide by zero
    if (b == 0) {
      System.out.print("Cannot divide by zero: ");

    } else {
      double c = a / b;
      System.out.println(a + " / " + b + " = " + c);
    }

  }

  public static void pow(double a, double b) {
    double c = Math.pow(a, b);
    System.out.println(a + " to the power of " + b + " = " + c);
  }

  public static void sqrt(double a) {
    double c = Math.sqrt(a);
    System.out.println("The square root of " + a + " = " + c);
  }
}