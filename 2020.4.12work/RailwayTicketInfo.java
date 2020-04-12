package com.Q.demo;

public class RailwayTicketInfo {

	public static void main(String[] args) {
		String trainNumber = "Z94";
		String time ="2020年4月12日12:01";
		String seat = "04车005号中铺";
		String seatCategory = "硬卧";
		String origin = "苏州北";
		String destination = "西安北";
		double price = 279.5;
		String expiryDate = "限乘当日当次车";
		String identity = "3205251919****1234";
		System.out.println("车次："+trainNumber);	
		System.out.println("发车时间："+time);
		System.out.println("座位："+seat);
		System.out.println("席别："+seatCategory);
		System.out.println("发站/到站："+origin+"/"+destination);
		System.out.println("票价："+price);
		System.out.println("有效期："+expiryDate);
		System.out.println("身份证号："+identity);
	}

}
