package fiap.tds.resources;

import fiap.tds.models.Empresa;
import fiap.tds.repositories.EmpresaRepository;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("cadastros")
public class EmpresaResource {
    private final EmpresaRepository EmpresaRepository;

    public EmpresaResource(){
        EmpresaRepository = new EmpresaRepository();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empresa> getEmpresas(){
        return EmpresaRepository.getAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Empresa getEmpresa(@PathParam("id") int idEmpresa){
        return EmpresaRepository.getById(idEmpresa).orElse(null);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addEmpresa(Empresa empresa){
        EmpresaRepository.add(empresa);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateEmpresa(@PathParam("id") int idEmpresa, Empresa produto){
        EmpresaRepository.update(idEmpresa, produto);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteProduto(@PathParam("id") int idEmpresa){
        EmpresaRepository.delete(idEmpresa);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}

