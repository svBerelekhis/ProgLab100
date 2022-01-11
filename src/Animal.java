public class Animal{
    String name;
    int age;
    String color;
    SocialStatus socialStatus;

    public Animal(String name, int age, String color, SocialStatus socialStatus){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void chengSocialStatus(SocialStatus newSocialStatus){
        this.socialStatus = newSocialStatus;
    }
}
