package fiap.tds.resources;

import fiap.tds.exceptions.ErroPrevisaoException;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Path("/previsao")
public class PrevisaoResource {
    private static final String API_KEY = "65cc237f5556a0cf56232b9584c821eb"; // Substitua com sua chave de API

    @GET
    @Path("/{cidade}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPrevisaoPorCidade(@PathParam("cidade") String cidade) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + cidade + "&appid=" + API_KEY + "&units=metric&lang=pt_br";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return Response.ok(response.body()).build();
            } else if (response.statusCode() == 404) {
                throw new ErroPrevisaoException("Cidade não encontrada");
            } else {
                throw new ErroPrevisaoException("Erro ao buscar previsão do tempo - Código de resposta: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            // Log do erro
            e.printStackTrace();
            throw new WebApplicationException("Erro interno ao buscar previsão do tempo", e);
        } catch (ErroPrevisaoException ex) {
            // Log do erro
            ex.printStackTrace();
            return Response.status(Response.Status.NOT_FOUND).entity(ex.getMessage()).build();
        }
    }
}