package review;

public class Main {
    public static void main(String args[]){

        // 구체화된 컴퓨터, 부팅음을 바꾸거나 할 순없다
        // 몇개를 만들어도 똑같다
        MaterializationComputer mComputer = new MaterializationComputer();
        mComputer.booting();


        // 추상회된 컴퓨터, 생성할때 부팅관련 로직을 넣어줄 수있다.
        // 인스턴스마다 다르게 생성할 수 있다 -> 코드의 유연성
        AbsractComputer absractComputer = new AbsractComputer(new Bootable() {
            @Override
            public void booting() {
                System.out.println("윈도우에 오신걸 환영합니다");
            }
        });

        // 다른 인스턴스! 다른 로직!
        AbsractComputer  absractComputer1 = new AbsractComputer(new Bootable() {
            @Override
            public void booting() {
                System.out.println("죽기 싫으면 업데이트 해라");
            }
        });


    }
}
