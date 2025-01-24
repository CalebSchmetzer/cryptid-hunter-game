import java.util.Stack;
import java.util.Scanner;

public class Navigation {
    // Stacks will handle traveling between regions 
    private Stack < Area > visitedRegionStack;
    private Stack < Area > upcomingRegionStack;

    public Navigation() {
        visitedRegionStack = new Stack < > ();
        upcomingRegionStack = new Stack < > ();
    }

    public void addToUpcomingRegionStack(Area area) {
        upcomingRegionStack.push(area);
    }

    public void enterArea() {

        Area nextArea = upcomingRegionStack.pop();

        visitedRegionStack.push(nextArea);
        System.out.println("You have entered the " + nextArea.getName() + ": " + nextArea.getDescription());
        System.out.println();
    }

    public void backtrackArea() {
        if (!visitedRegionStack.isEmpty() && !(visitedRegionStack.size() == 1)) {

            Area currentArea = visitedRegionStack.pop();

            upcomingRegionStack.push(currentArea);

            Area areaToBacktrackTo = visitedRegionStack.peek();

            System.out.println("You have backtracked to: " + areaToBacktrackTo.getName());
            System.out.println();
        } else {
            System.out.println("No areas to backtrack to!");
            System.out.println();
        }
    }

    public Area getCurrentArea() {
        return visitedRegionStack.peek();
    }

    public Stack < Area > getUpcomingRegionStack() {
        return upcomingRegionStack;
    }
}
