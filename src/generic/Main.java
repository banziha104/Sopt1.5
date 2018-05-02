package generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        // String를 인자로 받는 리스트
        ArrayList<String> stringList = new ArrayList<>();

        // Integer를 인자로 받는 리스트
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<DoGeneric<String>> list2 = new ArrayList<>();

        DoGeneric<String> stringGeneric = new DoGeneric<>("sss");
        DoGeneric<Integer> intGeneric = new DoGeneric<>(1);

        stringGeneric.printType();
        intGeneric.printType();
    }
}
