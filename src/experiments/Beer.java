package experiments;

public class Beer implements Drinks {

    @Override
    public void pour() {
        System.out.println("Grab your bottle opener.");
        System.out.println("Pop the cap.");
        System.out.println("What are you pouring for? Unless you have a frosted mug enjoy that right out of the bottle.");
    }

    @Override
    public void drink() {
        System.out.println("Despite what your friends say try not to chug it all. That's just wasteful.");
    }

}
