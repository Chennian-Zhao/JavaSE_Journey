package javaweb.Std_in_out;
import java.io.*;
import java.util.*;
public class Main {



    public static void main(String[] args) throws IOException{
        // 创建 InputStreamReader 对象，它是从控制台读取输入的桥梁
        InputStreamReader in = new InputStreamReader(System.in);
        // 创建 BufferedReader 对象，它可以一次读取一行文本
        BufferedReader br = new BufferedReader(in);
        //创建PrintWriter对象，它可以向控制台写入输出
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        // 读取输入的第一行数据，数字
        int n = Integer.parseInt(br.readLine());
        // 创建一个数组，用于存储输入的数据
        int[] arr = new int[n];
        // 读取输入的第二行数据，数字 用空格分隔
        // 23 34 45 544 656
        String[] str = br.readLine().split(" ");
        // 将输入的数据存储到数组中
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        //读取多行数据
        // 读取多行数据
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        a[i] = Integer.parseInt((in.readLine().split(" "))[0]);
        }
    // 打印数组
    for (int i = 0; i < n; i++) {
        pw.print(a[i] + " ");
    }



        



        // 刷新 PrintWriter 对象，确保所有的输出都被写入控制台
        pw.flush();
        // 关闭 BufferedReader 对象，释放与之关联的资源
        br.close();


    }
}
