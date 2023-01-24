package ch.tbz;

public class Main {
    public static void main(String[] args) {
        // Create first fish with all information
        Fish hans = new Fish.FishBuilder("Hans", 3)
                .alive(true)
                .ownerName("Sarina")
                .build();

        //Create second fish without the owner name
        Fish ruedi = new Fish.FishBuilder("Ruedi", 1)
                .alive(false)
                .build();

        System.out.println(hans);
        System.out.println("-".repeat(20));
        System.out.println(ruedi);
    }
}