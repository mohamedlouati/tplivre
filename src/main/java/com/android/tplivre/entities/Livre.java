package com.android.tplivre.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Livre implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long id;
    private Integer numISBN;
    private String titre;

    public Livre(Long id, Integer numISBN, String titre) {
        this.id = id;
        this.numISBN = numISBN;
        this.titre = titre;
    }
    public Livre() {
		
   	}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumISBN() {
        return numISBN;
    }

    public void setNumISBN(Integer numISBN) {
        this.numISBN = numISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

	@Override
	public String toString() {
		return "Livre [id=" + id + ", numISBN=" + numISBN + ", titre=" + titre + "]";
	}
    
}
