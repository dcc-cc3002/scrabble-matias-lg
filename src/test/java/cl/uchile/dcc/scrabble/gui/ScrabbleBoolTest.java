package cl.uchile.dcc.scrabble.gui;

import cl.uchile.dcc.scrabble.gui.nativeClasses.ScrabbleBool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleBoolTest {
    ScrabbleBool scrabbleTrue;
    ScrabbleBool scrabbleFalse;
    @BeforeEach
    void setUp(){
         scrabbleTrue = new ScrabbleBool(true);
         scrabbleFalse = new ScrabbleBool(false);
    }
    @Test
    void ConstructorTest(){
       var trueBool = new ScrabbleBool(true);
       var falseBool = new ScrabbleBool(false);
       assertEquals(trueBool, scrabbleTrue);
       assertEquals(falseBool, scrabbleFalse);
       assertNotEquals(trueBool, scrabbleFalse);
       assertNotEquals(falseBool, scrabbleTrue);
       assertEquals(trueBool.hashCode(), scrabbleTrue.hashCode());
       assertEquals(falseBool.hashCode(), scrabbleFalse.hashCode());
       assertNotEquals(trueBool.hashCode(), falseBool.hashCode());
    }
    @Test
    void BoolTest(){
        assertTrue(scrabbleTrue.getValue());
        assertFalse(scrabbleFalse.getValue());
    }
    @Test
    void StringTest(){
        String trueStr = "true";
        String falseStr = "false";
        assertEquals(trueStr, scrabbleTrue.toString());
        assertEquals(falseStr, scrabbleFalse.toString());
        assertNotEquals("", scrabbleTrue.toString());
        assertNotEquals(scrabbleFalse.toString(), scrabbleTrue.toString());
    }
}