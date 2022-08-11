package seminar1;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        Person human1 = new Person("Name1", "Surname1", "01.01.1992", Gender.MALE);
        Person human2 = new Person("Name2", "Surname2", "01.01.1994", Gender.FEMALE);
        Person human3 = new Person("Name3", "Surname3", "01.01.1965", Gender.MALE);
        Person human4 = new Person("Name4", "Surname4", "01.01.1971", Gender.FEMALE);
        Person human5 = new Person("Name5", "Surname5", "01.01.1993", Gender.MALE);
        Person human6 = new Person("Name6", "Surname6", "01.01.2003", Gender.MALE);
        Person human7 = new Person("Name7", "Surname7", "01.01.1936", Gender.FEMALE);
        Person human8 = new Person("Name8", "Surname8", "01.01.2018", Gender.MALE);

        tree.addRelationship(human1,human2,Relation.HUSBAND,Relation.WIFE);
        tree.addRelationship(human1,human3,Relation.SON,Relation.FATHER);
        tree.addRelationship(human1,human8,Relation.FATHER,Relation.SON);
        tree.addRelationship(human1,human4,Relation.MOTHER,Relation.SON);
        tree.addRelationship(human1,human5,Relation.BROTHER,Relation.BROTHER);
        tree.addRelationship(human1,human6,Relation.BROTHER,Relation.BROTHER);
        tree.addRelationship(human1,human7,Relation.GRANDSON,Relation.GRANDMA);

        tree.addRelationship(human5,human8,Relation.UNCLE,Relation.NEPHEW);
        tree.addRelationship(human6,human8,Relation.UNCLE,Relation.NEPHEW);

        tree.addRelationship(human2,human8,Relation.MOTHER,Relation.SON);

        tree.addRelationship(human8,human3,Relation.GRANDSON,Relation.GRANDPA);


        System.out.println("-------------------\n");
        Search.getRelation(human8,tree);
    }
}
