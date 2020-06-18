package collectionsLecture;
import java.util.HashMap;

public class HashMapLecture {
    public static void main(String[] args) {
        HashMap<String,Integer> userIds = new HashMap<>();
        HashMap<String,String> passwords = new HashMap<>();
        HashMap<Integer,String> horses = new HashMap<>();

        userIds.put("aroman", 1);
        userIds.put("bcaballero", 2);
        userIds.put("rorsinger", 3);
        userIds.putIfAbsent("jreich", 4);
        userIds.replace("aroman", 7);
        userIds.remove("rorsinger");

        System.out.println(userIds.isEmpty());
        System.out.println(userIds.get("aroman"));
        System.out.println(userIds.containsKey("dstephens"));
        System.out.println(userIds.containsValue(2));
        System.out.println(userIds.getOrDefault("dstephens", 4));
        System.out.println(userIds);
        userIds.clear();
        System.out.println(userIds);
    }
}
