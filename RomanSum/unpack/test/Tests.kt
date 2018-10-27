import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun `Doit decompacter des nombres simples`() {
        Assert.assertEquals("Doit décompacter le nombre I", "I", unpack("I"))
        Assert.assertEquals("Doit décompacter le nombre IIII", "IIII", unpack("IV")) // 4
        Assert.assertEquals("Doit décompacter le nombre VIIII", "VIIII", unpack("IX")) // 9
        Assert.assertEquals("Doit décompacter le nombre XXXX", "XXXX", unpack("XL")) // 40
        Assert.assertEquals("Doit décompacter le nombre LXXXX", "LXXXX", unpack("XC")) // 90
        Assert.assertEquals("Doit décompacter le nombre CCCC", "CCCC", unpack("CD")) // 400
        Assert.assertEquals("Doit décompacter le nombre DCCCC", "DCCCC", unpack("CM")) // 900
    }

    @Test
    fun `Doit decompacter des nombres plus complexes`() {
        Assert.assertEquals("Doit décompacter le nombre MMMCDLIV", "MMMCCCCLIIII", unpack("MMMCDLIV")) // 3.454
        Assert.assertEquals("Doit décompacter le nombre MCLV", "MCLV", unpack("MCLV")) // 1.155
    }
}