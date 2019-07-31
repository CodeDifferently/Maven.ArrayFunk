package com.stayready.hbcu.caseoscillator;

import com.stayready.hbcu.CaseOscillator;
import org.junit.Assert;
import org.junit.Test;

public class InvertLowerCaseTest {
    @Test
    public void test1() {
        // given
        test('a');
    }


    @Test
    public void test2() {
        // given
        test('b');
    }

    @Test
    public void test3() {
        // given
        test('c');
    }


    private void test(Character inputCharacter) {
        // given
        CaseOscillator caseOscillator = new CaseOscillator("");
        Character expectedCharacter = Character.toUpperCase(inputCharacter);
        
        // when
        Character actualCharacter = caseOscillator.invertCasing(inputCharacter);
        
        // then
        Assert.assertEquals(expectedCharacter, actualCharacter);
    }
}
