import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {

        lambdaVar();

        optionalTest();

        throwNull();
        getValue();
    }

    private static void optionalTest() {
        OptionalInt a = OptionalInt.of(2);

        var b = Optional.of("jkih");

        b.isEmpty();
        b.isPresent();

        b.ifPresent((bl) -> {
            System.out.println("b present:" + b + " bl:" + bl);
        });


        try{
            var c = Optional.of(null);
            c.isPresent();

        }catch (Exception e){
            System.out.println(e);
        }

        var c = Optional.empty();
        c.isPresent();



    }

    private static void lambdaVar() {
        Consumer<Integer> x = (var a) -> {
            System.out.println(
                    "integer: " +
                            (a instanceof Integer) +
                    "Object: " +
                            (a instanceof Object)
            );
        };
        x.accept(2);
    }

    private static void getValue() {
        try {
            String c =  "ghhggkjf";
            String cNonNUll = Objects.requireNonNull(c, "C shouldnt be null.");

            System.out.println("value: " + c);

        }catch(Exception e){
            System.out.println(e);
        }
    }

    private static void throwNull() {
        try {
            String c =  null;
            String cNonNUll = Objects.requireNonNull(c, "C shouldnt be null.");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
