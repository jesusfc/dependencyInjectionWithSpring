package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 01/04/2021.
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
