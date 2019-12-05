package entity;
import dao.LibrarianDao;

import java.util.ArrayList;
import java.util.List;


public class Admin {
    private LibrarianDao librarianDao;

    public Admin(){
        this.librarianDao = new LibrarianDao();
    }

    /*public void changeLoginAndPassword(String login, String password)throws IOException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\Dev Mąż\\Desktop\\java projects\\LibraryManagement\\src\\main\\java\\entity\\Password.txt"));
        pw.write(login + " ");
        pw.write(password + " ");
        pw.close();
        System.out.println("Success!");
    }*/
    //@Override
    public void addLibrarian(Librarian librarian){
        librarianDao.add(librarian);
    }
    //@Override
    public void viewLibrarian(){
        /*for (Object s:librarianDao.getLibrarianList()){
            System.out.println(s.toString());
        }*/
        librarianDao.getLibrarianList();

    }
    //@Override
    public void removeLibrarianByName(String name){
        librarianDao.removeLibrarianByName(name);
    }
}
