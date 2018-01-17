package pro.dekanat.model;

/**
 * Created by george on 1/13/18.
 */

public class Group {
    private int id;
    private String abr;
    private String name;
    private int chair;

    public Group(int id, String abr, String name, int chair) {
        this.id = id;
        this.abr = abr;
        this.name = name;
        this.chair = chair;
    }

    public Group() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }
}

