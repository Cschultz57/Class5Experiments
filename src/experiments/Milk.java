package experiments;

public class Milk implements Drinks {

    @Override
    public void pour() {
        System.out.println("Grab the gallon.");
        System.out.println("Then pour slowly into a glass. Be sure not to spill it.");
        System.out.println("If you do spill it be sure to cry.");
    }

    @Override
    public void drink() {
        System.out.println("Go sit and enjoy your drink at the kids table you milk drinker.");
        System.out.println("Although if it is chocolate I can't really blame you.");
    }

}
