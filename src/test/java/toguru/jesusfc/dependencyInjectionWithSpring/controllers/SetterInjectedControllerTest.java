package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import toguru.jesusfc.dependencyInjectionWithSpring.services.ConstructorGreetingServiceImpl;

/**
 * Created By Jesús Fdez. Caraballo on 01/04/2021.
 */
class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGretting() {
        System.out.println(controller.getGretting());
    }
}