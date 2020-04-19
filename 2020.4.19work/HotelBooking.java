package com.Q.demo;

import java.util.Random;
import java.io.*;
import java.util.*;

public class HotelBooking {

	public static void main(String[] args)throws IOException {
		Scanner cin=new Scanner(System.in);
		System.out.println("请问以下三家酒店中您想要预订哪家酒店？");
		System.out.println("1:格林豪泰苏州火车站南广场拙政园商务酒店");
		System.out.println("2:格雅苏州工业园区金鸡湖东方之门酒店");
		System.out.println("3:格林豪泰苏州漕湖工业园智选酒店");
		System.out.println("*************************");
		System.out.println("请问您是否是会员？");
		System.out.println("1:是 2:否");
		int name = cin.nextInt();
		int vip = cin.nextInt();
		while(name < 1 | name > 3 | vip < 1 | vip > 2) {
			System.out.println("输入错误！请重新输入:");
			int newName = cin.nextInt();
			int newVip = cin.nextInt();
			name = newName;
			vip = newVip;
		}
		
		if (name == 1){
			System.out.println("请问您想预订什么类型的房间？");
			System.out.println("1:大床房 2:标间 3:豪华双床房");
			boolean flag2 = true;
			do {
				int room = cin.nextInt();
				if (room == 1) {
					System.out.println("订单信息:\n"
							+ "名称:格林豪泰苏州火车站南广场拙政园商务酒店\n"
							+ "地址:江苏省苏州市姑苏区人民路2156号\n"
							+ "房型:大床房\n"
							+ "优惠:20元代金券\n"
							+ "价格:"+Math.round(189*(1-vip%2*0.15)-20)+"元");
				}else if (room == 2) {
					System.out.println("订单信息:\n"
							+ "名称:格林豪泰苏州火车站南广场拙政园商务酒店\n"
							+ "地址:江苏省苏州市姑苏区人民路2156号\n"
							+ "房型:标间\n"
							+ "优惠:10元代金券\n"
							+ "价格:"+Math.round(169*(1-vip%2*0.12)-10)+"元");
				}else if (room == 3) {
					System.out.println("订单信息:\n"
							+ "名称:格林豪泰苏州火车站南广场拙政园商务酒店\n"
							+ "地址:江苏省苏州市姑苏区人民路2156号\n"
							+ "房型:豪华双床房\n"
							+ "优惠:30元代金券\n"
							+ "价格:"+Math.round(209*(1-vip%2*0.09)-30)+"元");
				}else {
					System.out.println("输入错误!请重新输入");
					flag2 = false;
				}
			} while (flag2 == false);
			
		}else if (name == 2) {
			System.out.println("订单信息:\n"
					+ "名称:格雅苏州工业园区金鸡湖东方之门酒店\n"
					+ "地址:江苏省苏州工业园区星海街169号\n"
					+ "房型:豪华双床房\n"
					+ "优惠:20元代金券\n"
					+ "价格:"+Math.round(399*(1-vip%2*0.15)-20)+"元");
		}else if (name == 3) {
			System.out.println("订单信息:"
					+ "名称:格林豪泰苏州漕湖工业园智选酒店\n"
					+ "地址:江苏省苏州市相城区黄畦路3号\n"
					+ "房型:超级大床房\n"
					+ "优惠:10元代金券\n"
					+ "价格:"+Math.round(189*(1-vip%2*0.15)-10)+"元");
		}else {
			System.out.println("输入错误!请重新输入:");
		}
		
		int num = roomNum(2,30);
		System.out.println("房间号:"+num);
		cin.close();
	}
	
	public static int roomNum(int floor,int maxRoom){   
        Random random=new Random(); 
        int n = random.nextInt(floor)+1; 
        int num=random.nextInt(maxRoom)+n*100; 
        return num;  
    }

}
