package br.cinema.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String genero;
    private BigDecimal preco;
    
    
    /**
     * @deprecated hibernate only
     */
    public Filme() {

    }
    
    public Filme(String nome, String genero, BigDecimal preco) {
		this.nome = nome;
		this.genero = genero;
		this.preco = preco;
	}
    
    public BigDecimal getPreco() {
    	return Optional.ofNullable(this.preco).orElse(BigDecimal.ZERO).setScale(2, RoundingMode.HALF_UP);
	}
    
    public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

