public class PetNursery { // class for Pet Nursery

    // NOTE: I am nesting the subclasses of Animal, Puppy, and Kitten in the Pet Nursery class, which isn't really necessary
    public static class Animal {

        private String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name; // returns name passed when creating the object
        }

        public int getAge() {
            return age; // returns age passed when creating the object
        }

        @Override
        public String toString() {
            return name + ", Age: " + age; // this just makes it so that when you print the class it show up as some string rather than just a random number idk what its technically called tho
        }
    }

    public static class Kitten extends Animal { // inherit animal as parent class

        private String color;

        public Kitten(String name, int age, String color) {
            super(name, age); // has the same attributes as animal (age and name)
            this.color = color; // add color as an attribute
        }

        public String getColor() {
            return color; // return color passed when creating object
        }

        @Override
        public String toString() {
            return super.toString() + ", Color: " + color; // this inherits the toString method and adds color
        }
    }

    public static class Puppy extends Animal { // inherit animal as parent class

        private String breed;

        public Puppy(String name, int age, String breed) {
            super(name, age); // has the same attributes as animal (age and name)
            this.breed = breed; // add breed attribute
        }

        public String getBreed() {
            return breed; // returns breed
        }

        @Override
        public String toString() {
            return super.toString() + ", Breed: " + breed; // adds breed to thingy
        }
    }

    public static class Nursery {

        private java.util.List<Animal> pets; // list with pets

        public Nursery() {
            pets = new java.util.ArrayList<>();
        }

        public void addPet(Animal pet) {
            pets.add(pet); // add a pet to nursery
        }

        public void printAllPets() {
            for (Animal pet : pets) { // cycle through pets
                System.out.println(pet); // print each pet class this will be the to string
            }
        }
    }

    public static void main(String[] args) {
        Nursery nursery = new Nursery();

        Puppy puppy1 = new Puppy("Rex", 2, "Beagle");
        Kitten kitten1 = new Kitten("Whiskers", 1, "Green");

        nursery.addPet(puppy1);
        nursery.addPet(kitten1);

        nursery.printAllPets();
    }
}
