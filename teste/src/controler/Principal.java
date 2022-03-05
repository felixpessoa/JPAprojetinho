package controler;

import java.util.List;

import dao.impl.EnderecoDAOImpl;
import model.Endereco;

public class Principal {

	public static void main(String[] args) {

//		EntityManager em = JpaUtil.getEntityManager();
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.close();
		
		EnderecoDAOImpl enderecodao = new EnderecoDAOImpl();
		List<Endereco> endereco = enderecodao.listaTodos();
		System.out.println(endereco.toString());
		
	}

}
