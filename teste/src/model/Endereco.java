package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Endereco {

	@Column(name = "RUA")
	private String logradouro;
	private int numero;
	private String complemento;

	@Id
	@Column(name = "ID_ENDERECO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENDERECO")
	@SequenceGenerator(name = "ENDERECO", sequenceName = "S_ID_ENDERECO", allocationSize = 1, initialValue = 100)
	private int id;

	public Endereco() {
		super();
	}


	public Endereco(String logradouro, int numero, String complemento, int id) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.id = id;
	}

//Metodos Get and Set
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + id;
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (id != other.id)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", id="
				+ id + "]";
	}
	
	
	

}
