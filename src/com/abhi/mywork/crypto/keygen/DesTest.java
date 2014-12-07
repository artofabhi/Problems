package com.abhi.mywork.crypto.keygen;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

import com.abhi.mywork.util.SOP;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;


public class DesTest {
	public static void main(String[] args) {

		
		SecretKey secretKey = null ;
	    String stringKey = null;
	    try {
	    	secretKey = KeyGenerator.getInstance("DES").generateKey();
	    }
	    catch (NoSuchAlgorithmException e) {
	    	e.printStackTrace();
	    }

	    if (secretKey != null) {
	    	stringKey = new BASE64Encoder().encode(secretKey.getEncoded()) ; 
	    }
	    
	   
	    
	    // from String to key 

	    stringKey = "PurchaseFinanceDev" ; 
	    try {
			byte[] encodedKey = new BASE64Decoder().decodeBuffer(stringKey) ;
			SecretKey key = new SecretKeySpec(encodedKey, "DES") ; 
			
		    if (secretKey != null) {
		    	stringKey = new BASE64Encoder().encode(secretKey.getEncoded()) ;
		    	 SOP.println(stringKey);
		    }
		    
			Cipher desCipher = Cipher.getInstance("DES/CBC/PKCS5Padding"); 
			
			desCipher.init(Cipher.ENCRYPT_MODE,secretKey);
			
			String strDataToEncrypt = "Hello World of Encryption using DES ";
			byte[] byteDataToEncrypt = strDataToEncrypt.getBytes();
			byte[] byteCipherText = desCipher.doFinal(byteDataToEncrypt); 
			String strCipherText = new BASE64Encoder().encode(byteCipherText);
			System.out.println("Cipher Text generated using DES with CBC mode and PKCS5 Padding is " +strCipherText);
			
			
			// decrypt 
			desCipher.init(Cipher.DECRYPT_MODE,secretKey,desCipher.getParameters());
			 //desCipher.init(Cipher.DECRYPT_MODE,secretKey);
			byte[] byteDecryptedText = desCipher.doFinal(byteCipherText);
			String strDecryptedText = new String(byteDecryptedText);
			System.out.println(" Decrypted Text message is " +strDecryptedText);


			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}