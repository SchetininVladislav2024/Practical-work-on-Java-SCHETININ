import java.util.ArrayList;
import java.util.List;

class PetAlreadyExistsException extends Exception {
    public PetAlreadyExistsException(String message) {
        super(message);
    }
}

class PetClinic {
    private List<Pet> pets;

    public PetClinic() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) throws PetAlreadyExistsException {
        for (Pet existingPet : pets) {
            if (existingPet.getName().equals(pet.getName())) {
                throw new PetAlreadyExistsException("Питомец с таким именем уже существует: " + pet.getName());
            }
        }
        pets.add(pet);
    }

    public void displayPets() {
        for (Pet pet : pets) {
            pet.displayInfo();
        }
    }
}
