package activity.whendo;

import appiumControl.RadioButton;
import org.openqa.selenium.By;

public class ReminderActivity {
    public RadioButton setReminder;
    public ReminderActivity(){
        setReminder = new RadioButton(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RadioButton[6]"));

    }

}
