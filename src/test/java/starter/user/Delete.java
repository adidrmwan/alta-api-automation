package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://reqres.in/api/";

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoins() {
        return url + "users/2";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setDeleteApiEndpoins());
    }
    @Step("I receive valid HTTP response code 204")
    public void validateHttpResponse204(){
        restAssuredThat(response -> response.statusCode(204));
    }
}
