package page_objects.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DropMenuComponent {
    public void setDropMenu(String menuName, String value){
        if (menuName.equals("state")){
            $("#state").click();
            $("#stateCity-wrapper").$(byText(value)).click();
        } else if (menuName.equals("city")) {
            $("#city").click();
            $("#stateCity-wrapper").$(byText(value)).click();
        }

    }
}
