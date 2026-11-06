package agh.po.lab3;

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
}
