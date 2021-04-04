package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import toguru.jesusfc.dependencyInjectionWithSpring.services.ConstructorGreetingServiceImpl;

/**
 * Created By Jesús Fdez. Caraballo on 01/04/2021.
 */
class PropertyInjectedControllerTest {


    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGretting() {
        System.out.println(controller.getGretting());
    }
}