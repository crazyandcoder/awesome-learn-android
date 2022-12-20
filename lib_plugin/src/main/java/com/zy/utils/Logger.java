package com.zy.utils;


public class Logger {

    private static final String PREFIX = "[Learn] ";

    private static boolean sEnableLog = false;

    public static void setConfig(boolean isLogEnable) {
        sEnableLog = isLogEnable;
    }

    public static void debug(String s, Object... args) {
        if (sEnableLog) {
            System.out.println(format(s, args));
        }
    }

    public static void info(String s, Object... args) {
        if (sEnableLog) {
            System.out.println(format(s, args));
        }
    }

    public static void warn(String s, Object... args) {
        if (sEnableLog) {
            System.err.println(format(s, args));
        }
    }

    public static void error(String s, Object... args) {
        if (sEnableLog) {
            System.err.println(format(s, args));
        }
    }

    public static void error(Throwable t) {
        if (sEnableLog) {
            t.printStackTrace();
        }
    }

    public static void fatal(Throwable t) {
        if (sEnableLog) {
            t.printStackTrace();
        }
    }

    public static void fatal(String s, Object... args) {
        fatal(new RuntimeException(format(s, args)));
    }

    private static String format(String s, Object... args) {
        return PREFIX + (args.length == 0 ? s : String.format(s, args));
    }
}
