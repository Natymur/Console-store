package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void showPages() throws IOException {
        boolean exit = false;
        Login login = new Login();

        while (!exit) {
            showMainMenu();

            int menuInput = Integer.parseInt(reader.readLine());

            switch (menuInput) {
                case 1:
                    if(login.isUserLogged()){
                        System.out.println("case 1");
                    }else{
                        System.out.println("Login or register, please");
                    }
                    break;

                case 2:
                    if(login.isUserLogged()){
                        System.out.println("case 2");
                    }else{
                        System.out.println("Login or register, please");
                    }
                    break;

                case 3:
                    if(login.isUserLogged()){
                        System.out.println("case 3");
                    }else{
                        System.out.println("Login or register, please");
                    }
                    break;

                case 4:
                    loginChoice(login);
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid number. Try again, please.");
            }
        }
    }

    public void loginChoice(Login login) throws IOException {
        boolean back = false;
        while (!back) {
            showLoginMenu();
            int loginInput = Integer.parseInt(reader.readLine());

            switch (loginInput) {
                case 1:
                    if (login.login()) {
                        login.setUserLogged(true);
                        System.out.println("You are successfully logged");
                        back = true;
                    } else {
                        System.out.println("Login or password is invalid. Try again please");
                    }
                    break;
                case 2:
                    login.register();
                    login.setUserLogged(true);
                    System.out.println("You are successfully registered");
                    back = true;
                    break;
                case 3:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid number. Try again, please.");
            }
        }
    }


    public void showMainMenu() {
        System.out.println(
                "---------------" + "\n"
                        + "Select an item:" + "\n"
                        + "---------------" + "\n"
                        + "|1| - Store   |" + "\n"
                        + "|2| - Basket  |" + "\n"
                        + "|3| - Profile |" + "\n"
                        + "|4| - Login   |" + "\n"
                        + "|5| - Exit    |" + "\n"
                        + "---------------" + "\n"
        );
    }

    public void showLoginMenu() {
        System.out.println(
                "---------------" + "\n"
                        + "Select an item:" + "\n"
                        + "----------------" + "\n"
                        + "|1| - Login    |" + "\n"
                        + "|2| - Register |" + "\n"
                        + "|3| - Back     |" + "\n"
                        + "----------------" + "\n"
        );
    }
}
