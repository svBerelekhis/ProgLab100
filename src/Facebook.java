public class Facebook extends SocialNetwork{
    private static Facebook facebook;
    private Facebook(){
        super("Facebook");
    }
    public static Facebook getFacebook(){
        if(facebook == null){
            facebook = new Facebook();
        }
        return facebook;
    }
}
