package com.spellhaven.spring_iocwithjava_0509_6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// L11 코드 뭐임? 뭐임?? 피카소 본명이 '파블로 딩고 호세 프란시스코 드파우라 호안 네포무세노 마리아 드로스 레메디오스 크리스피노 드라산티시스마 트리니다드 루이즈 이 피카소'라는데 거의 그 수준이네 ㅁㅊ;;
		// 왕관을 쓰려면 그 무게를 견뎌야 하지. L11의 조까튼 코드는 .xml 파일이 아니라 .java 파일을 편하게 자바빈즈로 쓰는 것의 무게다, ha ha.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
		Student stuBruh1 = ctx.getBean("student1", Student.class);
		
		System.out.println(stuBruh1.getName());
		System.out.println(stuBruh1.getAge() + "세");
		System.out.println(stuBruh1.getHobbies());
		System.out.println(stuBruh1.getHeight() + "cm");
		System.out.println(stuBruh1.getWeight() + "kg");
		
		Student stuBruh2 = ctx.getBean("student2", Student.class);
		
		System.out.println(stuBruh2.getName());
		System.out.println(stuBruh2.getAge() + "세");
		System.out.println(stuBruh2.getHobbies());
		System.out.println(stuBruh2.getHeight() + "cm");
		System.out.println(stuBruh2.getWeight() + "kg");
		
	}

}
