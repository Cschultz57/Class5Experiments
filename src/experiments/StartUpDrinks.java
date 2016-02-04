package experiments;

public class StartUpDrinks {

    public static void main(String[] args) {
        //All of these options work thanks to polymorphism
        Drinks chardonnay = new Wine();
        Beer SpottedCow = new Beer();
        Drinks twoPercent = new Milk();
        Wine merlot = new Wine();
        Drinks PabstBlueRibbon = new Beer();
        Milk skim = new Milk();
        
        System.out.println("Wine: ");
        chardonnay.pour();
        chardonnay.drink();
        
        System.out.println("");
        System.out.println("Beer:");
        SpottedCow.pour();
        SpottedCow.drink();
        
        System.out.println("");
        System.out.println("Milk: ");
        skim.pour();
        skim.drink();

    }
}
