public class Calculadora {

    public int soma(int pNumero, int sNumero) {

        if(pNumero < 0 | sNumero < 0){
            throw new RuntimeException("Numeros negativos não são validos");
        }
        int resultado = pNumero + sNumero;

        return resultado;
    }


}
