package com.stayready.hbcu.caseoscillator;

import com.stayready.hbcu.CaseOscillator;
import org.junit.Assert;
import org.junit.Test;

public class InvertUpperCaseTest {
    @Test
    public void test1() {
        // given
        test('D');
    }


    @Test
    public void test2() {
        // given
        test('E');
    }

    @Test
    public void test3() {
        // given
        test('F');
    }


    private void test(Character inputCharacter) {
        // given
        CaseOscillator caseOscillator = new CaseOscillator("");
        Character expectedCharacter = Character.toLowerCase(inputCharacter);
        caseOscillator.toggleState();
        
        // when
        Character actualCharacter = caseOscillator.invertCasing(inputCharacter);
        
        // then
        Assert.assertEquals(expectedCharacter, actualCharacter);
    }
}
