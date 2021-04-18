package toguru.jesusfc.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 08/04/2021.
 */
@Profile("cat")
@Service
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Los gatos son los mejores";
    }
}
