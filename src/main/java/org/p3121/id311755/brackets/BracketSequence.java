package org.p3121.id311755.brackets;

import java.util.ArrayList;
import java.util.List;

public class BracketSequence {
    private List<Bracket> brackets;
    private int index;

    public BracketSequence() {
        brackets = new ArrayList<>();
        index = 0;
    }

    public void addBracket(Bracket bracket) {
        brackets.add(bracket);
    }

    public Bracket getNext() {
        if (!isEnd())
            return brackets.get(index++);
        else
            return null;
    }

    public void resetIndex() {
        index = 0;
    }

    public boolean isEnd() {
        return index >= brackets.size();
    }
}
