package G37.CesarTorres.Repositorio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import G37.CesarTorres.Modelo.Categoria;
import G37.CesarTorres.Interface.InterfaceCategoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesartbossa
 */

@Repository
public class RepositorioCategoria {
    @Autowired
    private InterfaceCategoria crud1;
    public List<Categoria> getAll(){
        return (List<Categoria>) crud1.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return crud1.findById(id);
    }

    public Categoria save(Categoria Categoria){
        return crud1.save(Categoria);
    }
    public void delete(Categoria Categoria){
       crud1.delete(Categoria);
    }
}
