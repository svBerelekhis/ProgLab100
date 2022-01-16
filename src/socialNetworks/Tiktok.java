package socialNetworks;

public class Tiktok extends SocialNetwork {
    private static Tiktok tiktok;
    private Tiktok(){
        super("socialNetworks.Tiktok");
    }
    public static Tiktok getTiktok(){
        if(tiktok == null){
            tiktok = new Tiktok();
        }
        return tiktok;
    }
    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }
}
