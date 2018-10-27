import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun `Doit simplifier un nombre romain décompacter`() {
        Assert.assertEquals("Doit simplifier le nombre IIII", "IV", simplify("IIII")) // 4
        Assert.assertEquals("Doit simplifier le nombre VIIII", "IX", simplify("VIIII")) // 9
        Assert.assertEquals("Doit simplifier le nombre XXXX", "XL", simplify("XXXX")) // 40
        Assert.assertEquals("Doit simplifier le nombre LXXXX", "XC", simplify("LXXXX")) // 90
        Assert.assertEquals("Doit simplifier le nombre CCCC", "CD", simplify("CCCC")) // 400
        Assert.assertEquals("Doit simplifier le nombre DCCCC", "CM", simplify("DCCCC")) // 900
        Assert.assertEquals("Doit simplifier le nombre CCCCXXIIII", "CDXXIV", simplify("CCCCXXIIII")) // 424
        Assert.assertEquals("Doit simplifier le nombre XXXXIII", "XLIII", simplify("XXXXIII")) // 43
    }
}