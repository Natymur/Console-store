package task1;

import java.io.*;

public class Login {
    private static boolean userLogged = false;
    private String login, password;

    public void setUserLogged(boolean userLogged) {
        this.userLogged = userLogged;
    }
    public boolean isUserLogged() {
        return userLogged;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public boolean login() throws IOException {
        enterCredentials();
        String str = login + ";" + password;
        CredentialsComparing comparing = new CredentialsComparing();
        return comparing.getAllCredentials(str);
    }

    public boolean register() throws IOException {
        User user = new User();

        System.out.println("Enter your name, please");
        user.setName(reader.readLine());
        System.out.println("Enter your last name, please");
        user.setLastName(reader.readLine());
        System.out.println("Enter your email, please");
        user.setEmail(reader.readLine());

        enterCredentials();
        CredentialsComparing addCreds = new CredentialsComparing();
        addCreds.saveCredentials(login + ";" + password);

        user.setId(user.getId()+1);
        return false;
    }

    private void enterCredentials() throws IOException {
        System.out.println("Enter login, please");
        login = reader.readLine();
        System.out.println("Enter password, please");
        password = reader.readLine();
    }
}
