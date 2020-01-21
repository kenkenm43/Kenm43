
import java.util.Scanner;

public class Menu {
        public static void main(String[] args) {
            int choice = 0;
            do{
                choice = menu();
                switch(choice){
                    case 1:
                        System.out.println("1. New Club");
                        break;
                    case 2:
                        System.out.println("2. Membership Subscribe");
                        break;
                    case 3:
                        System.out.println("3. Edit Membership Information");
                        break;
                    case 4:
                        System.out.println("4. Membership Unsubscribe");
                        break;
                    case 5:
                        System.out.println("5. List Members");
                        break;
                    case 6:
                        System.out.println("6. Exit");
                        break;
                     default:
                         System.out.println("Please choose 1-6");
                         break;
                }
            }while(choice != 6);
            
}
        public static int menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("\t<<Main Menu>>");
            System.out.println("1. New Club");
            System.out.println("2. Membership Subscribe");
            System.out.println("3. Edit Membership Information");
            System.out.println("4. Membership Unsubscribe");
            System.out.println("5. List Members");
            System.out.println("6. Exit");
            System.out.print("Enter Your Menu[1-6]:");
            int select = sc.nextInt();
            sc.nextLine();
            return select;
        }
        

}
