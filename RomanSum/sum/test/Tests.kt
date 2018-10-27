import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun `Doit faire la somme des nombres romains`(){
        Assert.assertEquals("Doit sommer I avec I", "II", sum("I", "I")) // 1 + 1 = 2
        Assert.assertEquals("Doit sommer I avec C", "CI", sum("I", "C")) // 1 + 100 = 101
        Assert.assertEquals("Doit sommer V avec XI", "XVI", sum("V", "XI")) // 5 + 11 = 16
        Assert.assertEquals("Doit sommer XXXIX avec I", "XL", sum("XXXIX", "I")) // 39 + 1 = 40
        Assert.assertEquals("Doit sommer XCIX avec I", "C", sum("XCIX","I")) // 99 + 1 = 100
        Assert.assertEquals("Doit sommer XIX avec XXIV", "XLIII", sum("XIX", "XXIV")) // 19 + 24 = 43
        Assert.assertEquals("Doit sommer DCXCIV avec MMCCCLIV", "MMMXLVIII", sum("DCXCIV", "MMCCCLIV")) // 694 + 2354 = 3048
    }
}