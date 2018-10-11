package com.ocprojekt.app.escalade.repository;

import com.ocprojekt.app.escalade.entities.Secteur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecteurRepository extends JpaRepository<Secteur,Integer> {

    @Query ("SELECT e FROM Secteur e WHERE e.nomSecteur LIKE :x" )
    public List<Secteur> chercheSecteur(@Param("x")String nom);

}