package ch.tbz;

//Concrete implementation
public class Sell implements Atelier{

    @Override
    public void make() {
        System.out.print(" and sold\n");
    }
}
