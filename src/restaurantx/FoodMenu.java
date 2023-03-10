/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import restaurantx.Food;

/**
 *
 * @author maxim
 */
public class FoodMenu {

    HashMap<Integer, Integer> fooditems = new HashMap();
    protected int useruse = 0;
    public String filename = "FoodMenu.txt";
    String userInput; // strings to save user input maybe i could save them in an array from here and will safe me the paint
    String userInputcal;
    String userInputprice;
    String comb;
    protected String userMenu;// this is create to be used in restaurant x and here 
    protected String name;
    protected String price;
    protected String cal;
    protected String names;
    protected String prices;
    protected String cals;
    Food food = new Food();
    String userSelection;
    int sum;
    private int food_id = 0;

    String userinput;
    public ArrayList<String> combArray = new ArrayList<String>();
    public ArrayList<String> nameArray = new ArrayList<String>();
    public ArrayList<String> priceArray = new ArrayList<String>();
    public ArrayList<Integer> priceintArray = new ArrayList<Integer>();
    public ArrayList<Food> bagarray = new ArrayList<Food>();
    public ArrayList<Integer> clientbag = new ArrayList<Integer>();
     public ArrayList<String> clientbagS = new ArrayList<String>();
    public ArrayList<Integer> foodidArray = new ArrayList<Integer>();

    /* String getUser(){
        return
    }
     */
    public void Foodforthebag() {

        //Client client = new Client();
        //String userSelection = client.userSelection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter '+' to add, '-' to remove, or 'done' to exit:");
            userSelection = scanner.nextLine();
            switch (userSelection) {
                case "+":
                    System.out.println("What would you like to add?");
                    String userInput = scanner.nextLine();
                    //int index = nameArray.indexOf(userInput);
                    //  String temp;
                    System.out.print(nameArray);
                    // =fooditems.containsKey("pedro"
                    if (fooditems.containsKey(userInput)) {
                        System.out.println("Added.");
                        System.out.println("The total is " + fooditems.get(userInput) + " euro");
                    } else {
                        System.out.println("Error.");
                    }
                    break;
                case "-":
                    System.out.println("Removed.");
                    break;
                case "done":
                    System.out.println("Thanks for using!");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        } while (userSelection.equals("+") || userSelection.equals("-"));
    }

    Food getnewitem() { //use this getter  first to get user inputs 

        try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the name of the food you want to add \n");
            System.out.println("You must enter letters only");
            userInput = scanners.nextLine();
            food.setname(userInput);
            System.out.println("Enter the price \n");
            System.out.println("numbers only");
            userInputprice = scanners.nextLine();
            food.setprice(userInputprice);
            System.out.println("Enter the number of calories of the product \n");
            System.out.println("numbers only");
            userInputcal = scanners.nextLine();
            food.setcal(userInputcal);
            comb = userInput + " " + userInputprice + " " + userInputcal;
            System.out.println(food_id);
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }
        try {      //try with catch required for bufferwriter

            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true)); //this code starts the BufferedWriter
            //true = append to the file
            //false = overwrite the file

            myWriter.write(food.getname() + ("\n") + food.getprice() + ("\n")); //the write method will put the licence + the car model in the first line                                    
            myWriter.write(food.getcal());              //the write method will put the different kind of vehicule type depends each case   
            myWriter.newLine();
            myWriter.close();                                 //this saves changes to the file

        } catch (Exception e) {

            System.out.println("Error writing to file " + filename); //in case of error will print this message 
            //end of the code
        }
        /*
     
     for(int i = 1; i <= useruse ; i++){
        try {
            BufferedReader myRead = new BufferedReader(new FileReader(filename)); //read from the file
            carInfo = myRead.readLine();  //storage car details info  in the first line
            passangerN = myRead.readLine(); //storage number of passengers info in the second line
            licenceN = myRead.readLine(); //storage licence info in the third line

            if (carInfo != null) {
            } //if the file has something on it (carinfo), java continues the code succesfully
            else {
                System.out.println("The file " + dataReading + (" is empty"));
            }     //If the file is empty the code will print this message            
        } catch (Exception e) {
            System.out.println("The file must be corrupted Or doesn't exist");
        }  //If the file doesnt exist or is corrupted the code print this message    
     }*/

        return food; //return the input in the comb variable with spaces to print it

    }

    int getnumberofitems() {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Please enter the number of food items to add them to the FoodMenu");
            useruse = scanner.nextInt();
            System.out.print(("\n"));

        } catch (Exception e) { // is better to catch precice exeptions learn more
            System.out.println("Only numbers");
        } finally { // close scanner or files may be open
            //   scanner.close();
        }
        return useruse;
    }

    String getMenu() {
        String userinputs;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type \"-\" followed by the name of the Menu you want to select");
        userinputs = scanner.nextLine();//necesary to read for the loop after the name of the menu read 
        userMenu = (userinputs + ".txt");
        File files = new File("C:\\Users\\maxim\\Documents\\Restaurant\\RestaurantX\\" + userMenu);

        if (files.exists()) { // if exist dont modify if doesnt exist if create a new file for the reader above
            //HERE i can add the dell option \?

        } else {

            try {      //try with catch required for bufferwriter

                BufferedWriter myWriter = new BufferedWriter(new FileWriter(userMenu, false)); //this code starts the BufferedWriter
                //true = append to the file
                //false = overwrite the file
                myWriter.write(userinputs);              //the write method will put the different kind of vehicule type depends each case   
                myWriter.newLine();
                myWriter.close();

            } catch (Exception e) {

                System.out.println("Error writing to file " + userMenu); //in case of error will print this message 
                //end of the code
            }

        }

        return userMenu;
    }

    void writeMenu() {

        try {      //try with catch required for bufferwriter

            BufferedWriter myWriter = new BufferedWriter(new FileWriter(userMenu, true)); //this code starts the BufferedWriter
            //true = append to the file
            //false = overwrite the file

            myWriter.write(food.getname() + ("\n") + food.getprice() + ("\n")); //the write method will put the licence + the car model in the first line                                    
            myWriter.write(food.getcal());              //the write method will put the different kind of vehicule type depends each case   
            myWriter.newLine();
            myWriter.close();                                 //this saves changes to the file

        } catch (Exception e) {

            System.out.println("Error writing to file " + filename); //in case of error will print this message 
            //end of the code
        }

    } // redundant with get item but let me write new menus from scratch  (FoodMenu generic)
