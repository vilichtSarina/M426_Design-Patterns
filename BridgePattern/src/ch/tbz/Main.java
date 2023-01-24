package ch.tbz;

public class Main {
    public static void main(String[] args) {
        ArtPiece sculpture = new Sculpture(new Create(), new Sell());
        sculpture.create();

        ArtPiece painting = new Painting(new Create(), new Sell());
        painting.create();
    }
}