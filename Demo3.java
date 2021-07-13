public class Demo3 {
    public static void main(String[] args) {
        //定义一个整型变量
        int i=1;
        //输出i
        System.out.println(i);
        //定义一个变量c
        //int c;
        //局部变量在使用的时候，必须初始化
        //System.out.println(c);
        //定义一个浮点型
        float f = 1f;
        System.out.println(f);
        //定义一个字符型
        char c ='a';
        int sum = c + 1;
        System.out.println(c);
        //char类型的数，在需要进行运算时，会找到ASCII表对应的值进行运算，结果为int类型
        System.out.println(sum);
        //定义一个Boolean型
        boolean b = true;
        System.out.println(b);
        //定义一个字符串
        String s = "我是一个字符串";
        System.out.println(s);
    }
}
