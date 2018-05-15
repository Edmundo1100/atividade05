
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SomatoriaTeste {

    @Test
    public void somaDeFatoriais_Vetor01() {
        
        Primo primo = new Primo();
        Somatoria soma = new Somatoria();
        int[] numeros = {5,10};
      
        assertEquals(3628800, soma.somaDeFatoriais(numeros, primo));
    }
}
