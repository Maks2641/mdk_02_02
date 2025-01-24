public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.Name = "Kate";
        mother.Age = 34;

        Daughter daughter = new Daughter();
        daughter.Age = 13;
        daughter.Name = "Alice";

        mother.print();
        daughter.print();
   }
}