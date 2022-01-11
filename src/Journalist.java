import java.util.ArrayList;

public class Journalist extends People implements Volunteersvable{
    public Journalist(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public void publicToSN() {

    }
}
