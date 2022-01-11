import java.util.ArrayList;

public class Shelter implements Hostable{
    private String name;
    private ArrayList<Animal> wards;
    private ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();

    public Shelter(String name) {
        this.name = name;
        this.wards = new ArrayList<>();
    }
    public void publicationAtSN(FlashMob flashMob){
        String text = "В этом году наш приют " + this.name + " проводит флешмоб " + flashMob.getHashtag();
        for (SocialNetwork socialNetwork : socialNetworks){
            socialNetwork.publish(this, flashMob, text);
        }
    }
    public void registrationAtAllSN(){
        socialNetworks.add(VK.getVk());
        socialNetworks.add(Facebook.getFacebook());
        socialNetworks.add(Odnokclassniki.getOdnokclassniki());
    }
    public String getName(){
        return this.name;
    }

    @Override
    public void takeResponsibility(Animal animal) {
        for (SocialNetwork socialNetwork : socialNetworks){
            socialNetwork.publish(this, "Мы взяли опеку над " + animal.name);
        }
        this.wards.add(animal);
    }
}
