import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public int getAttractionsCount() {
        return attractions.size();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public int getStallsCount() {
        return stalls.size();
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

//    public ArrayList<IReviewed> getAllReviewed(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
//        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
//        for(Attraction attraction : attractions){
//            reviewed.add(attraction);
//        }
//        for(Stall stall : stalls){
//            reviewed.add(stall);
//
//        }
//        return reviewed;
//
//    }
}
