package task1;


public class Credentials {
    private String login, password;

    public Credentials (String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean compareTo(Credentials creds) {
        boolean result = false;
        CredentialsManager manager = new CredentialsManager();
        for (String cred : manager.getAllCredentials()) {
            if (creds.toString().equals(cred)) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return login + ";"
                + password;
    }

}
