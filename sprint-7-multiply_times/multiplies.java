import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplies {
    public static Integer validator (Scanner input){
        try {
            int check = input.nextInt();
            return (check >= 1 && check <= 20) ? check : null;
        }catch (InputMismatchException e){
            input.next();
            System.out.println("Please enter a number");
            return null;
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int multiplyTimes = 1;
        Integer limitNumber;

        System.out.println("Hola intoduce un numero entre 1 - 20 por favor:");
        do{
            limitNumber = validator(scanner);
        }
        while (validator(scanner) == null);

        for(int i = 0; i <= limitNumber; i++){
            System.out.println(multiplyTimes = i*limitNumber);
        }

    }

}
