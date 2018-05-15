
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
        int[] numeros = {5, 10};

        assertEquals(3628800, soma.somaDeFatoriais(numeros, mockedPrimo));
    }

    @Test
    public void somaDeFatoriais_Vetor02() {
        MathOps mockedMathOps = mock(MathOps.class);
        when(mockedMathOps.fatorial(3)).thenReturn(6);
        when(mockedMathOps.fatorial(4)).thenReturn(24);
        when(mockedMathOps.fatorial(5)).thenReturn(120);

        Somatoria soma = new Somatoria(mockedMathOps);
        int[] numeros = {3, 4, 4, 5};
        
        Primo mockedPrimo = mock(Primo.class);
        when(mockedPrimo.ehPrimo(3)).thenReturn(Boolean.TRUE);
        when(mockedPrimo.ehPrimo(4)).thenReturn(Boolean.FALSE);
        when(mockedPrimo.ehPrimo(5)).thenReturn(Boolean.TRUE);
        
        assertEquals(48, soma.somaDeFatoriais(numeros, mockedPrimo));
    }

}
