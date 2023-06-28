package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService{

	private IContratoDao contratoDao;
	public ContratoService(IContratoDao dao) {
		this.contratoDao=dao;
		
	}
	@Override
	public String salvar() {
		// TODO Auto-generated method stub
		contratoDao.salvar();
		return "Sucesso";
	}
	
}
