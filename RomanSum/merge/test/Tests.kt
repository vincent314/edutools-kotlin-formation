import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun `Doit fusioner 2 nombres romains`() {
        Assert.assertEquals("Doit fusionner I et X", "XI", merge("I", "X"))// 1 + 10 = 11
        Assert.assertEquals("Doit fusionner XI et VI", "XVII", merge("XI", "VI"))// 11 + 6 = 17
        Assert.assertEquals("Doit fusionner XVII et CL", "CLXVII", merge("XVII", "CL"))// 17 + 550 = 567
        Assert.assertEquals("Doit fusionner XVIIII et XXIIII", "XXXVIIIIIIII", merge("XVIIII", "XXIIII"))// 19 + 24 = 43
        Assert.assertEquals("Doit fusionner MMCCCLIIII et MCXXIIII", "MMMCCCCLXXIIIIIIII", merge("MMCCCLIIII", "MCXXIIII"))// 2354 + 1124 = 3478
    }
}