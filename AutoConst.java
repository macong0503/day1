public class AutoConst {
    public static void main(String[] args) {
        //自动转换
        /*
        * 1的时候，int表示的数值范围小于float，自动转换为float
        * 1.0的时候，double类型的数值范围大于float，不能直接转换
        * long类型能自动转换为float
        * */
        float f = 1;
        System.out.println(f);

        float f1 = 10000000l;
        System.out.println(f1);
        //long l = 0.1f;


//        强制转换
        /*
        * 格式：目标数据类型 变量名 = （目标数据类型）值或变量
        * 出现问题：
        * 1、精度损失
        * 2、数据溢出
        * 3、类型转换异常
        * */

        long l1 = (long)1.3f;
        System.out.println(l1);

        long l = 6000000000l;
        int i = (int)l;
        System.out.println(i);
    }
}
