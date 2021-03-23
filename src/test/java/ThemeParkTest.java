import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.security.Permission;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

   private ThemePark themePark;
   private Dodgems dodgems;
   private Park park;
   private Playground playground;
   private RollerCoaster rollerCoaster;
   private CandyflossStall candyflossStall;
   private IceCreamStall iceCreamStall;
   private TobaccoStall tobaccoStall;
   private Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 3);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
        visitor = new Visitor(35, 1.8, 50.00);

    }

    @Test
    public void themeParkAttractionsListStartsEmpty(){
        assertEquals(0, themePark.getAttractionsCount());
    }

    @Test
    public void themeParkCanAddAttractions(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        assertEquals(2, themePark.getAttractionsCount());

    }

    @Test
    public void themeParkStallsListStartsEmpty(){
        assertEquals(0, themePark.getStallsCount());
    }

    @Test
    public void themeParkCanAddStalls(){
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        assertEquals(2, themePark.getStallsCount());
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addToReviewed(dodgems);
        themePark.addToReviewed(park);
        themePark.addToReviewed(playground);
        themePark.addToReviewed(rollerCoaster);
        themePark.addToReviewed(candyflossStall);
        themePark.addToReviewed(iceCreamStall);
        themePark.addToReviewed(tobaccoStall);
        assertEquals(7, themePark.getReviewedCount());

    }

    @Test
    public void canVisit(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractionsCount());

    }
}
