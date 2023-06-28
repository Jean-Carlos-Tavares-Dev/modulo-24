package Teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.jcarlos.TesteCliente;

public class TesteClienteTest {
	@Test
	public void testeClasseCliente() {
	TesteCliente cli = new TesteCliente();
	cli.adicionarNome("Nome");
	cli.adicionarNome1("Jean");
	
	Assert.assertEquals("Jean", cli.getNome());
}

}
