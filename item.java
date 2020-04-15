/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

public class item {
private String itemName;
private double price;
public item(String itemName, double price) {
	this.itemName = itemName;
	this.price = price;
}
   public void display() {
	   System.out.println("Item Name: "+itemName);
	   System.out.println("Item Price: "+price);
   }
  
}
