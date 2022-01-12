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
}
