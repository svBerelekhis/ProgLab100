public abstract class SocialNetwork {
    String name;
    public SocialNetwork(String name){
        this.name = name;
    }
    public void publish(People people, FlashMob flashMob) {
        Printer.print(name + ": новая запись от " + people.getName() + ".\n" + flashMob.getText() + "\n" + flashMob.getHashtag());
    }
}
