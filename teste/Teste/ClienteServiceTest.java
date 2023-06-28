package Teste;
import org.junit.Test;
import org.junit.Assert;
import dao.IClienteDAOMock;
import dao.IContratoDao;
import org.junit.Assert;
import service.ClienteService;
import dao.ContratoDao;

	public class ClienteServiceTest {
		
		@Test 
		public void salvarTest() {
			IContratoDao dao = new ContratoDao();		
			IClienteDAOMock mockDao = new IClienteDAOMock(dao);
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.salvar();
			Assert.assertEquals("sucesso", retorno);
		}

		@Test (expected = UnsupportedOperationException.class)
		public void esperadoErroNoSalvar() {
			IContratoDao dao = new ContratoDao();
			IClienteDAOMock mockDao = new IClienteDAOMock(dao);
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.salvar();
			Assert.assertEquals("sucesso", retorno);
		
		}

		@Test
		public void buscarTest() {
			IContratoDao dao = new ContratoDao();
			IClienteDAOMock mockDao = new IClienteDAOMock(dao);
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.buscar();
			Assert.assertEquals("resultado da busca", retorno);
		}

		@Test
		public void excluirTest() {
			IContratoDao dao = new ContratoDao();
			IClienteDAOMock mockDao = new IClienteDAOMock(dao);
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.excluir();
			Assert.assertEquals("excluído com sucesso", retorno);
		}

		@Test
		public void atualizarTest() {
			IContratoDao dao = new ContratoDao();
			IClienteDAOMock mockDao = new IClienteDAOMock(dao);
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.atualizar();
			Assert.assertEquals("atualizado com sucesso", retorno);
		}
	}
