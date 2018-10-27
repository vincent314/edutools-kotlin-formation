import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun `Doit grouper les caractères`() {
        Assert.assertEquals("Doit grouper les caractères de IIIII","V" ,group("IIIII"))// 5
        Assert.assertEquals("Doit grouper les caractères de VV","X" ,group("VV"))// 10
        Assert.assertEquals("Doit grouper les caractères de XXXXX","L" ,group("XXXXX"))// 50
        Assert.assertEquals("Doit grouper les caractères de LL","C" ,group("LL"))// 100
        Assert.assertEquals("Doit grouper les caractères de CCCCC","D" ,group("CCCCC"))// 500
        Assert.assertEquals("Doit grouper les caractères de DD","M" ,group("DD"))// 1000
        Assert.assertEquals("Doit grouper les caractères de VVV","XV" ,group("VVV"))// 15
        Assert.assertEquals("Doit grouper les caractères de XXXXXXX","LXX" ,group("XXXXXXX"))// 70
        Assert.assertEquals("Doit grouper les caractères de LLI","CI" ,group("LLI"))// 101
        Assert.assertEquals("Doit grouper les caractères de DDDLL","MDC" ,group("DDDLL"))// 1600
        Assert.assertEquals("Doit grouper les caractères de MMMMMMXXXXXX","MMMMMMLX" ,group("MMMMMMXXXXXX"))// 6060
        Assert.assertEquals("Doit grouper les caractères de XXXVIIIIIIII","XXXXIII" ,group("XXXVIIIIIIII"))// 43
    }
}