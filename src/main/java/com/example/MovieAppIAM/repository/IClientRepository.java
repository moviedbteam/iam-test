package com.example.MovieAppIAM.repository;

import com.example.MovieAppIAM.domaine.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends CrudRepository<Client,String> {


    Client findByEmail(String email);
}
