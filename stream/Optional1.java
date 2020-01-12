

import java.util.Optional;


public class Optional1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        optional.isPresent();           // true
        optional.get();                 // "hello"
        optional.orElse("fallback");    // "hello"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }

}
