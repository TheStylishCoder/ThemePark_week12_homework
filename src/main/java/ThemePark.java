import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviewed = new ArrayList<IReviewed>();
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

    public int getReviewedCount() {
        return this.reviewed.size();
    }

    public void addToReviewed(IReviewed item){
        this.reviewed.add(item);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return reviewed;

    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCountByOne();
        visitor.addToVisitedAttractions(attraction);
    }
}
