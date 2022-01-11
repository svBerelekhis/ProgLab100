public class Main {
    public static void main(String[] args){
        PeopleFabrica peopleFabrica = new PeopleFabrica();
        Volunteersvable[] volunteersvables = peopleFabrica.getSomeVolunteers(10);
        for (Volunteersvable volunteersvable : volunteersvables){
            Printer.print(volunteersvable.toString());
        }
    }
}
