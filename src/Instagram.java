public class Instagram extends SocialNetwork{
    private static Instagram instagram;
    private Instagram(){
        super("Instagram");
    }
    public static Instagram getInstagram(){
        if(instagram == null){
            instagram = new Instagram();
        }
        return instagram;
    }
    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }
}
