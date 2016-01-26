package net.cfrost.javalab.util;

import java.io.PrintStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author cFrost
 * Code from Thinking in Java 4th
 * Print methods that can be used without
 * qualifiers, using Java SE5 static imports
 */

public class PrintTool {
    // Print with a newline:
    public static void printLine(Object obj) {
//        if (Collection.class.isAssignableFrom(obj.getClass())) {
//            printList((List<?>) obj);
//            printLine();
//            return;
//        } else if (Map.class.isAssignableFrom(obj.getClass())) {
//            printMap((Map<?, ?>) obj);
//            printLine();
//            return;
//        } else
            System.out.println(obj);
    }

    // Print a newline by itself:
    public static void printLine() {
        System.out.println();
    }

    // Print with no line break:
    public static void print(Object obj) {
        System.out.print(obj);
    }

    // The new Java SE5 printf() (from C):
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

    private static void printList(List<?> list) {
        System.out.print(list);
    }

    private static void printMap(Map<?, ?> map) {
        System.out.print(map);
    }
} // /:~