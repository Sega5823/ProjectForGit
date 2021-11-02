import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение");
        String text = in.nextLine();
        String[] arrText = text.split(" ");
        System.out.println("В вашем предложении количество слов равно " + arrText.length);
    }
}