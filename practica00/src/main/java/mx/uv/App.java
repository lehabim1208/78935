package mx.uv;
import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {
        //CORS
        //fuente:https://gist.github.com/saeidzebardast/e375b7d17be3e0f4dddf
        options("/*",(request,response)->{
        String accessControlRequestHeaders=request.headers("Access-Control-Request-Headers");
        if(accessControlRequestHeaders!=null){
        response.header("Access-Control-Allow-Headers",accessControlRequestHeaders);
        }
        String accessControlRequestMethod=request.headers("Access-Control-Request-Method");
        if(accessControlRequestMethod!=null){
        response.header("Access-Control-Allow-Methods",accessControlRequestMethod);
        }
        return "OK";
        });
        before((request,response)->response.header("Access-Control-Allow-Origin","*"));


        get("/xml", (request, response) -> {
                    response.type("application/xml");
                    return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><saludo>Hola Mundo</saludo>";
                });
    }
}
