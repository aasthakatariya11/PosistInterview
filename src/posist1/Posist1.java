/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posist1;



/**
 *
 * @author student1
 */
public class Posist1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Genisis genesisBlock = new Genisis("first block", "0");
	System.out.println("block 1 hash: " + genesisBlock.hash);
		
	Genisis secondBlock = new Genisis("Yo im the second block",genesisBlock.hash);
		System.out.println("block 2 hash : " + secondBlock.hash);
		
	Genisis thirdBlock = new Genisis("Hey im the third block",secondBlock.hash);
		System.out.println("block 3 hash : " + thirdBlock.hash);
    }
    
}
