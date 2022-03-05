package dao;

import java.util.List;

import model.Endereco;

public interface EnderecoDAO {
	public void salvar(Endereco endereco);

	public void altera(Endereco endereco);

	public void remover(int id);

	public Endereco pesquisar(int id);

	public List<Endereco> listaTodos();

}
