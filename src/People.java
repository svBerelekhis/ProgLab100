import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                isMan == people.isMan &&
                Objects.equals(name, people.name) &&
                Objects.equals(socialNetworks, people.socialNetworks) &&
                Objects.equals(animals, people.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, socialNetworks, age, isMan, animals);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", socialNetworks=" + socialNetworks +
                ", age=" + age +
                ", isMan=" + isMan +
                ", animals=" + animals +
                '}';
    }
}
