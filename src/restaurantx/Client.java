/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

import java.util.Scanner;
import restaurantx.FoodMenu;

public class Client  {
    String userInput;
       String userSelection;
    private int Client;
 bag bag = new bag ();
  public Client(int client, bag bag){
      this.setNoClient(client);
      this.getNoClient();
       this.setbag(bag);
      this.getbag();
      
  }
     public Client(){}
    public int getNoClient (){
        return Client;
    }
    
    public void setNoClient(int client){
          this.Client = client;
    }
    public bag getbag (){
        return bag;
    }
    
    public void setbag(bag bag){
          this.bag = bag;
    }
    
    public void makebag(){
        FoodMenu Menu = new FoodMenu();
          System.out.println("Type the key + to add an item");  
          System.out.println("Type the key - to remove an item"); 
          System.out.println("Type the key Enter  finish"); 
     //  Scanner scanner = new Scanner(System.in); 
   
    //  userSelection = scanner.nextLine();
        for(;userSelection.endsWith("+")||userSelection.endsWith("-");){
      
        Menu.Foodforthebag();
        }
     

    // do something based on user input
} 
        
       
    } 
    
 /*   
  public Food Foodforthebag (){
      Scanner scanner = new Scanner(System.in);
      userInput = scanner.nextLine(); 
      if(userInput.isEmpty()){
          
       return null;   
          
      } 
      else{    
      
              }
  }*/

