package io.winty.sec;

public class Native {

    private static native String callRust(String input);

    static {
        System.loadLibrary("rustjni");
    }
    
    public static void main(String[] args) {
        String output = Native.callRust("josh");
        System.out.println(output);
    }

}
