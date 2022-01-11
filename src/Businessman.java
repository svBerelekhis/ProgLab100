import java.util.ArrayList;

public class Businessman extends People implements Volunteersvable{
    public Businessman(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public String toString() {
        return "Businessman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void publicToSN(FlashMob flashMob) {
        for(SocialNetwork socialNetwork : this.socialNetworks){
            socialNetwork.publish(this, flashMob);
        }
    }
}
