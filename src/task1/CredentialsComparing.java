package task1;

import java.io.*;

public class CredentialsComparing {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    File file = new File("credentials");

    public boolean ensureIsCredsRight (String str) {
        boolean result = false;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                if (str.equals(line)){
                    Login login = new Login();
                    login.setUserLogged(true);
                    result = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void saveCredentials(String creds) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(creds);
        pw.close();

    }

}
