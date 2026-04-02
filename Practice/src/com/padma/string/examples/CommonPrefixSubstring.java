package com.padma.string.examples;

/**
 *
 */
public class CommonPrefixSubstring {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        //String result = longestCommonPrefix(strs);
        String result = commonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

    /**
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    /**
     *
     * @param strs
     * @return
     */
    public static String commonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = strs[0].length();
        for(int i=1; i<strs.length; i++) {
            minLength = Math.min(minLength , strs[i].length());
        }
        StringBuilder prefix = new StringBuilder();
        for(int i=0; i<minLength; i++) {
            if(strs[0].charAt(i) == strs[1].charAt(i) && strs[1].charAt(i) == strs[2].charAt(i)) {
                prefix.append(strs[0].charAt(i));
            }
        }
        return prefix.toString();
    }
}
