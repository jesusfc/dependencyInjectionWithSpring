package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 03/04/2021.
 */
public class PropertyInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return " Hello World - Property Service";
    }
}
