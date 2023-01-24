package ch.tbz;

public class Fish {

    //Required fields
    private final String name;
    private final int age;

    //Optional fields
    private final boolean alive;
    private final String ownerName;

    public Fish(FishBuilder fishBuilder) {
        this.name = fishBuilder.name;
        this.age = fishBuilder.age;
        this.alive = fishBuilder.alive;
        this.ownerName = fishBuilder.ownerName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Fish \"" + this.name + " [age " + this.age + "(in months)]" + "\" is " + (this.alive ? "alive " : "dead ") + "and \ntheir owner's name " + (this.alive ? "is " : "was ") + (this.ownerName != null ? this.ownerName : "[unapplicable, " + this.name + " didn't have a home]");
    }

    // Builder class
    public static class FishBuilder {

        //Required fields
        private final String name;
        private final int age;

        //Optional fields
        private boolean alive;
        private String ownerName;

        public FishBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public FishBuilder alive(boolean alive) {
            this.alive = alive;
            return this;
        }

        public FishBuilder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        // Actual creation and returning of the Fish
        public Fish build() {
            return new Fish(this);
        }
    }
}

