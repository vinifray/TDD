import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testarMetodoSomaRetornandoResultado(){
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.soma(1, 2);
        //assertEquals serve para testar se são iguais
        Assert.assertEquals(3, resultado);
    }

    @Test
    public void testarValidacaoDeNumeroNegativoCasoQueEstouraExcecao(){
        Calculadora calculadora = new Calculadora();

        //AssertThrows serve para testar exceções
        Assert.assertThrows(RuntimeException.class, () -> {calculadora.soma(2, -1);});
        RuntimeException exception = Assert.assertThrows(RuntimeException.class, () -> {
            calculadora.soma(-1, 2);
        });

        //assertTrue serve para testar se a condição é verdadeira
        Assert.assertTrue(exception.getMessage().equals("Numeros negativos não são validos"));
    }
}
