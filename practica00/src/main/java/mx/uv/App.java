package mx.uv;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/xml", (request, response) -> {
            response.type("application/xml");
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><saludo>Hola Mundo</saludo>";
        });
    }
}
