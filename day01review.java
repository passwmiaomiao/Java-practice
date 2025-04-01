//弄一个计算器能键盘输入后进行加减乘除
import java.util.Scanner;
public class day01review {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double num1 =sc.nextDouble();
        System.out.println("请输入第二个数字");
        double num2 =sc.nextDouble();
        System.out.println("请输入运算符（+，-，*，/ > 1,2,3,4）");
        int choice =sc.nextInt();
        double result;
        switch(choice){
            case 1:
                result =num1+num2;
             //   System.out.println("num1+num2="+result);
                break;
            case 2:
                result =num1-num2;
            //    System.out.println("num1-num2="+result);
                break;
            case 3:
                result =num1*num2;
            //    System.out.println("num1*num2="+result);
                break;
            case 4:
                result =num1/num2;
              //  System.out.println("num1/num2="+result);
                break;
            default:
                System.out.println("输入错误");
                return;//法一：return结束程序；法二：result=0;
        }
        System.out.println("结果为："+result);
    }

}
