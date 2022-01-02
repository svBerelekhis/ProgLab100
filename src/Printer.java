import java.util.Random;

public class Printer {
    static Random rand = new Random();
    static String[] helloWords = {"присоеденяется к пати", "создан", "теперь существует", "появился в этом мире", ", здравствуй"};
    public static void print(String string){
        System.out.println(string);
    }
    public static void sayHello(String string){
        String helloWord = helloWords[rand.nextInt(5)];
        System.out.println(string + helloWord);
    }
}
