/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
        alphabet = new char[26];
        alphabet = 'a' + 'b' + 'c' + 'd' + 'e' + 'f' + 'g' + 'h' + 'i' + 'j' + 'k' + 'l' + 'm' + 'n' + 'o' + 'p' + 'q' + 'r' + 's' + 't' + 'u' + 'v' + 'w' + 'x' + 'y' + 'z';
        shift = 4;
        
    }

    public CaesarCipher(int num){
        //whatever the shift number is add 4 and shift it 4 positions
        //What is 22+4%# 
        shift = num;
    }

    public String encrypt(String message){
        //look through alphabet
        return "" + alphabet[0]; 
    }

    public String decrypt(String message){
        //look through shifted
        return "";
    }

    public void shifter(int num){

    }


}