package G37.CesarTorres.Interface;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import G37.CesarTorres.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author cesartbossa
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
