public class Odnokclassniki extends SocialNetwork{
    private static Odnokclassniki odnokclassniki;
    private Odnokclassniki(){
        super("Odnokclassniki");
    }
    public static Odnokclassniki getOdnokclassniki(){
        if(odnokclassniki == null){
            odnokclassniki = new Odnokclassniki();
        }
        return odnokclassniki;
    }
}
