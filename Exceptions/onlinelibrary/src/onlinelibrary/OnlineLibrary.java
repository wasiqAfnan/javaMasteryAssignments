/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinelibrary;
import mypackage.Library;

public class OnlineLibrary {
    public static void main(String[] args) {
        Library lol = new Library();
        lol.setBook(1100, "Wasiq");
        System.out.println(lol);
        try {
            lol.getBook(0011);
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}

