import java.util.Objects;
import java.util.Scanner;

public class home_work_1_3 {
    public static void main(String[] args)
    {
        String vasya = "Вася";
        String anastasiya = "Анастасия";

        System.out.println("Добрый день. а вы кто?");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String input = in.next();

        if (Objects.equals(vasya, input)){
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        }

        else if (Objects.equals(anastasiya, input)){
            System.out.println("Я тебя так долго ждал");
        }

        else{
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
