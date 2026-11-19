package agh.po.lab3;

import java.util.Map;
import java.util.HashMap;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.loneTeen(14, 67));
        System.out.println(cb.helloName("marco"));
        System.out.println(cb.firstLast6(new int[]{1,2,3,4,6}));
        System.out.println(cb.sleepIn(false,true));
    }

    public boolean loneTeen(int a, int b) {
        if (a >= 13 && a < 20 && !(b >= 13 && b < 20)) {
            return true;
        }
        if (b >= 13 && b < 20 && !(a >= 13 && a < 20)) {
            return true;
        }
        return false;
    }

    public String helloName(String name) { return ("Hello "+name+"!"); }

    public boolean firstLast6(int[] nums) {
        if((nums[0] == 6) || (nums[nums.length-1] == 6)){
            return true;
        }
        return false;
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}