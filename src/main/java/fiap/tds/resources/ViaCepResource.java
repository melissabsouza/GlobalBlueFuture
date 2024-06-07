package fiap.tds.resources;


import fiap.tds.exceptions.CepNaoEncontradoException;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Path("/viacep")
public class ViaCepResource {

    @GET
    @Path("/{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public String buscarEnderecoPorCEP(@PathParam("cep") String cep) throws IOException, CepNaoEncontradoException {
        String urlStr = "https://viacep.com.br/ws/" + cep + "/json/";
        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
            throw new CepNaoEncontradoException();
        } else {
            throw new IOException("Erro ao buscar endereço - Código de resposta: " + responseCode);
        }
    }
    }

