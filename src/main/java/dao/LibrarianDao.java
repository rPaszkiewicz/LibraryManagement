package dao;

import entity.Librarian;
import java.util.ArrayList;
import java.util.List;

public class LibrarianDao {
    private List<Librarian> librarianList;
    private Librarian librarian;

    public LibrarianDao() {
        this.librarianList = new ArrayList<>();
        this.librarian = new Librarian();
    }

    public void add(Librarian librarian) {
        librarianList.add(librarian);
    }

    public void getLibrarianList() {
        librarianList.forEach(System.out::println);
    }

    public void removeLibrarianByName(String name) {
        for (Librarian l:librarianList) {
            if (librarian.getName().equals(name)) {
                librarianList.remove(l);
                System.out.println(name + " removed.");
            } else
                System.out.println(name + " not found.");
        }
    }
}
