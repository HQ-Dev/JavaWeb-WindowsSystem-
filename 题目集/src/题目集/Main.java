package 题目集;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 温度转换
		 * 题目内容：
		 * 写一个将华氏温度转换成摄氏温度的程序，转换的公式是：
		 * °F = (9/5)*°C + 32
		 * 其中C表示摄氏温度，F表示华氏温度。 程序的输入是一个整数，表示华氏温度。                      
         * 输出对应的摄氏温度，也是一个整数。
         * 
         * 输入格式：
         *       一个整数
         * 输出格式：
         *       一个整数
         * 输入样例：100   输出样例：37
		 */
//		Scanner in = new Scanner(System.in);
//		int F = in.nextInt();
//		double C = (F-32)*(5/9.0);
//		System.out.println((int)C);
//		int i = 1;
//		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
////		System.out.println( i==b );
//		System.out.println(Math.abs(i-b) < 1e-6);
		
		// WEEK2 时间换算    (137ms通过)
//		Scanner in = new Scanner(System.in);
//		int BJT = in.nextInt();
//		int UTC = 0;
//		if ( BJT < 2460 && BJT % 100 < 60)
//		{
//			if ( BJT / 100 < 8 )
//			{
//				UTC = (24-(8 - BJT/100))*100 + BJT % 100;
//				System.out.println(UTC);
//			}
//			else
//			{
//				UTC = (BJT / 100 - 8) * 100 + (BJT % 100);
//				System.out.println(UTC);
//			}
//		}
		
		// WEEK2 信号报告    (146ms通过)
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		String[] R = {"unreadable", "barely readable, occasional words distinguishable",
//				"readable with considerable difficulty",
//				"readable with practically no difficulty", "perfectly readable"};
//		String[] S = {"Faint signals, barely perceptible","Very weak signals",
//				"Weak signals","Fair signals","Fairly good signals","Good signals",
//				"Moderately strong signals","Strong signals","Extremely strong signals"};
//		if (number > 10 && number < 60)
//		{
//			int r,s;
//			s = number % 10 - 1;
//			r = number / 10 - 1;
//			System.out.println(S[s] + "," + " " + R[r] + ".");
//		}
		
		
	}

}








