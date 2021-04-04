package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import toguru.jesusfc.dependencyInjectionWithSpring.services.GreetingService;

/**
 * Created By Jesús Fdez. Caraballo on 31/03/2021.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("primaryGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println(greetingService.sayGreeting());
        return "Hi there!!!";
    }
}
