import java.util.Objects;
import java.util.Scanner;

public class home_work_1_4 {
    public static void main(String[] args)
    {
        String vasya = "Вася";
        String anastasiya = "Анастасия";

        System.out.println("Добрый день. а вы кто?");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String input = in.next();

        switch (input){
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default: System.out.println("Добрый день. а вы кто?");
                break;
        }
    }
}