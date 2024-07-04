package graphWalker;

import org.junit.BeforeClass;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class RestAssuradTest {

	private static String baseURI;
	private static String basePath;
	private static String port;
	
	@BeforeClass
	public static void prepare() {
		port = "8080";
		baseURI = "https://localhost:"+port;
		basePath = baseURI + "/patientvaccines";
	}
	
	public void consultarVacinaFound() {
		given().
		when().
		get(basePath+"/filter").
		then().
		statusCode(200);
	}
	
	public void consultarVacinaNotFound() {
		given().
		when().
		get(basePath+"/filter").
		then().
		statusCode(204);
	}
	
	public void deletarVacinaSucesso() {
		given().
		when().
		delete(basePath+"/{code}").
		then().
		statusCode(200).
		body(is(true));
	}
	
	public void deletarVacinaErro() {
		given().
		when().
		delete(basePath+"/{code}").
		then().
		statusCode(400);
	}
	
	public void atualizarVacinaSucesso() {
		given().
		when().
		put(basePath+"/{code}").
		then().
		statusCode(200).
		body(is(not(nullValue())));
	}
	
	public void atualizarVacinaErro() {
		given().
		when().
		put(basePath+"/{code}").
		then().
		statusCode(400).
		body(is("Patient vaccine not updated."));
	}
	
	public void criarVacinaSucesso() {
		given().
		when().
		post(basePath+"").
		then().
		statusCode(201).
		body(is(not(nullValue())));
	}
	
	public void criarVacinaErro() {
		given().
		when().
		post(basePath+"").
		then().
		statusCode(400);
	}
	
}
