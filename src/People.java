import java.util.ArrayList;

public class People implements Hostable{
    protected final String name;
    protected final ArrayList<SocialNetwork> socialNetworks;
    protected int age;
    protected boolean isMan;
    ArrayList<Animal> animals;
    public People(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.socialNetworks = socialNetworks;
        this.isMan = isMan;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + this.age + " лет)";
    }
    public void publishToPersonalSN(String text){
        for (SocialNetwork sn: socialNetworks){
            sn.publish(this, text);
        }
    }
    @Override
    public void takeResponsibility(Animal animal) {

        this.animals.add(animal);
        animal.chengSocialStatus(SocialStatus.HOME);
    }
}
