package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import toguru.jesusfc.dependencyInjectionWithSpring.services.GreetingService;

/**
 * Created By Jesús Fdez. Caraballo on 01/04/2021.
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGretting() {
        return greetingService.sayGreeting();
    }

}
