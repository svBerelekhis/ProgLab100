import java.util.ArrayList;

public class People {
    final String name;
    final ArrayList<SocialNetwork> socialNetworks;
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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", socialNetworks=" + socialNetworks +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }
}
