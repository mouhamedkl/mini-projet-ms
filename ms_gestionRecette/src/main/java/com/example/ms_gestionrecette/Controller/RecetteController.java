package com.example.ms_gestionrecette.Controller;

import com.example.ms_gestionrecette.Model.Category;
import com.example.ms_gestionrecette.Model.Cuisine;
import com.example.ms_gestionrecette.Model.Ingredient;
import com.example.ms_gestionrecette.Model.Recette;
import com.example.ms_gestionrecette.Service.RecetteService;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/recette")
public class RecetteController {

    @Autowired
    RecetteService recetteService;

    @GetMapping("/getAll")
    @ResponseStatus
    public List<Recette> getAllRecipes(){
        return recetteService.retrieveAllRecipes();
    }

}
