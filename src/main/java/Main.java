import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Sistema sistema = new Sistema();

        System.out.println("Enter name: ");
        sistema.name = leia.nextLine();
        System.out.println("Enter nota 1:");
        sistema.nota1 = leia.nextDouble();
        System.out.println("Enter nota 2:");
        sistema.nota2 = leia.nextDouble();
        System.out.println("Enter nota 3:");
        sistema.nota3 = leia.nextDouble();

        System.out.printf("Final Grade: %.2f\n",sistema.mediageral());
        if(sistema.mediageral()<60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points\n",sistema.missingPoints());
        }else{
            System.out.println("PASS");
        }
        leia.close();





    }
}
