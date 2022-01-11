import java.util.ArrayList;

public class Musician extends People implements Volunteersvable{
    public Musician(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", socialNetworks=" + socialNetworks +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    @Override
    public void publicToSN() {

    }
}
