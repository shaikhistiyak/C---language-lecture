import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Scanner objectname = new Scanner(System.in);
        Scanner takeinput = new Scanner(System.in);
        int age;
        System.out.printf("Enter your age here: ");;
        age = takeinput.nextInt();

        System.out.println("age : "+age);
        
        takeinput.nextLine();

        String name;
        System.out.printf("Enter your name here: ");
        name = takeinput.nextLine();

        System.out.println("name: "+name);

        takeinput.close();

    }
}
