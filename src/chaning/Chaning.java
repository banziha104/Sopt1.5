package chaning;

class Chaining {
    public static void main(String args[]){

        String myStatus = "I Am Really Really Hungry";

        System.out.println(
                myStatus    // String
                        .toUpperCase() // toUpperCase는 모든 문자를 대문자로 바꾼 String을 리턴함
                        .toLowerCase() // toLowerCase는 모든 문자를 소문자로 바꾼 String을 리턴함
                        .charAt(7) // charAt은 매개변수로 받은 숫자의 자릿수에 있는 글자하나를 리턴(char 자료형 리턴)
                // .something char 자료형은 메서드나 멤버를 가지고 있지 않기때문에 이상의 체이닝은 불가능함
        );


        System.out.println(
                myStatus    // String 반환
                        .toUpperCase() // String 반환
                        .toLowerCase() // String 반환
                        .charAt(7) // char 반환
                     // .something char 자료형은 메서드나 멤버를 가지고 있지 않기때문에 이상의 체이닝은 불가능함
        );
    }

}
