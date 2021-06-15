package test;

import main.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void balancedBracketsWithOtherCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void startsWithClosingBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void endsWithOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void badNestingWithNonBracketCharsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[dear]][god][[why]"));
    }

    @Test
    public void badNestingBracketsOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }

    @Test
    public void concurrentBracketedCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[good][boy]"));
    }

    @Test
    public void validConcatStringsReturnTrue() {
        String str1 = "[happy]";
        String str2 = "[happy2]";
        String str3 = str1.concat(str2);
        assertTrue(BalancedBrackets.hasBalancedBrackets(str3));
    }

    @Test
    public void invalidConcatStringsReturnFalse() {
        String str1 = "[happy[";
        String str2 = "[happy2]";
        String str3 = str1.concat(str2);
        assertFalse(BalancedBrackets.hasBalancedBrackets(str3));
    }


}
