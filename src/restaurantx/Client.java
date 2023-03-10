/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;


public class Client  {
    private int Client;
 private String bag = "nobag";
  public Client(int client, String car){
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
    public String getbag (){
        return bag;
    }
    
    public void setbag(String bag){
          this.bag = bag;
    }
}
