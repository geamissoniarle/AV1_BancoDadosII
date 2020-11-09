package br.edu.unijuazeiro.AV1_Banco_De_Dados_II;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class App {
    private App() {
    }

    
    public static void main(String[] args) {

        

        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("unit-unijuazeiro_av1");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

                // * INSERT //
                //Owner owner = new Owner();
                //owner.setName("Geamison Iarle");       // cria o dono
                //owner.setCpf("061.812.455-71");

                //Dog dog = new Dog();
                //dog.setName("Wolf");  // nome do pet
                //dog.setBreed("Labrador"); //raça do pet

                //owner.setDog(dog);  // atribui o pet ao dono


                //em.persist(owner); // salva o dono no BD

                



                //* SELECT //
               //Owner owner = em.find(Owner.class, 3);  
                //System.out.println("ID do Dono: " + owner.getCode());
                //System.out.println("Nome do Dono: " + owner.getName());
                //System.out.println("CPF do Dono: " + owner.getCpf());
                //System.out.println("Nome do Cachorro: " + owner.getDog().getName());
                //System.out.println("Raça do Cachorro: " + owner.getDog().getBreed());

                //Dog dog = new Dog();
                //dog.setName("Lessi");  // cria nome dog
                //dog.setBreed("ViraLata");

                //owner.setDog(dog);
                //em.merge(owner);




                //* UPDATE //
                //Owner owner = em.find(Owner.class, 3);
                //System.out.println("nome: " + owner.getName());         
                //em.refresh(owner); //atualiza objeto na aplicação
                //em.merge(owner); 

                //* REMOVER
                //em.remove(owner);
                //
        







        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
