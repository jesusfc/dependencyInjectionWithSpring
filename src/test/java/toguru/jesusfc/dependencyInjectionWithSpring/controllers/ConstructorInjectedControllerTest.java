package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import toguru.jesusfc.dependencyInjectionWithSpring.services.ConstructorGreetingServiceImpl;

/**
 * Created By Jesús Fdez. Caraballo on 01/04/2021.
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGretting() {
        System.out.println(controller.getGretting());
    }
}