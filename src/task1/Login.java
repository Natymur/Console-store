package task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Login {
    private static boolean userLogged = false;

    public void setUserLogged(boolean userLogged) {
        this.userLogged = userLogged;
    }
    public boolean isUserLogged() {
        return userLogged;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    CredentialsManager manager = new CredentialsManager();

    public boolean login() throws IOException {

        Credentials credentials = enterCredentials();
        return credentials.compareTo(credentials);
    }

    public boolean register() throws IOException {
        User user = new User();
        String name;
        String lastName;
        String email;

        do{
        System.out.println("Enter your name, please");
        name = reader.readLine();
        }
        while (name.trim().isEmpty());
        user.setName(name);

        do{
        System.out.println("Enter your last name, please");
        lastName = reader.readLine(); }
        while (lastName.trim().isEmpty());
        user.setLastName(lastName);

        do{
        System.out.println("Enter your email, please");
        email = reader.readLine();}
        while (email.trim().isEmpty());
        user.setEmail(email);

        manager.saveCredentials(enterCredentials().toString());
        User.setId(User.getId()+1);
        System.out.println(user.getId());

        return false;
    }

    private Credentials enterCredentials() throws IOException {

        String login;
        String password;

        do{
        System.out.println("Enter login, please");
        login = reader.readLine();}
        while (login.trim().isEmpty());

        do{
        System.out.println("Enter password, please");
        password = reader.readLine();}
        while (password.trim().isEmpty());

        return new Credentials(login, password);
    }
}
