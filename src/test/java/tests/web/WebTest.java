package tests.web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import model.ui.TableModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.WebTablesPage;

public class WebTest {

    private WebTablesPage tablesPage = new WebTablesPage();
    private final TableModel row = new TableModel("Cierra", "Vega");

    @BeforeEach
    void initBrowser() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 60000L;
        Configuration.timeout = 20000L;
    }

    @AfterEach
    void closeBrowser() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }

    @Test
    void findRowTable() {
        Selenide.open("https://demoqa.com/webtables");
        tablesPage.checkThatPageLoad()
                .findRow(row);
    }

}
