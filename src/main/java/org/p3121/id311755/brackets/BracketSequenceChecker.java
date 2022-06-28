package org.p3121.id311755.brackets;

import java.util.Stack;

public class BracketSequenceChecker{

    private Stack<Bracket> stack;

    public BracketSequenceChecker() {
        stack = new Stack<>();
    }

    public boolean check(BracketSequence sequence) {
        stack.clear();
        while (!sequence.isEnd()) {
            Bracket next = sequence.getNext();
            if (next.isOpening()) {
                stack.push(next);
            }
            else {
                if (stack.empty()) {
                    return false;
                }
                if (stack.peek().getId() == next.getId())
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.empty();
    }
}
