package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CredentialsManager {

    File file = new File("credentials");

    public List<String> getAllCredentials () {
        List <String> credentials = new ArrayList<>();
        try {
            FileReader fr= new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            credentials.add(reader.readLine());
            while (line != null) {
                line = reader.readLine();
                credentials.add(line);
            }
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return credentials;
    }

    public void saveCredentials(String creds) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(creds);
        pw.close();
    }
}
