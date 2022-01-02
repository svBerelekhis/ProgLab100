public class FlashMob {
    private Shelter organizers;
    private String hashtag;
    public FlashMob(Shelter organizers, String hashtag){
        this.hashtag = hashtag;
        this.organizers = organizers;
    }
    public String getHashtag(){
        return "#" + hashtag;
    }
}
