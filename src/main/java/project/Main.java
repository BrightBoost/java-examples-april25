package project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static int counter = 3;

    public static void main(String[] args) {

        System.out.println(counter);
        Document document1 = new MailDocument();
        Document.documentProcessor(document1);
        document1.setAuthor("Jamy");
        System.out.println(document1.getAuthor());
        document1.setTitle("Hallo");
        // document1.setReceiver("Maaike");

        MailDocument document2 = new MailDocument();

        document2.setAuthor("Maaike");
        System.out.println(document2.getAuthor());
        document2.setReceiver("Jamy");


        WordDocument wordDocument1 = new WordDocument();

        List<Document> documentList = new ArrayList<>();
        documentList.add(document1);
        documentList.add(document2);
        documentList.add(wordDocument1);

        Document d1 = documentList.get(1);
//        System.out.println(((WordDocument) d1).getCategory());
        if(d1 instanceof WordDocument wd1) {
            wd1.setCategory("Boek");
            System.out.println(wd1.getCategory());
        } else {
            System.out.println("Niet van worddoc type");
        }

        d1.test();

        // lambda uitleg

        DocumentPrinter dp = new DocumentPrinter();
        dp.print();

        // wegwerp implementatie, anonieme implementatie
        Printer p = new Printer() {
            @Override
            public void print() {
                System.out.println("On the fly printer");
            }
        };

        p.print();

        // lambda expressions: mooiere syntax voor anonieme implementaties van functional interfaces
        Printer p2 = () -> System.out.println("lambda print");
        p2.print();
        // documentlist naar stream api
        Document foundDoc = documentList.stream()
                .filter(d -> d.getTitle() != null && d.getTitle().length() > 2)
//                .forEach(d -> System.out.println(document1.getTitle()));
                .findFirst().orElse(null);



    }
}
