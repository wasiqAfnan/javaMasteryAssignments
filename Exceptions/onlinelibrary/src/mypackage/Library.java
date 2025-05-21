/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;
import java.util.HashMap;

public class Library {
    HashMap<Integer, String> map = new HashMap<>();

    public void setBook(int bookId, String bookName) {
        map.put(bookId, bookName);
    }

    public void getBook(int bookId) throws InvalidBookIdException {
        if (!map.containsKey(bookId)) throw new InvalidBookIdException("Invalid Book Id");
        System.out.println(map.get(bookId));
    }

    @Override
    public String toString() {
        return "Library{" + "map=" + map + '}';
    } 
}
