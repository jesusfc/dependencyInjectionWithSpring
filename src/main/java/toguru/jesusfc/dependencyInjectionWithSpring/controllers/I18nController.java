package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import toguru.jesusfc.dependencyInjectionWithSpring.services.GreetingService;

/**
 * Created By Jesús Fdez. Caraballo on 03/04/2021.
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayhello() {
        return greetingService.sayGreeting();
    }
}
