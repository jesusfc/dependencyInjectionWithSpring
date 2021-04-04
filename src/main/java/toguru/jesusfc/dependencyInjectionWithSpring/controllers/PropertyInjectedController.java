package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import toguru.jesusfc.dependencyInjectionWithSpring.services.GreetingService;

/**
 * Created By Jesús Fdez. Caraballo on 01/04/2021.
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGretting() {
        return greetingService.sayGreeting();
    }

}
