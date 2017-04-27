import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuxiangzhe on 2017/4/11.
 */
public class XXZTest {
    private ALU alu=new ALU();
    @org.junit.Test
    public void integerRepresentation() throws Exception {
        assertEquals("11111111",alu.integerRepresentation("-1",8));
        assertEquals("1100",alu.integerRepresentation("-4",4));
        assertEquals("10000000",alu.integerRepresentation("-128",8));
        assertEquals("10000000",alu.integerRepresentation("128",8));
        assertEquals("0000000",alu.integerRepresentation("128",7));
        assertEquals("010000000",alu.integerRepresentation("128",9));
        assertEquals("00000011",alu.integerRepresentation("3",8));
        assertEquals("10000000000000000000000000000000",alu.integerRepresentation("-2147483648",32));
    }

    @org.junit.Test
    public void floatRepresentation() throws Exception {
        assertEquals("1100000111100000000000000000000000000000000000000000000000000000",alu.floatRepresentation("-2147483648.0",11,52));
        assertEquals("01000001001000000000000000000000",alu.floatRepresentation("10.0",8,23));
        assertEquals("0101000111100",alu.floatRepresentation("47.0",5,7));
        assertEquals("011111000000",alu.floatRepresentation("2147483647.0",5,6));
        assertEquals("111111000000",alu.floatRepresentation("-2147483647.0",5,6));
        assertEquals("10111101110011001100110011001101",alu.floatRepresentation("-0.1",8,23));
        assertEquals("00111101110011001100110011001101",alu.floatRepresentation("0.1",8,23));
        assertEquals("000000000000",alu.floatRepresentation("0.0",5,6));
        assertEquals("01001111100000000000000000000000",alu.floatRepresentation("4294967295.0",8,23));
    }
    @Test
    public void hardfloatRepresentation() throws Exception{
        //around 2^1025
        assertEquals("011000000000000000",alu.floatRepresentation("359538626972463181545861038157804946723595000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000659248448274432.0",12,5));
    }

    @org.junit.Test
    public void ieee754() throws Exception {

    }

    @org.junit.Test
    public void integerTrueValue() throws Exception {

    }

    @org.junit.Test
    public void floatTrueValue() throws Exception {

    }

    @org.junit.Test
    public void negation() throws Exception {

    }

    @org.junit.Test
    public void leftShift() throws Exception {

    }

    @org.junit.Test
    public void logRightShift() throws Exception {

    }

    @org.junit.Test
    public void ariRightShift() throws Exception {

    }

    @org.junit.Test
    public void fullAdder() throws Exception {

    }

    @org.junit.Test
    public void claAdder() throws Exception {

    }

    @org.junit.Test
    public void oneAdder() throws Exception {

    }

    @org.junit.Test
    public void adder() throws Exception {

    }

    @org.junit.Test
    public void integerAddition() throws Exception {

    }

    @org.junit.Test
    public void integerSubtraction() throws Exception {

    }

    @org.junit.Test
    public void integerMultiplication() throws Exception {

    }

    @org.junit.Test
    public void integerDivision() throws Exception {

    }

    @org.junit.Test
    public void signedAddition() throws Exception {

    }

    @org.junit.Test
    public void floatAddition() throws Exception {

    }

    @org.junit.Test
    public void floatSubtraction() throws Exception {

    }

    @org.junit.Test
    public void floatMultiplication() throws Exception {

    }

    @org.junit.Test
    public void floatDivision() throws Exception {

    }

}