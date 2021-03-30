package task1;

import java.io.*;
import java.util.Scanner;

public class CredentialsComparing {

    File file = new File("credentials");
    Scanner scanner;

    public boolean getAllCredentials (String str) {
        boolean result = false;
        try {
            FileReader fr= new FileReader(file);
            scanner = new Scanner(fr);
            result = compareCredentials(str);
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean compareCredentials(String str){
        boolean result = false;
        while (scanner.hasNextLine()) {
            if (str.equals(scanner.nextLine())){
                result = true;
                break;
        }
    }
        return result;
    }


    public void saveCredentials(String creds) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(creds);
        pw.close();
    }


}
