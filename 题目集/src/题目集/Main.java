package 题目集;

import java.util.ArrayList;
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
		
		// 周三课程 四道编程题目
		/*
		 * 题# 1： 奇偶个数  (138ms通过)
		 * 题目内容：
		 * 你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的
		 * 数据。程序输出读到的数据中的奇数和偶数的个数。
		 * 
		 * 输入格式：
		 * 一系列正整数，整数的范围是（0,100000）。如果输出-1则表示输入结束。
		 * 
		 * 输出格式：
		 * 两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入
		 * 数据中的偶数的个数。两个整数之间以空格分隔。
		 * 
		 * 输入样式：
		 * 9 3 4 2 5 7 -1
		 * 
		 * 输出样式：
		 * 4 2
		 */
//		Scanner in = new Scanner(System.in);
//		int input = in.nextInt();
//		int odd = 0;
//		int even = 0;
//		while ( input != -1 )
//		{
//			if (input % 2 == 0)
//			{
//				even++;
//			}
//			else
//			{
//				odd++;
//			}
//			input = in.nextInt();
//		}
//	System.out.println(odd + " " + even);
	
	// 数字特征值  (有五个例子中有一个例子没有通过，虽然拿了4分，但实际上是没有通过)
//		Scanner in = new Scanner(System.in);
//		int input = in.nextInt();
//		int binary = 0;   
//		int position = 0;
//		int N = 0;
//
//		do{
//			if (input % 10 != 0)
//			{	position += 1;
//				int a = input % 10;
//				if ( a % 2 == position % 2 )
//				{
//					binary = (int)(binary + 1*Math.pow(10, N));
//				}
//				N = N + 1;
//			}
//			input /= 10;
//			
//		} while( input != 0 );
////	System.out.println(binary);  得到了二进制数
//		
//		int decimal = 0;
//		int M = 0;
//		if (binary % 10 == 1)
//		{
//			do{
//				int k = binary % 10;
//				decimal = (int)(decimal + k*Math.pow(2, M));
//				M = M + 1;
//				binary /= 10;
//					
//			} while (binary != 0);
//
//		} else {
//			do{
//				int k = binary % 10;
//				decimal = (int)(decimal + k*Math.pow(2, M));
//				M = M + 1;
//				binary /= 10;
//					
//			} while (binary /10 != 0);
//		}
//		
//		System.out.println(decimal);
		
		// 素数和 (152ms 五个例子都对，通过)
//		Scanner in = new Scanner(System.in);
//		int i = 2;
//		int count = 1;
//		int[] numbers = new int[200];
//		numbers[0] = 2;
//		for (i = 3 ; i < 10000; i++)   // 第一步取得前200个素数的集合
//		{
//			for (int j = 2; j < i; j++)
//			{
//				if (i % j == 0) {
//					break;
//				}
//				if (j == i-1) {
//					numbers[count] = i;
//					count += 1;
//					if (count == 200)
//						break;
//			    }
//			}
//			if (count == 200) {
//				break;
//			}
//		}
//		
//		// 第二步取第N到第M个所有素数的和
//		int N = in.nextInt();
//		int M = in.nextInt();
//		int sum = 0;
//		if (N <= M)
//		{
//			for (int k = N-1; k <= M - 1; k++)
//			{
//				sum += numbers[k];
//			}
//		}
//		System.out.println(sum);
		
		
		// 念整数  (完成138ms)
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> integers = new ArrayList<Integer>();
		int number = in.nextInt();
		if (number == 0){
			System.out.print("ling");
		} else {
			while (number != 0)   
			{
				integers.add(0, number % 10);
				number /= 10;
			}
			
			if (integers.get(0) < 0)
			{
				System.out.print("fu");
				for (int i = 0; i < integers.size(); i++)
				{
					switch (integers.get(i))
					{
						case 0: System.out.print(" ling");break;
						case -1: System.out.print(" yi");break;
						case -2: System.out.print(" er");break;
						case -3: System.out.print(" san");break;
						case -4: System.out.print(" si");break;
						case -5: System.out.print(" wu");break;
						case -6: System.out.print(" liu");break;
						case -7: System.out.print(" qi");break;
						case -8: System.out.print(" ba");break;
						case -9: System.out.print(" jiu");break;
					}
				}
			}
			else
			{
				for (int i = 0; i < integers.size(); i++)
				{
					
						if (i == integers.size() - 1) {
							switch (integers.get(i))
							{   
								case 0: System.out.print("ling");break;
								case 1: System.out.print("yi");break;
								case 2: System.out.print("er");break;
								case 3: System.out.print("san");break;
								case 4: System.out.print("si");break;
								case 5: System.out.print("wu");break;
								case 6: System.out.print("liu");break;
								case 7: System.out.print("qi");break;
								case 8: System.out.print("ba");break;
								case 9: System.out.print("jiu");break;
							}
						}
						else {
							switch (integers.get(i))
							{   
								case 0: System.out.print("ling ");break;
								case 1: System.out.print("yi ");break;
								case 2: System.out.print("er ");break;
								case 3: System.out.print("san ");break;
								case 4: System.out.print("si ");break;
								case 5: System.out.print("wu ");break;
								case 6: System.out.print("liu ");break;
								case 7: System.out.print("qi ");break;
								case 8: System.out.print("ba ");break;
								case 9: System.out.print("jiu ");break;
						   }
				     	}
				}
			}
		}
		
		
	}
		
}



















