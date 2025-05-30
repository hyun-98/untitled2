
//변수 연습

public class Main {
    public static void main(String[] args) {
        int age = 25;       //정수 변수 age 생성

        System.out.println(age);    // age 출력

        age = 26;           // age 변수 변경
        System.out.println(age);    // 마지막으로 age에 저장된 값 출력

        double salary = 50000.75;   //실수 변수 salary 생성, int salary = 50.75 (불가능)

        System.out.println(salary); //salary 출력

        String name = "hyun";       // 문자열 변수 name 생성 (string은 참조형 변수)
        
        System.out.println(name);   // 변수 name 출력

        System.out.println(name.length());  // 변수 name의 문자 수 출력
    }
}