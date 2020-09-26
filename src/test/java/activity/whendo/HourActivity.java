package activity.whendo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class HourActivity {

    public Button selectHour;
    public Button selectMinute;
    public Button acceptTime;

    public HourActivity(){

        selectHour = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"2\"]"));
        selectMinute = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"30\"]"));
        acceptTime = new Button(By.id("android:id/button1"));

    }
}
