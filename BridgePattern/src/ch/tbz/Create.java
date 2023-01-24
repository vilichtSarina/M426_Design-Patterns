package ch.tbz;

// Concrete implementation
public class Create implements Atelier{

    @Override
    public void make() {
        System.out.print("created");
    }
}
