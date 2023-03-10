/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

public  class Food {
   private int id;
    private String name = "Empty";
    private String price = "0";
    private String cal = "0";

    public void setname(String name) { //it takes the value from somwhere else
        this.name = name;
    }

    public String getname() { // it takes it from this code 
        return name;
    }

    public void setprice(String name) {
        this.price = name;
    }

    public String getprice() {
        return price;
    }

    public void setcal(String name) {
        this.cal = name;
    }

    public String setcal() {
        return cal;
    }

    public Food(String name, String price, String cal) {
        this.setname(name);
        this.setprice(price);
        this.setcal(cal);
    }

    public Food(String name, String price) {
        this.setname(name);
        this.setprice(price);
    }

    public Food() {
        this.setname(name);
        this.setprice(price);
    }

}
