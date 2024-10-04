import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[20];
        for(int i = 0; i < 20; i++){
            System.out.print("Digite el numero " + (i+1) + ":");
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < 20; i++){
            System.out.println("*******************************************");
            System.out.println("El numero en la posicion " + i + " es: " + numbers[i]);
            System.out.println("Su cuadrado es: " + numbers[i] * numbers[i]);
            System.out.println("Su cubo es: " + numbers[i] * numbers[i] * numbers[i]);
            System.out.println("*******************************************");
        }
    }
}