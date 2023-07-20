package Controller;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.json.tree.JsonArray;


@Controller("/hello")
public class DemoController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index()
    {
        return "Hello world !";
    }
}
