package com.example.MovieAppIAM.application;


import com.example.MovieAppIAM.domaine.Client;

public interface IClientService {

    Client findByEmail(String email);
}
