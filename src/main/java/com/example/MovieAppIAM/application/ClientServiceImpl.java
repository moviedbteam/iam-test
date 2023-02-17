package com.example.MovieAppIAM.application;



import com.example.MovieAppIAM.domaine.Client;
import com.example.MovieAppIAM.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private IClientRepository repo;

    @Override
    public Client findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
