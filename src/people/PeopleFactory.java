package people;

import errorsAndExceptions.ToOldForSNException;
import errorsAndExceptions.TooYoungForSNException;
import service.Printer;
import socialNetworks.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class PeopleFactory {
    private final Random random;
    private final String[] womenNames = new String[]{"Анна", "Татьяна", "Ольга", "Александра", "Галина", "Светлана", "Виктория", "София"};
    private final String[] menNames = new String[]{"Алексей", "Анатолий", "Виктор", "Роман", "Константин", "Андрей", "Илья", "Никита"};
    private final String[] womenSoname = new String[]{"Агеева", "Булгакова", "Винокурова", "Горелова", "Давыдова", "Ежова", "Жданова", "Зорина"};
    private final String[] menSoname = new String[]{"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Петров", "Лебедев", "Козлов"};

    public People makePeople(TypeOfPeople typeOfPeople, boolean isMan, int inVk, int inFac, int inTw, int inTik, int inInst, int inOdn){
        int nowAge = random.nextInt(62);
        nowAge += 18;
        String nowName = makeName(isMan);
        inVk += random.nextInt(2);
        inFac += random.nextInt(2);
        inInst += random.nextInt(2);
        inTik += random.nextInt(2);
        inTw += random.nextInt(2);
        inOdn += random.nextInt(2);
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
            Printer.print(nowName + " регистрируется на facebook. Но там у "+ who + " совсем нет друзей-ископаемых, поэтому публикаций никто не увидит");
        }
        if (inInst >= 1){
            socialNetworks.add(Instagram.getInstagram());
        }
        if (inTw >= 1) {
            socialNetworks.add(Twitter.getTwitter());
        }
        try {
            if (inTik >= 1){
                if (nowAge >= 30){
                    throw new ToOldForSNException();
                }
                socialNetworks.add(Tiktok.getTiktok());
            }
        }catch (ToOldForSNException e){
            String who = "он";
            if (!isMan){
                who = "она";
            }
            Printer.print(nowName + " регистрируется в тикток. Но "+ who + " ни за что не будт что-то публиковать там. Потому что люди после 30 в тиктоке выглядят странно.");
        }
        try {
            if (inOdn >= 1){
                if (nowAge < 65){
                    throw new TooYoungForSNException();
                }
                socialNetworks.add(Facebook.getFacebook());
            }
        }catch (TooYoungForSNException e){
            String who = "ему";
            if (!isMan){
                who = "ей";
            }
            Printer.print(nowName + " регистрируется на одноклассниках. Но "+ who + " там совсем не интересно, поэтому там ничего не публикуется");
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
            res[i] = (Volunteersvable) makePeople(types[random.nextInt(3)], isThisMan >= 1, 0, 0, 0, 0, 0, 0);
        }
        return res;
    }
    public People[] getSomePeople(int count){
        People[] res = new People[count];
        for (int i = 0; i < count; i++){
            int isThisMan = random.nextInt(2);
            res[i] = makePeople(TypeOfPeople.PEOPLE, isThisMan >= 1, 1, 1, 1, 1, 1, 1);
        }
        return res;
    }
    public PeopleFactory(){
        random = new Random();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleFactory that = (PeopleFactory) o;
        return Objects.equals(random, that.random) &&
                Arrays.equals(womenNames, that.womenNames) &&
                Arrays.equals(menNames, that.menNames) &&
                Arrays.equals(womenSoname, that.womenSoname) &&
                Arrays.equals(menSoname, that.menSoname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(random);
        result = 31 * result + Arrays.hashCode(womenNames);
        result = 31 * result + Arrays.hashCode(menNames);
        result = 31 * result + Arrays.hashCode(womenSoname);
        result = 31 * result + Arrays.hashCode(menSoname);
        return result;
    }

    @Override
    public String toString() {
        return "people.PeopleFactory{" +
                "random=" + random +
                ", womenNames=" + Arrays.toString(womenNames) +
                ", menNames=" + Arrays.toString(menNames) +
                ", womenSoname=" + Arrays.toString(womenSoname) +
                ", menSoname=" + Arrays.toString(menSoname) +
                '}';
    }
}