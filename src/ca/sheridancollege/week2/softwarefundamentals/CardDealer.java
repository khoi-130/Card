/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author Khoi Anh Ngo, 2022
 * Student ID: 991643785
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card fiveHearts = new Card("Hrts", 5);
        fiveHearts.setSuit("hearts");
        fiveHearts.getValue();
        
        Card sevenJacks = new Card("Jcks", 7);
        sevenJacks.setSuits("jacks");
        sevenJacks.getValue();
    }
}
