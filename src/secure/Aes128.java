package secure;

import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 

public class Aes128 {
	
    public static void main(String[] args) {
    	 
    	String str1="암호화되지 않은 메세지";
        System.out.println("plain : " + str1);

        String str2 = encryptAES128(str1);
        System.out.println("AES128 encrypted : " + str2);

        String str3 = decryptAES128(str2);
        System.out.println("AES128 decrypted : " + str3);

 }
	
    private final static String KEY = "01234567890123456789012345678901";

    // 128bit (16자리)
    private final static String KEY_128 = KEY.substring(0, 16);
    
    // 256bit (32��由�)
    private final static String KEY_256 = KEY.substring(0, 32);

    // AES 128 ���명��
    public static String encryptAES128(String string) {
           try {
                 //  byte[] keyData = KEY_128.getBytes(CharEncoding.UTF_8);

                   // 운용모드 CBC, 패딩은 PKCS5Padding
                   Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
              //     cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyData, "AES"), new IvParameterSpec(keyData));
                //   byte[] encrypted = cipher.doFinal(string.getBytes(CharEncoding.UTF_8));
               //    byte[] base64Encoded = Base64.encodeBase64(encrypted);
               //    String result = new String(base64Encoded, CharEncoding.UTF_8);

                //   return result;
           }
           catch (Exception e) {
        	    e.printStackTrace();
        	    return null;
           }
    }

    // AES 128蹂듯�명��
    public static String decryptAES128(String string) {

           try {
               //    byte[] keyData = KEY_128.getBytes(CharEncoding.UTF_8);

                   Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

                   cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyData, "AES"), new IvParameterSpec(keyData));

                 //  byte[] base64Decoded = Base64.decodeBase64(string.getBytes(CharEncoding.UTF_8));

                //   byte[] decrypted = cipher.doFinal(base64Decoded);

              //     String result = new String(decrypted, CharEncoding.UTF_8);

            //       return result;
           }
           catch (Exception e) {
                   return null;
           }
    }
}