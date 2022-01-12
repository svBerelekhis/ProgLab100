import java.util.ArrayList;
import java.util.Random;

public class PeopleFactory {
    Random random;
    String[] womenNames = new String[]{"Анна", "Татьяна", "Ольга", "Александра", "Галина", "Светлана", "Виктория", "София"};
    String[] menNames = new String[]{"Алексей", "Анатолий", "Виктор", "Роман", "Константин", "Андрей", "Илья", "Никита"};
    String[] womenSoname = new String[]{"Агеева", "Булгакова", "Винокурова", "Горелова", "Давыдова", "Ежова", "Жданова", "Зорина"};
    String[] menSoname = new String[]{"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Петров", "Лебедев", "Козлов"};

    public People makePeople(TypeOfPeople typeOfPeople, boolean isMan, int inVk, int inFac){
        int nowAge = random.nextInt(62);
        nowAge += 18;
        String nowName = makeName(isMan);
        inVk += random.nextInt(2);
        inFac += random.nextInt(2);
        ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();
        if (inVk >= 1){
            socialNetworks.add(VK.getVk());
        }
        try {
            if (inFac >= 1){
                if (nowAge < 45){
                    throw new TooYoungForSNException();
                }
                socialNetworks.add(Facebook.getFacebook());
            }
        }catch (TooYoungForSNException e){
            String who = "него";
            if (!isMan){
                who = "нее";
            }
            Printer.print(nowName + " регистрируется на facebook. Но там у "+ who + " совсем нет друзей, поэтому публикаций никто не увидит");
        }
        if (socialNetworks.size() == 0){
            socialNetworks.add(Odnokclassniki.getOdnokclassniki());
        }
        if (typeOfPeople == TypeOfPeople.BUSINESSMAN){
            return new Businessman(nowName, socialNetworks, nowAge, isMan);
        }else if (typeOfPeople == TypeOfPeople.JOURNALIST){
            return new Journalist(nowName, socialNetworks, nowAge, isMan);
        }else if (typeOfPeople == TypeOfPeople.MUSICIAN){
            return new Musician(nowName, socialNetworks, nowAge, isMan);
        }
        else {
            return new People(nowName, socialNetworks, nowAge, isMan);
        }
    }

    private String makeName(boolean isMan){
        if (isMan){
            return menNames[random.nextInt(menNames.length)] + " " + menSoname[random.nextInt(menSoname.length)];
        }
        return womenNames[random.nextInt(womenNames.length)] + " " + womenSoname[random.nextInt(womenSoname.length)];
    }
    public Volunteersvable[] getSomeVolunteers(int count){
        TypeOfPeople[] types = new TypeOfPeople[]{TypeOfPeople.BUSINESSMAN, TypeOfPeople.JOURNALIST, TypeOfPeople.MUSICIAN};
        Volunteersvable[] res = new Volunteersvable[count];
        for (int i = 0; i < count; i++){
            int isThisMan = random.nextInt(2);
            res[i] = (Volunteersvable) makePeople(types[random.nextInt(3)], isThisMan >= 1, 0, 0);
        }
        return res;
    }
    public People[] getSomePeople(int count){
        People[] res = new People[count];
        for (int i = 0; i < count; i++){
            int isThisMan = random.nextInt(2);
            res[i] = makePeople(TypeOfPeople.PEOPLE, isThisMan >= 1, 1, 1);
        }
        return res;
    }
    public PeopleFactory(){
        random = new Random();
    }
}