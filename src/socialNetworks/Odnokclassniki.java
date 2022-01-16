package socialNetworks;

public class Odnokclassniki extends SocialNetwork {
    private static Odnokclassniki odnokclassniki;
    private Odnokclassniki(){
        super("socialNetworks.Odnokclassniki");
    }
    public static Odnokclassniki getOdnokclassniki(){
        if(odnokclassniki == null){
            odnokclassniki = new Odnokclassniki();
        }
        return odnokclassniki;
    }

    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
