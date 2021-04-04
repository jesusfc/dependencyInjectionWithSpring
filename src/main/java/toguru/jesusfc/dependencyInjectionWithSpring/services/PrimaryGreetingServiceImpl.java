package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 03/04/2021.
 */
@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return " Hello World - Primary Service";
    }
}
