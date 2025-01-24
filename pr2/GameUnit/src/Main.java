import java.util.Random;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        Random random = new Random(100);

        System.out.println("Enter name: ");
        String Name = scannerString();

        Attacker HeroAttacker = new Hero(Name);

        Dragon DragonAttacker = new RedDragon(Name);



        while(true){
            int a = random.nextInt();
            int b = random.nextInt();
            String quest = "Сколько будет " + a + " - " + b;
            System.out.println(quest);
            DragonAttacker.question(quest);
            int UserInput = scannerInteger();
            boolean check = DragonAttacker.Check_answer(UserInput);
            if(check){
                System.out.println("Я тебя оставлю");
            }
            else{
                HeroAttacker.set_health(0);
                System.out.println("Ты убит\nGame over!");
                return;
            }
            return;
        }
    }


    public static int scannerInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static String scannerString(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.next();
    }
}