package entity;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner reader = new Scanner(System.in);
        /*Login login = new Login();
        Admin admin = new Admin();

        System.out.println("Login:");
            String loginMessage = reader.next();
        System.out.println("Password:");
            String passwordMessage = reader.next();
            login.authentication(loginMessage, passwordMessage);

        System.out.println("enter new login");
            String newLogin = reader.next();
        System.out.println("enter new password:");
            String newPassword = reader.next();
            admin.changeLoginAndPassword(newLogin,newPassword);*/

        //login.authentication(loginMessage,passwordMessage);

        Admin admin = new Admin();
        admin.addLibrarian(new Librarian("Malinowska","Mania"));
        admin.addLibrarian(new Librarian("Maisy","Crazy"));
        admin.addLibrarian(new Librarian("Baisy","Pu"));

        admin.viewLibrarian();
        admin.removeLibrarianByName("Maisy");
        admin.viewLibrarian();
    }
}
