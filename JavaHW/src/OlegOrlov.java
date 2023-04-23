import java.util.Scanner;

public class OlegOrlov {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Привет, как тебя зовут?");

        String firstname = reader.nextLine();

        System.out.println(firstname + ", Какая у тебя фамилия?");

        String secondname = reader.nextLine();

        System.out.println("Приятно познакомится " + firstname + " " + secondname);

        String secondName = reader.nextLine();

    }
}
