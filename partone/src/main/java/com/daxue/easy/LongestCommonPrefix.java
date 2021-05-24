package com.daxue.easy;

/**
 * @author daxue0929
 * @date 2021/05/25
 **/
public class LongestCommonPrefix {
    public static void main(String[] args){
//        String[] strs = {"dog", "racecar", "car"};
//        String[] strs = {"flower","flow","floight"};
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String s = strs[0];
        for (String string:strs) {
            while (!string.startsWith(s)){
                if (s.length() == 0) return "";
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

//    public String test (String[] strs) {
//        String result = "";
//        int location = 0;
//        int length = strs.length;
//        while (length-- != 0) {
//            char temp = 0;
//            for (String ch : strs) {
//                char[] chars = ch.toCharArray();
//                if (temp == 0) {
//                    if (chars.length == 0) return "";
//                    temp = chars[location];
//                } else {
//                    if (temp != chars[location]) {
//                        if (location == 0) return "";
//                        for (int m = 0; m < location; m++) {
//                            result += chars[m];
//                        }
//                        return result;
//                    }
//                }
//            }
//            location++;
//        }
//        return "";
//    }

}



