import java.util.Scanner;
public class Main{

public static void main(String[] args) {
Scanner userInput =new Scanner(System.in);
String bd[][] = {{"dog","123"},{"cat","321"},{"bird","123"}};

boolean authorization = false;

while(!authorization) {

System.out.println("Login ?");
String userLogin = userInput.nextLine();

System.out.println("Password ?");
String userPassword = userInput.nextLine();

for(String[] data : bd) {
String login = data[0];
String password = data[1];

if(userLogin.equals(login) && userPassword.equals(password)) {
System.out.println("Good");
authorization = true;
break;
}
}

if(!authorization) {
System.out.println("Ошибка");
}
}

}

}
