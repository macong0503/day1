import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        //键盘输入接收
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入分数：");
        int i = sc.nextInt();
        if (90<= i && i<=100){
            System.out.println("优秀");
        }
        else if (80<=i&&i<90){
            System.out.println("好");
        }
        else if (70<=i&&i<80){
            System.out.println("良");
        }
        else if (60<=i&&i<70){
            System.out.println("合格");
        }
        else if (0<=i&&i<60){
            System.out.println("不及格");
        }
        else{
            System.out.println("输入错误");
        }
    }
}
