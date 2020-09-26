package activity.whendo;

import org.openqa.selenium.By;
import appiumControl.Button;

public class ConfirmDeleteActivity {

    public Button deleteConfirm;

    public ConfirmDeleteActivity(){

        deleteConfirm = new Button(By.id("android:id/button1"));
    }

}
