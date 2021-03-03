package task1;

import java.io.*;
import java.util.ArrayList;

public class User {
    private int id;
    private String name, lastName, role, email, login, password;
    private boolean userLogged = false;


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    File file = new File("credentials");



    public void setUserLogged(boolean userLogged) {
        this.userLogged = userLogged;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isUserLogged() {
        return userLogged;
    }

    public User() {

    }

    ArrayList<String> credentials = new ArrayList<>();

    public boolean register() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        System.out.println("Enter your name, please");
        name = reader.readLine();
        System.out.println("Enter your last name, please");
        lastName = reader.readLine();
        System.out.println("Enter your email, please");
        email = reader.readLine();

        System.out.println("Enter login, please");
        login = reader.readLine();
        System.out.println("Enter password, please");
        password = reader.readLine();
        pw.println(login + " " + password);
        credentials.add(login + " " + password);
        pw.close();

        if(!compare(login + " " + password)){
            setUserLogged(true);
            id++;
            return true;
        } else {
            return false;
        }
    }

    public boolean login() throws IOException {

        System.out.println("Enter your login, please");
        login = reader.readLine();
        System.out.println("Enter your password, please");
        password = reader.readLine();

        String str = login + " " + password;

        return compare(str);
    }

    private boolean compare (String str) {
        try {
        reader = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {

            line = reader.readLine();
            list.add(line);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean result = false;

        for (String cred : credentials){
            if (str.equals(cred)) {
                setUserLogged(true);
                result = true;
                break;
            }
        }
        return result;
    }
}
