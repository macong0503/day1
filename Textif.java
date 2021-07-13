public class Textif {
    public static void main(String[] args) {
        //判断语句
        /*
        * 格式：
        * if（关系表达式）{
        *        语句体
        * }
        * 关系表达式：判断结果是一个Boolean类型的值
        * 当关系表示的返回值为true时执行if语句体，否则不执行
        * */
        int i=11;
        int j=12;
        if (i<j){
            System.out.println("i<j");
        }
        int x=4;
        int y=5;
        //当+在运行字符串时，它起到的作用是进行字符串的拼接，而不是进行加法运算
        System.out.println("x="+x+",y="+y);
        /*
        *if（关系表达式1）{
        *        语句体1
        * }else if(关系表达式2){
        *        语句体2
        * }else{
        *        语句体3
        * }
        * 当表达式1成立时，执行语句体1，否则执行关系表达式2，如果成立，执行表达式3，否则执行表达式3
        * */
        int a=180;
        int b=185;
        int c=190;
        if (a>b){
            //语句1
            if (a>c) {
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }
        else if (b>c){
            //语句2
            System.out.println(a);
        }
        else{
            //语句3
            System.out.println(c);
        }
    }
}
