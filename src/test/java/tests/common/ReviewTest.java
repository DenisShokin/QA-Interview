package tests.common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.restassured.RestAssured.given;

public class ReviewTest {

    @Test
    public void first() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 60000L;
        Configuration.timeout = 20000L;

        Selenide.open("https://www.saucedemo.com/");
        $("[data-test='username']").val("standard_user");
        $("[data-test='password']").val("secret_sauce");
        $("[data-test='login-button']").click();
        $("[data-test='add-to-cart-sauce-labs-backpack']").click();
        $(".shopping_cart_link").click();
        $(".cart_list").find(".cart_item").find(".cart_quantity").getText().equals("1");
    }

    @Test
    public void second() {
        given()
                .log()
                .all()
                .baseUri("https://httpbin.org/")
                .get("/get")
                .then()
                .log().all()
                .statusCode(200);
    }
}
