import java.util.ArrayList;

public class Journalist extends People implements Volunteersvable{
    @Override
    public String toString() {
        return "Journalist{" +
                "name='" + name + '\'' +
                ", socialNetworks=" + socialNetworks +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    public Journalist(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public void publicToSN() {

    }
}
