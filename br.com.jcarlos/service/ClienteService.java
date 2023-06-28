package service;

import dao.IClienteDAO;

public class ClienteService {

	private IClienteDAO clienteDao;
	
	public ClienteService(IClienteDAO clienteDao) {
		//clienteDao = new ClienteDAO();
		this.clienteDao = clienteDao;
		
	}
	
	public String salvar() {
		clienteDao.salvar();
		return "Suceso";
	}

	public String atualizar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String buscar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String excluir() {
		// TODO Auto-generated method stub
		return null;
	}

 	
}
