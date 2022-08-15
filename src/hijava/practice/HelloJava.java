package hijava.practice;


/**
 * 첫번째 자바 실습
 * @author Kim
 * @update say함수 추가 (2022-08-05 by 김성민)
 */
public class HelloJava {

	public static void main(String[] args) {

		// HelloJava에게 say라는 명령을 내림
		HelloJava.say("Hi");

		// JVM이 스스로 화면에 출력
		System.out.println("Hello Java !!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}