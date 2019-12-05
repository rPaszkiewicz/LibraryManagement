package entity;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import entity.Admin;

public class Login {
    private HashMap<Integer,String> map;


    public Login()throws IOException{
        readPasswordFromFile();
    }
    private void readPasswordFromFile()throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dev Mąż\\Desktop\\java projects\\LibraryManagement\\src\\main\\java\\entity\\Password.txt"));
        String read = br.readLine();
        String[] arr = read.split("\\s");
        map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            map.put(i,arr[i]);
        }
    }
    public void authentication(String login, String password){
        if (login.equals(map.get(0)) && password.equals(map.get(1))){
            System.out.println("Access granted");
        }
        else
            System.out.println("Wrong login or password!");
    }

}
