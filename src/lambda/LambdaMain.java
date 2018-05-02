package lambda;

import java.util.function.Function;

public class LambdaMain {
    public static void main(String args[]){
        Button button = new Button( () -> {
            System.out.println("클릭되었습니다");
        });
    }
}
