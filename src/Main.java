import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ordenando numeros de menor a mayor :D");

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(number1 < number2){
            System.out.println(number1 + ", " + number2);
        }else{
            System.out.println(number2 + ", " + number1);
        }
    }
}