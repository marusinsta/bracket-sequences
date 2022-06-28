package org.p3121.id311755.brackets;

public class Bracket {
    private int id;
    private boolean opening;

    public Bracket(int id, boolean opening) {
        this.id = id;
        this.opening = opening;
    }

    public int getId() {
        return id;
    }

    public boolean isOpening() {
        return opening;
    }
}
