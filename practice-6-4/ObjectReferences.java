public class ObjectReferences {

    static final class Pet {
        String name;

        Pet(String name) {
            this.name = name;
        }

        void rename(String newName) {
            name = newName;
        }
    }

    public static void main(String[] args) {
        Pet first = new Pet("Luna");
        Pet alias = first;
        Pet independent = new Pet("Luna");

        System.out.println(first == alias);
        System.out.println(first == independent);

        alias.rename("Sol");

        System.out.println(first.name);
        System.out.println(independent.name);
    }
}