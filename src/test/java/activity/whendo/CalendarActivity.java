package activity.whendo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class CalendarActivity{

    public Button selectDate;
    public Button acceptDate;

    public CalendarActivity(){

        selectDate = new Button(By.xpath("//android.view.View[@content-desc=\"26 septiembre 2020\"]"));
        acceptDate = new Button(By.id("android:id/button1"));

    }

}
