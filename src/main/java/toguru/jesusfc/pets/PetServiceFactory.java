package toguru.jesusfc.pets;

import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 19/04/2021.
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }

    }

}
