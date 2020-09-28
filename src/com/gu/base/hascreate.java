package com.gu.base;

import javax.swing.*;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;

public class hascreate {
    static Random rint = new Random();
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int sLength = sAlphabet.length;

    public static void gf(String r,int v,int t) throws Exception{
        RandomAccessFile f = new RandomAccessFile(r, "rw");
        f.setLength(1024 * 1024 * v);
    }
    public static String ch() {
        return String.valueOf(sAlphabet[rint.nextInt(sLength)]);
    }
    public static String hash() throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return digest.digest(ch().getBytes(StandardCharsets.UTF_8)).toString();
    }
    public static void degenerate(int num, int kol) throws Exception {
        for (int i = 0; i < num; i++) {
            gf(hash(), kol, i);
        }
    }
}
