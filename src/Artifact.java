public class Artifact implements Comparable<Artifact> {
    private String id;
    private String name;
    private String era;

    public Artifact(String id, String name, String era) {
        this.id = id;
        this.name = name;
        this.era = era;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEra() { return era; }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Artifact other = (Artifact) obj;
        return this.id.equals(other.id);
    }

    public int compareTo(Artifact other) {
        return this.id.compareTo(other.id);
    }

    public String toString() {
        return id + " - " + name + " (" + era + ")";
    }
}