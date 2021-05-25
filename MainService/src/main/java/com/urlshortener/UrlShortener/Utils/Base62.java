package com.urlshortener.UrlShortener.Utils;

public  class Base62 {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static final int BASE = ALPHABET.length();


    public static String encode(long i) {
		StringBuilder sb = new StringBuilder("");
		if (i == 0) {
			return "a";
		}
		while (i > 0) {
			i = encodeHelper(i, sb);
		}
		return sb.reverse().toString();
	}
    private static long encodeHelper(long i, final StringBuilder sb) {
		int rem = (int) (i % BASE);
		sb.append(ALPHABET.charAt(rem));
		return i / BASE;
	}
    
}
