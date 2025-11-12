package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	//operacao responsavel para inserir no banco o obj
	void insert(Seller obj);
	//operacao responsavel para atualizar no banco o obj
	void update(Seller obj);
	//operacao responsavel para deletar no banco o obj
	void deleteById(Integer id);
		
	//responsavel em pegar o Id e consultar no banco
	Seller findById(Integer id);
		
	//retornar todos os departamentos
	List<Seller> findAll();
}
