import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEncodeAndDecode {
    public static String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();
        for(String s : strs){
            encodeString.append(s.length()).append("#").append(s);
        }
        return encodeString.toString();
    }

    public static List<String> decode(String str) {
        char[] arr = str.toCharArray();
        int i=0;
        List<String> res = new ArrayList<>();
        while(i<arr.length){
            if(arr[i+1] == '#'){
                int startIndex = i+2;
                int len = arr[i] - '0';
                int endIndex = startIndex+len;
                String substring = str.substring(i+2, endIndex);
                res.add(substring);
                i = startIndex+len;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String encoded = encode(Arrays.asList("neet","code","love","you"));
        System.out.println("encoded: "+ encoded);
        List<String> decoded = decode(encoded);
        System.out.println("decoded: "+ decoded);
    }
}


