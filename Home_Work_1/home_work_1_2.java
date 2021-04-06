public class home_work_1_2 {

    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 5 + b/ a; // 5 + 2/8 = 5.25 => 5
        System.out.println(c);
        int d = (5 + 2) / a; // (5 + 2) / 8 = 0,87 => 0
        System.out.println(d);
        int e = (5 + b++) / a; // (5 + 3) / a = 1 => 0
        System.out.println(e);
        int f = (5 + b++) / --a; // (5 + 3) / 7 = 1.14 =>1
        System.out.println(f);
        int g = (5 * 2 >> b++) / --a; // 1/1 = 1 => 0
        System.out.println(g);
        int h = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a; // 5/7 = 0.7 => 0
        System.out.println(h);
        //var i = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; can't resolve
        //System.out.println(i);
        boolean j = 6 - 2 > 3 && 12 * 12 <= 119; // true / false => false
        System.out.println(j);
        boolean k = true && false; // false => false
        System.out.println(k);
    }
}
