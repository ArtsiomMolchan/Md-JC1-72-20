public class home_work_1 {
    public static void main(String[] args) {

        int a = 42;
        int b = 15;
        double c = 42.5;

        //System.out.println(c &= c); //java: bad operand types for binary operator '&'

        System.out.println(Integer.toBinaryString(a & b)); // binary 1010
    System.out.println(Integer.toBinaryString(a &= b)); // binary 1010
    System.out.println(Integer.toBinaryString(a | b)); // binary 1111
    System.out.println(Integer.toBinaryString(a |= b)); // binary 1111
    System.out.println(a ^ b); //0
    System.out.println(a ^= b); //0
    System.out.println(a >> b); //0
    System.out.println(a >>= b); //0
    System.out.println(a >>> b); //0
    System.out.println(a << b); //0
    System.out.println(a <<= b); //0
    System.out.println(a >>>= b); //0


        int x = -42;
        int y = -15;

        System.out.println(Integer.toBinaryString(x & y)); // binary 11111111111111111111111111010000
        System.out.println(Integer.toBinaryString(x &= y)); // binary 11111111111111111111111111010000
        System.out.println(Integer.toBinaryString(x | y)); //binary 11111111111111111111111111010001
        System.out.println(Integer.toBinaryString(x |= y)); //binary 11111111111111111111111111010001
        System.out.println(x ^ y); //0
        System.out.println(x ^= y); //0
        System.out.println(x >> y); //0
        System.out.println(x >>= y); //0
        System.out.println(x >>> y); //0
        System.out.println(x << y); //0
        System.out.println(x <<= y); //0
        System.out.println(x >>>= y); //0
    }
}