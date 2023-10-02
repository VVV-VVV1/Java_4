import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Create_user user = new Create_user();
        Manager manager = new Manager();
        user.Create_user_object();
        user.Login_user();
        boolean x = user.password_and_name_verification();
        if(x){
            System.out.println("вы вошли!");
            manager.choice();
        }
        else {
            System.out.println("имя или пароль не верны");
        }
    }
}
