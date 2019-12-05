package entity;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String name;
    private String lastName;
    private static int id = 0;

    public Librarian(){
        incrementIdNumber();
    }
    public Librarian(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        incrementIdNumber();
    }

    private static void incrementIdNumber(){
        id++;
    }

    @Override
    public String toString(){
        return name + " " + lastName;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getId() {
        return id;
    }
}
