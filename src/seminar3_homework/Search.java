package seminar3_homework;

import java.util.Iterator;
import java.util.List;

public class Search {
    public static void getRelation(Person person, Relation relation, FamilyTree tree) {
        List<Relationship> elements = tree.getRelationship();
        Iterator<Relationship> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Relationship comparable = iterator.next();
            if (comparable.getPerson().getFirstname().equals(person.getFirstname()) && comparable.getPerson().getFirstname().equals(person.getFirstname())
                    && comparable.getRelation() == relation) {
                System.out.println(comparable);
            }
        }
    }

    public static void getRelation(Relation relation, FamilyTree tree) {
        List<Relationship> elements = tree.getRelationship();
        Iterator<Relationship> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Relationship comparable = iterator.next();
            if (comparable.getRelation() == relation) {
                System.out.println(comparable);
            }
        }
    }

    public static void getRelation(Person person, FamilyTree tree) {
        List<Relationship> elements = tree.getRelationship();
        Iterator<Relationship> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Relationship comparable = iterator.next();
            if (comparable.getPerson().getFirstname().equals(person.getFirstname()) && comparable.getPerson().getSurname().equals(person.getSurname())) {
                System.out.println(comparable);
            }
        }
    }
}