import java.util.ArrayList;

public class People implements Hostable{
    final String name;
    final ArrayList<SocialNetwork> socialNetworks;
    int age;
    boolean isMan;
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
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void takeResponsibility(Animal animal) {
        this.animals.add(animal);
    }
}
