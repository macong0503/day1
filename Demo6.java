public class Demo6 {
    public static void main(String[] args) {
        /*逻辑运算
        * */
        //&&
        int i = 10;
        int j = 20;
        boolean b1 = i > j;
        boolean b2 = i < j;
        //&&
        boolean b3 = (b1 && b2);
        boolean b5 = (b1 && i++>0);
        System.out.println("b3="+b3);
        System.out.println(i);
        //||
        boolean b4 = (b1 || b2);
        System.out.println("b4="+b4);
    }
}
