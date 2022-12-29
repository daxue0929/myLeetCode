package com.daxue.easy;

/**
 * @author daxue0929
 * @date 2022/12/29
 */

public class DefangIPaddr {
    public static void main(String[] args) {
        String s = DefangIPaddr.defangIPaddr("1.1.1.1");
        System.out.println(s);
    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
