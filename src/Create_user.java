import java.util.Scanner;
import java.util.Vector;
public class Create_user {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int password;
    private String inputName;
    private int inputPassword;
    public String getName() { return name; }
    public int getPassword() { return password; }
    public void setName(String name) { this.name = name; }
    public void setPassword(int password) { this.password = password; }
    public int getInputPassword() { return inputPassword; }
    public String getInputName() {
        return inputName;
    }
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }
    public void setInputPassword(int inputPassword) {
        this.inputPassword = inputPassword;
    }

    public void Create_user_object(){
        Create_user_name();
        Create_user_password();
        System.out.println("регистрация прошла успешно");
    }
    public void Create_user_name(){
        System.out.println("Введите имя пользователя:");
        String x;
        x = scan.next();
        setName(x);
    }
    public void Create_user_password(){
        System.out.println("Введите пароль пользователя:");
        int x;
        x = scan.nextInt();
        setPassword(x);
    }

    public void Login_user(){
        System.out.println("Войдите в аккаунт");
        System.out.println("Введите ваше имя:");
        String x;
        x = scan.next();
        setInputName(x);
        System.out.println("Введите ваш пароль:");
        int y;
        y = scan.nextInt();
        setInputPassword(y);
    }

    public boolean password_and_name_verification(){
        if((getInputName().equals(getName()) && getInputPassword() == getPassword())) {
            return true;
        }
        else {

            return false;
        }
    }

}
