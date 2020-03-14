
/**File: Main.java
 * Course: SEG IoT Applications
 * @author Marisa
 * @version 1.0
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.bouncycastle.crypto.InvalidCipherTextException;

public class Main {

	public static void main (String [ ] args) throws InvalidCipherTextException, FileNotFoundException, IOException{
		
		int menu;
		
		Asymmetric asymmetric = new Asymmetric();
		Scanner sc = new Scanner(System.in);
		String fKey;
		String fileToEncrypt;
		String encryptedFile;
		String fileToDecrypt;
		String decryptedFile;
		String privateKeyFile;
		String publicKeyFile;
		String type;
	
		do{
			System.out.println("Choose an option for ASYMMETRIC CRYPTTOGRAPHY \n");

			System.out.println("1. Key generation.");
			System.out.println("2. Encrypt.");
			System.out.println("3. Decrypt.");
		
			System.out.println("0. Exit.");
			
						
			menu = sc.nextInt();
				
			switch(menu){
				case 1:
					System.out.println("Write the name of the file that will contain the private key:");
					privateKeyFile = sc.next();
					System.out.println("Write the name of the file that will contain the public key:");
					publicKeyFile = sc.next();
					asymmetric.generateKeyPair(privateKeyFile, publicKeyFile);
				break;
				case 2:
					System.out.println("Indicate whether you are going to use the private (private) key or the public key (public)");
					type = sc.next();
					System.out.println("Write the name of the file that will contain the key:");
					fKey = sc.next();
					System.out.println("Write the name of the file to be encrypted:");
					fileToEncrypt = sc.next();
					System.out.println("Write the name of the encrypted file:");
					encryptedFile = sc.next();
					asymmetric.encrypt(type, fKey, fileToEncrypt, encryptedFile);
				break;
				case 3:
					System.out.println("Indicate whether you are going to use the private (private) key or the public key (public)");
					type = sc.next();
					System.out.println("Write the name of the file that will contain the key:");
					fKey = sc.next();
					System.out.println("Write the name of the file to be decrypted:");
					fileToDecrypt = sc.next();
					System.out.println("Write the name of the decrypted file:");
					decryptedFile = sc.next();
					asymmetric.decrypt(type, fKey, fileToDecrypt, decryptedFile);
				break;
				
			}
		} while(menu != 0);
	
		sc.close();
	}
}
