package project.memoryexamples;

public class MemoryManagementExamples {
    public static void main(String[] args) {
        int x = 5;
        double y = 6.7;
        x = 4;
        String s = "Blabla";
        calc(x, y);
        Person p = makePerson(s);
        alterPerson(p);
        System.out.println(p.getName() + " : " + p.getDog().getName());
    }

    public static double calc(double a, double b){
        double z = a + b;
        String s = "lala";
        return z;
    }

    public static Person makePerson(String name) {
        Person p = new Person();
        p.setName(name);
        p.setDog(new Dog());
        p.getDog().setName("Alfie");
        return p;
    }

    public static void alterPerson(Person p) {
        p.setName("nieuw");
        p.setDog(null);
    }
}
