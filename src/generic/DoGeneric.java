package generic;

public class DoGeneric<MyType> {

    MyType member;

    public DoGeneric(MyType member){
        this.member = member;
    }

    public void printType(){
        System.out.println(member.getClass());
    }

}
