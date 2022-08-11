package seminar1;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        Person pa = new Person("Sergei","Pavshin","06/07/1979",Gender.MALE);
        Person ma = new Person("Natalia","Pavshina","22/11/1976",Gender.FEMALE);
        Person so = new Person("Egor","Pavshin","25/02/2013",Gender.MALE);
        Person dot = new Person("Lada","Pavshina","14/05/2019",Gender.FEMALE);
        Person vi = new Person("Viktoriya","Danilova","08/12/2003",Gender.FEMALE);

        tree.addRelationship(pa,ma,Relation.HUSBAND,Relation.WIFE);
        tree.addRelationship(pa,so,Relation.FATHER,Relation.SON);
        tree.addRelationship(pa,dot,Relation.FATHER,Relation.DAUGHTER);
        tree.addRelationship(pa,vi,Relation.DAUGHTER,Relation.DAUGHTER);

        tree.addRelationship(ma,so,Relation.MOTHER,Relation.SON);
        tree.addRelationship(ma,dot,Relation.MOTHER,Relation.DAUGHTER);
        tree.addRelationship(ma,vi,Relation.MOTHER,Relation.DAUGHTER);

        tree.addRelationship(so,dot,Relation.BROTHER,Relation.SISTER);
        tree.addRelationship(so,vi,Relation.BROTHER,Relation.SISTER);

        tree.addRelationship(dot,vi,Relation.SISTER,Relation.SISTER);

        System.out.println("-------------------\n");
        Search.getRelation(pa,tree);
    }
}