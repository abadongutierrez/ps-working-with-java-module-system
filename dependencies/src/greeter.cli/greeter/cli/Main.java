package greeter.cli;

import greeter.hello.service.HelloMessageService;

public class Main {
    public static void main(String... args) {
        var service = new HelloMessageService();
        System.out.println(service.getMessage() + " from a module!");
    }
}