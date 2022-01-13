import java.util.Objects;

public abstract class Animal{
    protected String name;
    protected int age;
    protected String color;
    protected SocialStatus socialStatus;

    public Animal(String name, int age, String color, SocialStatus socialStatus){
        this.name = name;
        this.age = age;
        this.color = color;
        this.socialStatus = socialStatus;
    }
    public void chengSocialStatus(SocialStatus newSocialStatus){
        this.socialStatus = newSocialStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) &&
                socialStatus == animal.socialStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, socialStatus);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", socialStatus=" + socialStatus +
                '}';
    }
}
