package datastructer.basic;

import java.util.Arrays;

public class Kmp {
    static int[] makeTable(char[] p) {
        int patternLength = p.length;
        int[] table = new int[patternLength];
        int j = 0;
        for (int i = 1; i < patternLength; i++) {
            while (j > 0 && p[i] != p[j]) {
                j = table[j - 1];
            }

            if (p[i] == p[j]) {
                table[i] = ++j;
            }
        }
        System.out.println("table: " + Arrays.toString(table));

        return table;
    }

    static void kmp(char[] parent, char[] pattern) {
        int[] table = makeTable(pattern);
        int parentSize = parent.length;
        int patternSize = pattern.length;
        int j = 0;
        for (int i = 0; i < parentSize; i++) {
            while (j > 0 && parent[i] != pattern[j]) {
                j = table[j - 1];
            }
            if (parent[i] == pattern[j]) {
                if (j == patternSize - 1) {
                    System.out.printf("%d. \n", i - patternSize + 1);
                    j = table[j];
                } else {
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] parent = "ababacabaabac".toCharArray();
        char[] pattern = "abcab".toCharArray();
        System.out.println("target : " + Arrays.toString(parent));
        System.out.println("pattern : " + Arrays.toString(pattern));
        kmp(parent, pattern);
    }
}
