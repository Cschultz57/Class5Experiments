package experiments;

public class Wine implements Drinks {

    @Override
    public void pour() {
        System.out.println("Grab your corkscrew.");
        System.out.println("Insert. Twist. Pull.");
        System.out.println("Let it breathe and then pour into a wine glass.");
    }

    @Override
    public void drink() {
        System.out.println("Sip and enjoy some cheese or chocolate if you have it.");
    }

}
