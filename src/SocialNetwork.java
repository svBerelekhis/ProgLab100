public abstract class SocialNetwork {
    String name;
    public SocialNetwork(String name){
        this.name = name;
    }
    public void publish(People people, FlashMob flashMob) {
        Printer.print(name + ": новая запись от " + people.toString() + ".\n" + flashMob.getText() + "\n" + flashMob.getHashtag());
    }
    public void publish(Shelter shelter, FlashMob flashMob, String text){
        Printer.print(name + " : новая запись от " + shelter.getName() + ".\n" + text + "\n" + flashMob.getHashtag());
    }
    public void publish(Shelter shelter, String text){
        Printer.print(name + " : новая запись от " + shelter.getName() + ".\n" + text);
    }
}
