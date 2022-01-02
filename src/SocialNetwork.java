public class SocialNetwork {
    String name;
    public void publish(People people, FlashMob flashMob, String text){
        Printer.print(this.name + ":\n" + people.toString() + " написал: " + text +"\n"+ flashMob.getHashtag());
    }
}
