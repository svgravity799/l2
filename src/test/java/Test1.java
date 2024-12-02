import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Test1 {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void Formtest() {
        Configuration.holdBrowserOpen = true;
        open("https://www.fstravel.com");
$("[class=v-icon-user-14]").click();
$("[class=form__field]").setValue("testfsabonent@yandex.ru");
$("[id=password]").setValue("Abonent13!");
$("[type=submit]").click();
$("[class=arrival-country-field__pinput]").click();
        //$x("//div[text()='АОЭ']").click()
$(byText("Турция")).click();




    }


}
