package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 08/04/2021.
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Los Perros son los mejores";
    }
}
