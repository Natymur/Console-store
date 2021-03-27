package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public Menu() {
    }

    public void showPages() throws IOException {
        boolean exit = false;
        while (!exit) {
            showMenu();

            Login login = new Login();
            int menuInput = Integer.parseInt(reader.readLine());
            if (menuInput == 1 && login.isUserLogged()) {
                //action
            } else if (menuInput == 2 && login.isUserLogged()) {
                //action
            } else if (menuInput == 3 && login.isUserLogged()) {
                //action
            } else if (menuInput == 4) {
                System.out.println("Enter \"login\", \"register\", or \"exit\"");
                String input = reader.readLine();
                while (!exit) {
                    if (input.equals("register")) {
                        login.register();
                        System.out.println("You are successfully registered");
                        break;
                    }
                    else if (input.equals("login")) {
                        if (login.login()){
                            System.out.println("You are successfully logged");
                        } else {
                            System.out.println("Login or password is invalid. Try again please");
                        }
                        break;
                    }
                    else if(input.equals("exit")) {
                        exit = true;
                    }
                    else {
                        System.out.println("Invalid input. Try again, please.");
                    }
                }
                //action
            } else if (menuInput == 5) {
                exit = true;
            } else if (login.isUserLogged() == false) {
                System.out.println("Log in or register, please");
            } else {
                System.out.println("Invalid number. Try again, please.");
            }
        }
    }
    

    public void showMenu() {
        System.out.println(
                "Press the number:" + "\n"
                        + "1 - Store" + "\n"
                        + "2 - Basket" + "\n"
                        + "3 - Profile" + "\n"
                        + "4 - Login" + "\n"
                        + "5 - Exit" + "\n"

        );
    }
}
