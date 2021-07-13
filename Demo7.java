public class Demo7 {
    public static void main(String[] args) {
        //三元运算符
        //比较身高180、190、185，输出最高的身高
        int b = 180>190?(180>185?180:185):(190>185?190:185);
        System.out.println(b);
    }
}
