/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

import java.util.ArrayList;
import restaurantx.Food;
/**
 *
 * @author maxim
 */
class bag {
    
   /* public ArrayList<String> combArrayy = new ArrayList<String>();
    public ArrayList<String> nameArray = new ArrayList<String>();
    public ArrayList<String> priceArray = new ArrayList<String>();
    public ArrayList<Integer> priceintArray = new ArrayList<Integer>();      
   // private Food food;
    */
    private ArrayList<Food> food = new ArrayList<Food>(); 
    
    
bag (ArrayList foodinthebag){
    this.setfood(foodinthebag);
      
}
bag (){

      
}

 public void setfood(ArrayList food){
     this.food = food;
 }
 ArrayList getfood(){
     return food;
 }
 
 
 

   /*ArrayList<String> getbag (){
     
     return combArrayy ;
 }
 public void setbag(ArrayList bag){
     this.combArrayy = bag;
     
 }  */
 
}
