import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
$(byText("Турция")).click();
      $("[class=calendar-popup__body_month-header-arrow-right]").click();  //Промотка календаря
      $("[class=calendar-popup__body_month-header-arrow-right]").click();
      $("[class=calendar-popup__body_month-header-arrow-right]").click();
      $("[class=calendar-popup__body_month-header-arrow-right]").click();
      $("[class=calendar-popup__body_month-header-arrow-right]").click();
      $("[class=calendar-popup__body_month-header-arrow-right]").click();
$(byText("12")).click();  //выбордаты
$(byText("12")).click();
$(byText("2")).click();  //выбор количества ночей
$(byText("2")).click();
      $("[data-testid=tours_searchblock_field_tourists_popup_Adminus]").click();  //уменьшение количества туристов
      $("[data-testid=tours_searchblock_search_btn]").click();  //выполнение поиска
        // WebDriver driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      $("[class=popmechanic-close]").click(); // Закрытие всплывающего баннера
      $("[class=search-resort-checkbox__top_label-arrow]").click(); // Выбор фильтра алания
      $(byText("Kleopatra Aytur Suit Hotel")).click();
    //  $("[alt=Saphir Hotel & Villas]").click();
      $("[class=hotelFilters-charter filter]").click();
      $("[class=offer-addToCartBtn-txt]").click();
      $("[class=popmechanic-close]").click();



    }


}
