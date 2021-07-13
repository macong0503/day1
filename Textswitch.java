import java.util.Scanner;

public class Textswitch {
    public static void main(String[] args) {
        //键盘输入接收
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份：");
        int i = sc.nextInt();
        switch(i){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
        }


    }
}
