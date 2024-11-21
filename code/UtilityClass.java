import java.security.MessageDigest;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UtilityClass {

    public static int getDifficulty(int value) {
        return value;
    }

    public static String getSHA256Hash(String inputString) throws Exception {
        MessageDigest message = MessageDigest.getInstance("SHA-256");
        byte[] hash = message.digest(inputString.getBytes("UTF-8"));
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String getJSONData(List<Block> blockchain) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(blockchain);
        gson.close();
        return jsonData;
    }
}