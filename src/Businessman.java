import java.util.ArrayList;

public class Businessman extends People implements Volunteersvable{
    public Businessman(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public void publicToSN() {

    }
}
