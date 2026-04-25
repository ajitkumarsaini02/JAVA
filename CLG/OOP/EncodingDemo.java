
import java.util.Base64;

public class EncodingDemo {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        Base64.Encoder encoder = Base64.getEncoder();
        
        String encodString = encoder.encodeToString(originalString.getBytes());
        System.out.println("Encoded String: " + encodString);
        Base64.Decoder decoder = Base64.getDecoder();
        String decodedString = new String(decoder.decode(encodString));
        System.out.println("Decoded String: " + decodedString);
    }
}
