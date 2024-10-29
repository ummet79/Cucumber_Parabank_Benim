package StepDefinitions;

import Pages.LeftNav;
import Pages._01_DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _00_Datatable {
    LeftNav ln=new LeftNav();
    _01_DialogContent dc=new _01_DialogContent();


    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler ) {

        List<String> linler=dtLinkler.asList();

        for (int i = 0; i < linler.size(); i++) {
            ln.myClick(ln.getWebElement(linler.get(i)));
        }
    }

    @And("User sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dtkutuveYazilar) {
        List<List<String>> kutuveYazilar=dtkutuveYazilar.asLists();

        for (int i = 0; i < kutuveYazilar.size(); i++) {
            WebElement kutu=dc.getWebElement(kutuveYazilar.get(i).get(0));
            ln.mySendKeys(kutu,kutuveYazilar.get(i).get(1));

        }

    }

    @And("Click on the DialogContent")
    public void clickOnTheDialogContent(DataTable dtButton) {
        List<String> butonlar=dtButton.asList();

        for (int i = 0; i < butonlar.size(); i++) {
            ln.myClick(dc.getWebElement(butonlar.get(i)));



        }
    }
}
