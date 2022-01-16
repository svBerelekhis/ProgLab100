package socialNetworks;

public class Facebook extends SocialNetwork {
    private static Facebook facebook;
    private Facebook(){
        super("socialNetworks.Facebook");
    }
    public static Facebook getFacebook(){
        if(facebook == null){
            facebook = new Facebook();
        }
        return facebook;
    }
    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }
}
