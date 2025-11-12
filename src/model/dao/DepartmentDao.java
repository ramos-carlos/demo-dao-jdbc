package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	//operacao responsavel para inserir no banco o obj
	void insert(Department obj);
	//operacao responsavel para atualizar no banco o obj
	void update(Department obj);
	//operacao responsavel para deletar no banco o obj
	void deleteById(Integer id);
	
	//responsavel em pegar o Id e consultar no banco
	Department findById(Integer id);
	
	//retornar todos os departamentos
	List<Department> findAll();

}
