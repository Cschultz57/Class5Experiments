package experiments;

public class Pizza {

    private int slices;
    private int numOfToppings;

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        if (slices <= 0) {
            throw new IllegalArgumentException("You must have more than 0 slices however "
                    + "it is probably best if you do not eat the pizza whole either..");
        }else if(slices > 10){
            throw new IllegalArgumentException("Those slices are starting to get kinda small.");
        }
        this.slices = slices;
    }

    public int getNumOfToppings() {
        return numOfToppings;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings <= 0) {
            throw new IllegalArgumentException("You don't want any toppings? Not even cheese? Go get some bread.");
        }
        this.numOfToppings = numOfToppings;
    }

    public void serve(int slices) {
        this.setSlices(slices);
        this.getAPlate();
        this.putOnPlate();
        this.sitAndEnjoy();
    }

    private void getAPlate() {
        System.out.println("Grab a plate.");
    }

    private void putOnPlate() {
        System.out.println("Put the pizza on the plate.");
    }

    private void sitAndEnjoy() {
        System.out.println("Now you just sit and enjoy. Hey can I get a slice? Oh wait I'm a computer. Nevermind.");
    }

}
