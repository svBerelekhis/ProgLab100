public enum SocialStatus {
    HOME("Домашний"),
    WILD("Уличный"),
    SHELTER("Приютский");

    String description;

    SocialStatus(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
