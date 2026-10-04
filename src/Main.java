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
    }
}