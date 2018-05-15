
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SomatoriaTeste {
    MathOps mockedMathOps = mock(MathOps.class);
    Primo mockedPrimo = mock(Primo.class);
    Somatoria soma = new Somatoria(mockedMathOps);

    @Test
    public void somaDeFatoriais_Vetor01() {
        when(mockedMathOps.fatorial(5)).thenReturn(120);
        when(mockedMathOps.fatorial(10)).thenReturn(3628800);

        when(mockedPrimo.ehPrimo(5)).thenReturn(Boolean.TRUE);
        when(mockedPrimo.ehPrimo(10)).thenReturn(Boolean.FALSE);

        int[] numeros = {5, 10};

        assertEquals(3628800, soma.somaDeFatoriais(numeros, mockedPrimo));
    }

    @Test
    public void somaDeFatoriais_Vetor02() {
        when(mockedMathOps.fatorial(3)).thenReturn(6);
        when(mockedMathOps.fatorial(4)).thenReturn(24);
        when(mockedMathOps.fatorial(5)).thenReturn(120);
        
        when(mockedPrimo.ehPrimo(3)).thenReturn(Boolean.TRUE);
        when(mockedPrimo.ehPrimo(4)).thenReturn(Boolean.FALSE);
        when(mockedPrimo.ehPrimo(5)).thenReturn(Boolean.TRUE);

        int[] numeros = {3, 4, 4, 5};
     
        assertEquals(48, soma.somaDeFatoriais(numeros, mockedPrimo));
    }

}
