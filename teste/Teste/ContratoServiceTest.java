package Teste;

import org.junit.Assert;
import org.junit.Test;

import service.ContratoService;
import service.IContratoService;
import dao.ContratoDaoMock;
import dao.IContratoDao;

public class ContratoServiceTest {

	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDaoMock(); 
		IContratoService service = new ContratoService(dao);
		String retorno =service.salvar();
		Assert.assertEquals("sucesso", retorno);
	
	}

	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Resultado da busca", retorno);
	}

	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluído com sucesso", retorno);
	}

	@Test
	public void atualizarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado com sucesso", retorno);
	}
}
