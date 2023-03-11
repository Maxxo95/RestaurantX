/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

import java.util.Scanner;


public class Client  {
    String userInput;
    private int Client;
 bag bag = new bag ();
  public Client(int client, bag bag){
      this.setNoClient(client);
      this.getNoClient();
       this.setbag(bag);
      this.getbag();
      
  }
    
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
}
