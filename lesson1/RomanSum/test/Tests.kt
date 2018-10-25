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

    @Test
    fun `Doit fusioner 2 nombres romains`() {
        Assert.assertEquals("Doit fusionner I et X", "XI", merge("I", "X"))// 1 + 10 = 11
        Assert.assertEquals("Doit fusionner XI et VI", "XVII", merge("XI", "VI"))// 11 + 6 = 17
        Assert.assertEquals("Doit fusionner XVII et CL", "CLXVII", merge("XVII", "CL"))// 17 + 550 = 567
        Assert.assertEquals("Doit fusionner XVIIII et XXIIII", "XXXVIIIIIIII", merge("XVIIII", "XXIIII"))// 19 + 24 = 43
        Assert.assertEquals("Doit fusionner MMCCCLIIII et MCXXIIII", "MMMCCCCLXXIIIIIIII", merge("MMCCCLIIII", "MCXXIIII"))// 2354 + 1124 = 3478
    }

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