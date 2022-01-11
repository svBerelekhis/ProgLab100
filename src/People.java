import java.util.ArrayList;

public class People {
    private final String name;
    private ArrayList<SocialNetwork> socialNetworks;
    int age;
    boolean isMan;
    public People(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.socialNetworks = socialNetworks;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }
}
