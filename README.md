# JavaExamples
Java Features
This repository mainly contains Java 8 features which includes functional programming

1. Lambda Expression : 
Lambda expressions are introduced in Java 8 and are touted to be the biggest feature of Java 8. Lambda expression facilitates functional programming, and simplifies the development a lot.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
Here instead of creating anonymous object, Java 8 comes with the lambda expression:

Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});
