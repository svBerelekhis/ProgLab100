package socialNetworks;

import people.People;
import service.Printer;
import shelterAndCo.FlashMob;
import shelterAndCo.Shelter;

public abstract class SocialNetwork {
    String name;
    public SocialNetwork(String name){
        this.name = name;
    }
    public void publish(People people, FlashMob flashMob, String text) {
        Printer.print(name + ": новая запись от " + people.toString() + ".\n" + text + "\n" + flashMob.getHashtag() + "\n");
    }
    public void publish(Shelter shelter, FlashMob flashMob, String text){
        Printer.print(name + " : новая запись от " + shelter.toString() + ".\n" + text  + flashMob.getHashtag() + "\n");
    }
    public void publish(People people, String text){
        Printer.print(name + " : новая запись от " + people.toString() + ".\n" + text + "\n");
    }
    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }
}
