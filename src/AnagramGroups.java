import java.util.*;

public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            if(map.containsKey(String.valueOf(arr))){
                res.get(map.get(String.valueOf(arr))).add(s);
            }else{
                map.put(String.valueOf(arr), res.size());
                res.add(new ArrayList<>(Arrays.asList(s)));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AnagramGroups anagramGroups = new AnagramGroups();
        anagramGroups.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
    }
}
