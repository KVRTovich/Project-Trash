package com.gu.base;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import java.util.Base64;
public class hascreate {
    static Random rint = new Random();
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private static String[] endnames = {".pptx",".docx",".txt",".bmp",".png",".jpeg",".jpg"};

    public static void gf(String r,int v,int t) throws Exception{
        RandomAccessFile f = new RandomAccessFile(r, "rw");
        f.setLength(1024 * 1024 * v);
    }
    public static String ch() {
        return String.valueOf(sAlphabet[rint.nextInt(sAlphabet.length)]);
    }
    public static String hash() throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return Base64.getEncoder().encodeToString(digest.digest(ch().getBytes(StandardCharsets.UTF_8))).substring(0,16);
    }
    public static String endsnames() throws Exception {

        return hash().replaceAll("\\/","") + endnames[rint.nextInt(endnames.length)];
    }
    public static void degenerate(int num, int kol) throws Exception {
        for (int i = 0; i < num; i++) {
            gf(endsnames(), kol, i);

        }
    }
}
