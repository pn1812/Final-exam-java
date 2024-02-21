import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    int[] numbers = new int[5];
    int i = 0;
        System.out.println("Input number : ");
        while (true){
            number = scanner.nextInt();
            if(number<0){
                break;
            }
            numbers[i] = number;
            i++;
        }
        System.out.println("Entered numbers:");
        System.out.print("[ ");
        for (int j = 0; j < i; j++) {
            System.out.print(numbers[j] + " ");
        }
        scanner.close();
        System.out.println("]");
    }
}