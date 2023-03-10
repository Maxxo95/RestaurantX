/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

import java.util.ArrayList;

/**
 *
 * @author maxim
 */
class bag  {
    
    public ArrayList<String> combArrayy = new ArrayList<String>();
    public ArrayList<String> nameArray = new ArrayList<String>();
    public ArrayList<String> priceArray = new ArrayList<String>();
    public ArrayList<Integer> priceintArray = new ArrayList<Integer>();

    int name;       
bag (int name, ArrayList bag){
    this.setname(name);
        this.setbag(bag);
}
   
 ArrayList<String> getbag (){
     
     return combArrayy ;
 }
 public void setbag(ArrayList bag){
     this.combArrayy = bag;
     
 }
 public void setname(int name){
     this.name = name;
 }
 int getname(){
     return name;
 }

   
}
