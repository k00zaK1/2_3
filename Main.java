import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("Podaj pierwszą liczbę: " );
      int a = scanner.nextInt();
      
      System.out.print("Podaj drugą liczbę: " );
      int b = scanner.nextInt();

      int suma = a + b;
      System.out.println("Suma liczb " +suma);
}
}
  
