package ch.tbz;

// Refinement 2 of abstraction Fish
public class Painting extends ArtPiece {

    protected Painting(Atelier atelier1, Atelier atelier2) {
        super(atelier1, atelier2);
    }

    @Override
    public void create() {
        System.out.print("Painting was ");
        atelier1.make();
        atelier2.make();
    }
}
