/**File: Asimetrica.java
 * Class that implements the asymmetric encryption methods.
 * Course: SEG IoT Applications
 * @author Marisa
 * @version 1.0
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSAEngine;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.encoders.Hex;

public class Asymmetric {
	
	private RSAEngine engine;

	
	/**Constructor of the Asymmetric class
	 */
	public Asymmetric(){
		engine = new RSAEngine();
	}
	
	/**
	 * Method that generates the public key and the private key
	 * @param fPrivateKey
	 * @param fPublicKey
	 */
	public void generateKeyPair(String fPrivateKey, String fPublicKey) throws FileNotFoundException, IOException{
		// TO COMPLETE
		// TASK 1 - BEGIN

		
		// TASK 1 - END
		
        
		PrintWriter ficheroPrivada = new PrintWriter(new FileWriter(fPrivateKey));
		PrintWriter ficheroPublica = new PrintWriter(new FileWriter(fPublicKey));
		
		ficheroPrivada.println(new String (Hex.encode(privateKey.getModulus().toByteArray())));
	    ficheroPrivada.print(new String (Hex.encode(privateKey.getExponent().toByteArray())));

		ficheroPublica.println(new String (Hex.encode(publicKey.getModulus().toByteArray())));
		ficheroPublica.print(new String (Hex.encode(publicKey.getExponent().toByteArray())));
		
		ficheroPrivada.close();
		ficheroPublica.close();
		
	}
	
	/**Method that encrypts the file "in clear" and creates an encrypted file.
	 * @param type
	 * @param keyFile
	 * @param fileToEncrypt
	 * @param fileToDecrypt
	 */
	public void encrypt(String type, String keyFile, String fileToEncrypt, String fileToDecrypt) throws InvalidCipherTextException, FileNotFoundException, IOException{
		
		
		BufferedReader keyReader = new BufferedReader(new FileReader(keyFile));
		BigInteger module = new BigInteger(Hex.decode(keyReader.readLine()));
		BigInteger exponent = new BigInteger(Hex.decode(keyReader.readLine()));
		// TO COMPLETE
		// TASK 2.1 - BEGIN
		
		
		
		// TASK 2.1 - END
		
		BufferedInputStream dataReader = new BufferedInputStream(new FileInputStream(fileToEncrypt));
		BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(fileToDecrypt));
		// TO COMPLETE
		// TASK 2.2 - BEGIN
		
		
		
		// TASK 2.2 - END
		
		keyReader.close();
		dataReader.close();
		writer.close();
		
	}
	
	/**Method that decrypt from an encrypted file.
	 * @param type
	 * @param keyFile
	 * @param fileToDecrypt
	 * @param decryptedFile
	 */
	public void decrypt(String type, String keyFile, String fileToDecrypt, String decryptedFile) throws InvalidCipherTextException, FileNotFoundException, IOException{
		
		BufferedReader keyReader = new BufferedReader(new FileReader(keyFile));
				
		BigInteger module = new BigInteger(Hex.decode(keyReader.readLine()));
		BigInteger exponent = new BigInteger(Hex.decode(keyReader.readLine()));
		
		// TO COMPLETE
		// TASK 3.1 - BEGIN
		
		
		// TASK 3.1 - END
		
		BufferedInputStream dataReader = new BufferedInputStream(new FileInputStream(fileToDecrypt));
		BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(decryptedFile));
		
		// TO COMPLETE
		// TASK 3.2 - BEGIN
		
		
		// TASK 3.3 - END
		keyReader.close();
		dataReader.close();
		writer.close();
		
	}
	
	
}
