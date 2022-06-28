package org.p3121.id311755;

import org.p3121.id311755.brackets.Bracket;
import org.p3121.id311755.brackets.BracketSequence;
import org.p3121.id311755.brackets.BracketSequenceChecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

public class BracketSequenceCheckerTest {
    private final BracketSequenceChecker checker = new BracketSequenceChecker();

    @Test
    public void emptySequence() {
        BracketSequence seq = new BracketSequence();
        assertTrue(checker.check(seq));
    }

    @Test
    public void singleID() {
        BracketSequence seq = new BracketSequence();
        seq.addBracket(new Bracket(0, true));
        testSequence(false, seq);
        seq.addBracket(new Bracket(0, false));
        testSequence(true, seq);

        BracketSequence seq1 = new BracketSequence();
        seq1.addBracket(new Bracket(5, true));
        seq1.addBracket(new Bracket(5, true));
        seq1.addBracket(new Bracket(5, true));
        testSequence(false, seq1);
        seq1.addBracket(new Bracket(5, false));
        testSequence(false, seq1);
        seq1.addBracket(new Bracket(5, true));
        seq1.addBracket(new Bracket(5, true));
        seq1.addBracket(new Bracket(5, false));
        seq1.addBracket(new Bracket(5, false));
        seq1.addBracket(new Bracket(5, false));
        seq1.addBracket(new Bracket(5, true));
        seq1.addBracket(new Bracket(5, false));
        seq1.addBracket(new Bracket(5, false));
        testSequence(true, seq1);

        BracketSequence seq2 = new BracketSequence();
        seq2.addBracket(new Bracket(85, false));
        testSequence(false, seq2);
        seq2.addBracket(new Bracket(85, true));
        testSequence(false, seq2);
        seq2.addBracket(new Bracket(85, false));
        testSequence(false, seq2);
        seq2.addBracket(new Bracket(85, true));
        testSequence(false, seq2);
    }

    @Test
    public void multipleID() {
        BracketSequence seq = new BracketSequence();
        seq.addBracket(new Bracket(0, true));
        seq.addBracket(new Bracket(1, true));
        testSequence(false, seq);
        seq.addBracket(new Bracket(1, false));
        seq.addBracket(new Bracket(0, false));
        testSequence(true, seq);
        seq.addBracket(new Bracket(146, true));
        seq.addBracket(new Bracket(3, true));
        seq.addBracket(new Bracket(3, true));
        seq.addBracket(new Bracket(3, false));
        seq.addBracket(new Bracket(3, false));
        seq.addBracket(new Bracket(146, false));
        testSequence(true, seq);

        BracketSequence seq1 = new BracketSequence();
        seq1.addBracket(new Bracket(777, true));
        seq1.addBracket(new Bracket(999, true));
        seq1.addBracket(new Bracket(999, false));
        seq1.addBracket(new Bracket(777, false));
        testSequence(true, seq1);
        seq1.addBracket(new Bracket(777, true));
        seq1.addBracket(new Bracket(999, false));
        testSequence(false, seq1);
        seq1.addBracket(new Bracket(999, true));
        seq1.addBracket(new Bracket(777, false));
        testSequence(false, seq1);

        BracketSequence seq2 = new BracketSequence();
        seq2.addBracket(new Bracket(175175, true));
        seq2.addBracket(new Bracket(3121, true));
        seq2.addBracket(new Bracket(7575, true));
        seq2.addBracket(new Bracket(7575, false));
        seq2.addBracket(new Bracket(9999, true));
        seq2.addBracket(new Bracket(9999, false));
        seq2.addBracket(new Bracket(7575, true));
        seq2.addBracket(new Bracket(7575, false));
        seq2.addBracket(new Bracket(3121, false));
        testSequence(false, seq2);
        seq2.addBracket(new Bracket(175175, false));
        testSequence(true, seq2);

        BracketSequence seq3 = new BracketSequence();
        seq3.addBracket(new Bracket(999999, false));
        testSequence(false, seq3);
        seq3.addBracket(new Bracket(999998, false));
        seq3.addBracket(new Bracket(999997, false));
        seq3.addBracket(new Bracket(999996, false));
        seq3.addBracket(new Bracket(999996, true));
        seq3.addBracket(new Bracket(999997, true));
        seq3.addBracket(new Bracket(999998, true));
        seq3.addBracket(new Bracket(999999, true));
        testSequence(false, seq3);
        seq3.addBracket(new Bracket(999999, false));
        seq3.addBracket(new Bracket(999998, false));
        seq3.addBracket(new Bracket(999997, false));
        seq3.addBracket(new Bracket(999996, false));
        testSequence(false, seq3);
    }

    private void testSequence(boolean isTrue, BracketSequence seq) {
        if (isTrue)
            assertTrue(checker.check(seq));
        else
            assertFalse(checker.check(seq));
        seq.resetIndex();
    }
}