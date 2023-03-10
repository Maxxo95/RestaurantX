/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class User   {
    private String user = "Empty";
    private String pass ;
    String passw ;
    String usernames ;
        String username;
    String password;
    ArrayList<String> readinput = new ArrayList<String>();
    //ArrayList<String> name = new ArrayList<String> ();
    //ArrayList<String> pass = new ArrayList<String> ();
    //String name;
   // String pass;
    File userinput = new File("C:\\Users\\maxim\\Documents\\Max\\logrestaurantx.txt");
     String csvPath = "C:\\Users\\maxim\\Documents\\Max\\logrestaurantx.txt";
//Scanner scanner = new Scanner(ReadCSV.class.getResourceAsStream(csvPath + "\\myFile.csv"));
    void userchek() {
try{
        BufferedReader myRead = new BufferedReader(new FileReader(userinput));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the user");
        usernames = scanner.nextLine();
        System.out.println("Please enter the password");
        passw = scanner.nextLine();
        username = myRead.readLine();
       // name.add(name);
        password = myRead.readLine();
        //pass.add(pass);
        //readinput
     //    System.out.println(username + password);
  
         FoodMenu Menu = new FoodMenu();
        if (username.equals(usernames)&& password.equals(passw)){
        
          System.out.println(username + password);
           Menu.getMenu(); 
          Menu.getnumberofitems();
          
          int useruse = Menu.useruse; 
           for (int i = 1; i <= useruse; i++) { //here we will write the menu if the user wants to add items

            Menu.getnewitem();// from add , getter to get new info with return value in this case        String  getnewitem (){}  i can actually do all in this 
            //  Menu1.writetoaArray();  // get the item and write it to the main file FoodMenu   
            Menu.writeMenu(); //  //  write the items in the specific menu accesed by getMenu
        }
        
        Menu.printMenu(); 
    }
        else{
    //list menus        
            Menu.getMenu(); 
            Menu.printMenu(); 
        } 
    } 
catch(Exception e){
    
}
    }
 public User(String name, String pass){
     this.setname(name);
     this.setpass(pass);
  } 
public User(){
 
  }   
  
 public void setname(String name){
     this.user = name;
 }
  public String getname(){
    return user;
 }
   public void setpass(String pass){
     this.pass = pass;
 }
  public String getpass(){
    return pass;
 }



}
