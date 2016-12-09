package com.hand.test;

import java.util.Scanner;

public class Exam_2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("请输入工资：");
	double payMoney=input.nextDouble();
	System.out.println("所需要缴纳的税费为："+getTax(payMoney));//调用计算所得税方法
}
public static double getTax(double payMoney) 
{ 
	double t=0; //t代表应交税款
	double b =payMoney-3500; //b代表应纳税所得额
	if(b <=1500) //计算级数1的税款
	{ 
		t=b*0.03; 
		return t; 
	} 
	else if(b <=4500 && b>1500) //计算级数2的税款
	{ 
			t=1500*0.03+(b-1500)*0.1; 
			return t; 
	} 
	else if(b <=9000 && b>4500) //计算级数3的税款
	{ 
		t=1500*0.03+3000*0.1+(b-4500)*0.2; 
		return t; 
	} 
	else if(b <=35000 && b>9000) //计算级数4的税款 
	{ 
		t=1500*0.03+3000*0.1+4500*0.2+(b-9000)*0.25; 
		return t; 
	} 
	else if(b <=55000 && b>35000) //计算级数5的税款
	{ 
		t=1500*0.03+3000*0.1+4500*0.2+(35000-9000)*0.25+(b-35000)*0.3; 
		return t; 
	} 
	else if(b <=80000 && b>55000) //计算级数6的税款
	{ 
		t=1500*0.03+3000*0.1+4500*0.2+(35000-9000)*0.25+(55000-35000)*0.3+(b-55000)*0.35; 
		return t; 
	} 
	else if(b >80000) //计算级数7的税款
	{ 
		t=1500*0.03+3000*0.1+4500*0.2+(35000-9000)*0.25+(55000-35000)*0.3+(80000-55000)*0.35+(b-80000)*0.45; 
		return t; 
	} 
	else if(b <=100000) //计算级数8的税款
	{ 
		t=21625+(b-80000)*0.4; 
		return t; 
	} 
	else //计算级数9的税款
	{ 
		t=29625+(b-100000)*0.45; 
		return t; 
	} 
	} 
}
