import java.util.ArrayList;

public class Mechanism {
    String description;
    public void activate(Volunteersvable[] volunteersvables, ArrayList<Animal> animals, People[] people, FlashMob flashMob, Shelter shelter){
        publicMechanism();
        int i = 0;
        while (i < volunteersvables.length && i < animals.size()){
            volunteersvables[i].publicToSN(flashMob, animals.get(i));
            i++;
        }
        i = 0;
        while (i < volunteersvables.length && i < animals.size() && i < people.length){
            String text = "Сегодня я забираю собаку из приюта. Её зовут " + animals.get(i).name + ". Её мне привезет " + people[i].getName();
            people[i].publishToPersonalSN(text);
            i++;
        }
        shelter.finishFlashMOb(flashMob);
    }

    public void publicMechanism(){
        Printer.print(this.toString() + " АКТИВИРОВАН ");
    }

    @Override
    public String toString() {
        return "Mechanism{" +
                "description='" + description + '\'' +
                '}';
    }

    public Mechanism(String description){
        this.description = description;
    }

}
