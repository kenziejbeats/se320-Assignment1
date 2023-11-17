package Assignment4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Operations {
    public static void main(String[] args) {
        
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Kaitie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        Set<String> clonedSet1 = new LinkedHashSet<>(set1);
        Set<String> clonedSet2 = new LinkedHashSet<>(set2);

        clonedSet1.addAll(clonedSet2);
        System.out.println("The Union of the sets would be: " + clonedSet1);

        clonedSet1 = new LinkedHashSet<>(set1);
        clonedSet1.removeAll(clonedSet2);
        System.out.println("The Difference of the sets would be: " + clonedSet1);

        clonedSet1 = new LinkedHashSet<>(set1);
        clonedSet1.retainAll(clonedSet2);
        System.out.println("The Intersection of the sets would be: " + clonedSet1);

    }
    
}
