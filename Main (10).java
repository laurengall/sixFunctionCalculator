import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean running = true;
    Scanner input = new Scanner(System.in);
    while (running) {

      System.out.println("Enter your first number");
      double int1 = input.nextDouble();
      System.out.println("Enter your second number");
      double int2 = input.nextDouble();

      System.out.println("What function would you like to perform?");

      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Raise to a Power");

      int function = input.nextInt();
      switch (function) {
        case 1:
          System.out.println(add(int1, int2));
          break;
        case 2:
          System.out.println(sub(int1, int2));
          break;
        case 3:
          System.out.println(mult(int1, int2));
          break;
        case 4:
          System.out.println(div(int1, int2));
          break;
        case 5:
          System.out.println(pow(int1, int2));
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
    return a / b;
  }

  public static double pow(double a, double b) {
    return Math.pow(a, b);
  }

  public static double sqrt(double a) {
    return Math.sqrt(a);
  }
}