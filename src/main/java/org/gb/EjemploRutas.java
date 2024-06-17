package org.gb;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;

//Path principal
@Path("/hello")
public class EjemploRutas {
    //Creamos una variable en el properties llamada greeting
    //en esta la mandamos a llamar con configProperty
    @ConfigProperty(name="greeting")
    private String greeting;

    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces(MediaType.TEXT_PLAIN)
    //Esto es en el path hello y devuelve un hello restEasy
    public String hello () {return "hola Joel";}

    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces(MediaType.TEXT_PLAIN)
    /*En esta parte agregamos un path diferente 
    haciendo referencia a un metodo llamado main*/
    @jakarta.ws.rs.Path("custom/{name}")    
    //Generemaos un metodo custom hello en el cual agregamos la variable
    public String customhello(@PathParam("name") String name ){
        return  greeting+" "+ name +" ¿como te olllll?";
    }
    
}
