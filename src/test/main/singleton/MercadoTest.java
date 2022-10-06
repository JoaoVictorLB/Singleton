package test.main.singleton;

import main.singleton.Gerente;
import main.singleton.Mercado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoTest {
    @Test
    public void deveRetornarNomeGerente(){
        String funcionarios[] = {"Jorge", "Juliana", "Júllia"};
        Mercado mercado = new Mercado("João", funcionarios);
        assertEquals("João", Gerente.getGerente().getNome());
    }

    @Test
    public void deveRetornarFuncionarios(){
        String funcionarios[] = {"Jorge", "Juliana", "Júllia"};
        Mercado mercado = new Mercado("João", funcionarios);

        String funcionariosDoGerente[] = {"", "", ""};

        for(int i = 0; i < Gerente.getGerente().getFuncionarios().size(); i++){
            funcionariosDoGerente[i] = Gerente.getGerente().getFuncionarios().get(i).getNome();
        }
        assertEquals(funcionarios[0], funcionariosDoGerente[0]);
        assertEquals(funcionarios[1], funcionariosDoGerente[1]);
        assertEquals(funcionarios[2], funcionariosDoGerente[2]);
    }
}