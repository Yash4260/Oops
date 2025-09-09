public class MethodExample {
        public static void main(String[] args) {
            login("admin", "pass123");
            login("user", "userpass");
            logout();
        }

    private static void logout() {
        System.out.println("Logged out");
    }

    public static void login(String user, String pass) {
            System.out.println("Logging in with: " + user + " / " + pass);
        }
    }
