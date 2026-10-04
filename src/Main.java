import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phase 1");
        ArrayCollection<Artifact> catalog = new ArrayCollection<Artifact>();
        catalog.add(new Artifact("A101", "Stone Axe", "Paleolithic"));
        catalog.add(new Artifact("B202", "Gold Coin", "Classical"));
        catalog.add(new Artifact("C303", "Oil Painting", "Renaissance"));

        Artifact key = new Artifact("B202", "", "");
        System.out.println("Contains B202? " + catalog.contains(key));
        System.out.println("Found: " + catalog.get(key));

        catalog.remove(new Artifact("A101", "", ""));
        System.out.println("Size after removing A101: " + catalog.size());
        catalog.print();

        System.out.println("\nPhase 2");
        LinkedCollection<Artifact> ledger = new LinkedCollection<Artifact>();
        ledger.add(new Artifact("D404", "Viking Sword", "Medieval"));
        ledger.add(new Artifact("E505", "Ming Vase", "Ming Dynasty"));
        ledger.add(new Artifact("F606", "Bronze Mirror", "Bronze Age"));

        Artifact key2 = new Artifact("E505", "", "");
        System.out.println("Contains E505? " + ledger.contains(key2));

        ledger.remove(key2);
        System.out.println("Size after removing E505: " + ledger.size());
        ledger.print();

        System.out.println("\nPhase 3");
        ArrayList<Artifact> museumList = new ArrayList<Artifact>();
        museumList.add(new Artifact("M04", "Jade Mask", "Mayan"));
        museumList.add(new Artifact("A01", "Scarab", "Egyptian"));
        museumList.add(new Artifact("Z99", "Clock", "Modern"));
        museumList.add(new Artifact("B12", "Amphora", "Greek"));

        System.out.println("Before sorting:");
        for (Artifact a : museumList) System.out.println(a);

        Collections.sort(museumList);

        System.out.println("After sorting:");
        for (Artifact a : museumList) System.out.println(a);

    }
}