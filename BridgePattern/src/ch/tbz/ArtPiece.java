package ch.tbz;

abstract class ArtPiece {

    protected Atelier atelier1;
    protected Atelier atelier2;

    protected ArtPiece(Atelier atelier1, Atelier atelier2) {
        this.atelier1 = atelier1;
        this.atelier2 = atelier2;
    }

    abstract public void create();
}
