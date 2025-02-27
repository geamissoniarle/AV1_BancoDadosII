package br.edu.unijuazeiro.AV1_Banco_De_Dados_II;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_Dog")
    @SequenceGenerator(sequenceName = "seq_Dog", allocationSize = 1, initialValue = 1, name = "gen_Dog")
    private Integer code;

    private String name;

    private String breed;



    public Dog() {
        
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog(Integer code, String name, String breed) {
        this.code = code;
        this.name = name;
        this.breed = breed;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    
}