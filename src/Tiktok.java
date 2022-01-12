public class Tiktok extends SocialNetwork{
    private static Tiktok tiktok;
    private Tiktok(){
        super("Tiktok");
    }
    public static Tiktok getTiktok(){
        if(tiktok == null){
            tiktok = new Tiktok();
        }
        return tiktok;
    }
}
