package ch.tbz;

// Refinement 1 of abstract class
public class Sculpture extends ArtPiece {

    protected Sculpture(Atelier atelier1, Atelier atelier2) {
        super(atelier1, atelier2);
    }

    @Override
    public void create() {
        System.out.print("Sculpture was ");
        atelier1.make();
        atelier2.make();
    }
}
