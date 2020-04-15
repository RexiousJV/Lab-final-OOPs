/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;


public class user {
	protected String id,pass;

	public user(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}
	public void display() {
		System.out.println("User Id : "+id);
	
	}
	
}
