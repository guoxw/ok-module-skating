package cn.c.module.skating.service;

import java.util.Random;

public class Aa {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for(int i=80; i<600; i++) {
			sb.append("insert into tab_Student(name,sex,age,school,guardianTelephone,qq,weixin,enrollmentDate,training,number,level,remark )" 
						+"values('测试学员"+i+"','"+((random.nextInt(10))>5 ? "男": "女")+"', "+(random.nextInt(14-3) + 3)+",'大同小学', '1582304"+(random.nextInt(9999-1000) + 1000)+"','"+(random.nextInt(999999999-10000000) + 10000000)+"','','2015-5-18','待定', '00"+(random.nextInt(999-100) + 100)+"','初级','菜鸟')").append('\n');
		}
		System.out.println(sb.toString());
		
	}
	
	public int getInt(int min, int max){
		Random random = new Random();
		return random.nextInt(max-min) + min;
	}

}
