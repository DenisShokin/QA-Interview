package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import model.ui.TableModel;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage {

    private final SelenideElement header = $(".main-header");
    private final SelenideElement addBtn = $("#addNewRecordButton");
    private final SelenideElement table = $(".rt-tbody");

    public WebTablesPage checkThatPageLoad() {
        header.shouldHave(Condition.text("Web Tables"));
        return this;
    }

    public WebTablesPage addRow() {
        addBtn.click();
        return this;
    }

    public void findRow(TableModel row) {
        //TODO: need to realized

    }

    private ElementsCollection getRows() {
        return table.findAll(".rt-tr-group");
    }
}
