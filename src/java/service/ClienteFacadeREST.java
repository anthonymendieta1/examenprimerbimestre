/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Cliente;

/**
 *
 * @author Anthony Mendieta
 */
@Stateless
@Path("modelo.cliente")
public class ClienteFacadeREST extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "PruebaPU")
    private EntityManager em;

    public ClienteFacadeREST() {
        super(Cliente.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Cliente entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Cliente entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Cliente find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> findAll() {
        return super.findAll();
    }
     @POST
    @Path("crear")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     public String crear (@FormParam ("idCliente") int idCliente, @FormParam ("nombre") String nombre, @FormParam ("apellido") String apellido, @FormParam ("cedula") String cedula, @FormParam ("direccion") String direccion, @FormParam ("edad") String edad, @FormParam ("provincia") String provincia, @FormParam ("vehiculoCompro") String vehiculoCompro){
      Cliente cr = super.find(idCliente);
      cr.setNombre(nombre);
      cr.setApellido(apellido);
      cr.setCedula(cedula);
      cr.setDireccion(direccion);
      cr.setEdad(edad);
      cr.setProvincia(provincia);
      super.edit(cr);
      return"se actualizo";
     }
      @POST
    @Path("editar")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     public String editar (@FormParam ("idCliente") int idCliente, @FormParam ("nombre") String nombre, @FormParam ("apellido") String apellido, @FormParam ("cedula") String cedula, @FormParam ("direccion") String direccion, @FormParam ("edad") String edad, @FormParam ("provincia") String provincia, @FormParam ("vehiculoCompro") String vehiculoCompro){
     Cliente ed = super.find(idCliente);
     ed.setNombre(nombre);
     ed.setApellido(apellido);
     ed.setCedula(cedula);
     ed.setDireccion(direccion);
     ed.setEdad(edad);
     ed.setProvincia(provincia);
     super.edit(ed);
     return"se edito con normalidad";
     }
     
      
    
        
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }
    
    
    

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
