package toguru.jesusfc.dependencyInjectionWithSpring.controllers;

import org.springframework.stereotype.Controller;
import toguru.jesusfc.pets.PetService;

/**
 * Created By Jesús Fdez. Caraballo on 08/04/2021.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String cualEsElMejor() {
        return petService.getPetType();
    }
}