//@override comb 

    void printMenu() {

        try {
            BufferedReader myRead = new BufferedReader(new FileReader(userMenu)); //read from the file

            /*  for(int x ; count)    {
            name = myRead.readLine();
             name = name.trim();
            price = myRead.readLine();
             price = price.trim();
            cal = myRead.readLine();
             cal = cal.trim();
        }*/
            int count = myRead.read(); // esta ocupando el primer chr to perform the read thats why after it wont come in
            String foodmenuname = myRead.readLine();
            System.out.println("Welcome to " + foodmenuname);
            String combo;

            for (int i = 0; count >= i;) {// my read is boolean int -1 if is empty no read so if equals 0 or more
                //  if (count <= 0) {

                name = myRead.readLine();
                food.setname(name);
                nameArray.add(name);
                price = myRead.readLine();
                food.setprice(price);
                priceArray.add(price);
                int ii = Integer.parseInt(price);
                priceintArray.add(ii);
                cal = myRead.readLine();
                food.setcal(cal);

                combo = name + price;
                combArray.add(combo);

                // System.out.println(nameArray);
                //  System.out.println(priceintArray);
                food_id++;
                foodidArray.add(food_id);
                food.setid(food_id);
                fooditems.put(food_id, ii);
                //System.out.println(priceArray);
                bagarray.add(food);
                if (name.equals(null)) {
                } else {

                    System.out.println(food.getid() + ".- " + "The " + food.getname() + " costs " + food.getprice() + " euro & it contains " + food.getcal() + " calories");
                }
            }

        } catch (Exception e) {
            //  System.out.println("The file must be corrupted Or doesn't exist");

        }  //If the file doesnt exist or is corrupted the code print this message  

        /* Scanner sc = new Scanner(userMenu);
//System.out.print(userMenu);
System.out.println(sc.nextLine());
        while (sc.hasNextLine()) {
            name = sc.nextLine();
            price = sc.nextLine();
             cal = sc.nextLine();
            System.out.println(name);
            System.out.println(price);
            System.out.println(cal);
        }
        sc.close();
    } 
    catch (Exception e) {
       System.out.println(" is not a file");
    }
         */
        // System.out.println(bagarray.get(3).getname()); // wooooooowwwww siii sisisi getting from arraylist 
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter '+' to add, '-' to remove, or 'done' to finish:");
            userSelection = scanner.nextLine();
            switch (userSelection) {
                case "+":
                    System.out.println("Enter the number of the product you would like to add");
                    int userInput = scanner.nextInt();
                    //  scanner.nextInt();
                    scanner.nextLine();
                    //   foodidArray.indexOf(userInput);

                    String temp;
                    //  System.out.print(nameArray);

                    //     if (foodidArray.contains(userInput)) {
                    if (fooditems.containsKey(userInput)) {
                    //    System.out.println(clientbagS.toString() + " Added.");
                        
                        sum += fooditems.get(userInput);
                      //  System.out.println("The total is " + sum + " euro");
                        clientbag.add(fooditems.get(userInput));
                        clientbagS.add(nameArray.get(userInput-1));
                        System.out.println(clientbagS.toString() + " Added.");
                         System.out.println("The total is " + sum + " euro");
                    } else {
                        System.out.println("Error.");
                    }
                    break;
                case "-":
                    System.out.println("Removed.");
                    break;
                case "done":
                    System.out.println("Thanks for using, your total is " +  sum + " euro");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (userSelection.equals("+") || userSelection.equals("-"));
    }

}
