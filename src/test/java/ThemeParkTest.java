import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

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

    @Before
    public void before(){
        themePark = new ThemePark();

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
}
