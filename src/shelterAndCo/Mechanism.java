package shelterAndCo;

import animal.Animal;
import people.People;
import people.Volunteersvable;
import service.Printer;

import java.util.ArrayList;
import java.util.Objects;

public class Mechanism {
    private final String description;
    public void activate(Volunteersvable[] volunteersvables, ArrayList<Animal> animals, People[] people, FlashMob flashMob, Shelter shelter){
        publicMechanism();
        int i = 0;
        while (i < volunteersvables.length && i < animals.size()){
            volunteersvables[i].publicToSN(flashMob, animals.get(i));
            i++;
        }
        i = 0;
        while (i < volunteersvables.length && i < animals.size() && i < people.length){
            String text = "Сегодня я забираю собаку из приюта. Её зовут " + animals.get(i).getName() + ". Её мне привезет " + people[i].getName();
            people[i].publishToPersonalSN(text);
            people[i].takeResponsibility(animals.get(i));
            i++;
        }
        shelter.finishFlashMOb(flashMob);
    }

    public void publicMechanism(){ Printer.print("\n" + this.toString() + " АКТИВИРОВАН\n");
    }

    @Override
    public String toString() {
        return "Механизм: " + description;
    }

    public Mechanism(String description){
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanism mechanism = (Mechanism) o;
        return Objects.equals(description, mechanism.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
