package project.memoryexamples;

public class OpdrachtTekenen {
    public static void main(String[] args) {
        int x = 6;
        boolean b = true;
        if(b) {
            x = x * 2;
        }
        Person p = new Person();
        p.setName("Jamy");
        givePersonADog(p);
        changePerson(p);
        System.out.println(p.getDog().getName());
        changeDog(p.getDog());
        System.out.println(p.getName() + " : " + p.getDog().getName());
    }

    public static void givePersonADog(Person p) {
        p.setDog(new Dog());
        p.getDog().setName("Alfie");
    }

    public static void changePerson(Person p) {
        Person oldP = p;
        p = new Person();
        p.setName("Maaike");
        p.setDog(oldP.getDog());
        p.getDog().setName("blablabla");
    }

    public static void changeDog(Dog d) {
        d.setName("clifford");
    }


}
