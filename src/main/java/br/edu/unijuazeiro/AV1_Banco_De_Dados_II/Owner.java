package br.edu.unijuazeiro.AV1_Banco_De_Dados_II;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Owner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_Owner")
    @SequenceGenerator(sequenceName = "seq_Owner", allocationSize = 1, initialValue = 1, name = "gen_Owner")
    private Integer code;

    private String name;

    private String cpf;


    public Owner() {
        
    }

    public Owner(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Owner(Integer code, String name, String cpf) {
        this.code = code;
        this.name = name;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @OneToOne (cascade = CascadeType.ALL, fetch =FetchType.EAGER)//cardinalidade  um para um
    @JoinColumn
    private Dog dog;

    public Dog getDog(){
        return dog;
    }

    public void setDog(Dog dog){
        this.dog = dog;
    }

    

    
}