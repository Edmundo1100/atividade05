
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SomatoriaTeste {

    @Test
    public void somaDeFatoriais_Vetor01() {
        MathOps mockedMathOps = mock(MathOps.class);
        when(mockedMathOps.fatorial(5)).thenReturn(120);
        when(mockedMathOps.fatorial(10)).thenReturn(3628800);
        
        Primo mockedPrimo = mock(Primo.class);
        when(mockedPrimo.ehPrimo(5)).thenReturn(Boolean.TRUE);
        when(mockedPrimo.ehPrimo(10)).thenReturn(Boolean.FALSE);
        
        Somatoria soma = new Somatoria(mockedMathOps);
        int[] numeros = new int[2];
        numeros[0] = 5;
        numeros[1] = 10;
      
        assertEquals(3628800, soma.somaDeFatoriais(numeros, mockedPrimo));
    }
}
