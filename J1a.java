class J1a {
    // Primitive data types
    static int a;         // Default: 0
    static byte b;        // Default: 0
    static short c;       // Default: 0
    static long d;        // Default: 0L
    static float e;       // Default: 0.0f
    static double f;      // Default: 0.0d
    static char g;        // Default: '\u0000' (null character)
    static boolean h;     // Default: false
    public static void main(String args[]) {
        System.out.println("Default value of int is " + a);
        System.out.println("Default value of byte is " + b);
        System.out.println("Default value of short is " + c);
        System.out.println("Default value of long is " + d);
        System.out.println("Default value of float is " + e);
        System.out.println("Default value of double is " + f);
        System.out.println("Default value of char is " + (int) g + "' (Unicode: '\\u0000')");
        System.out.println("Default value of boolean is " + h);
    }
}
