package activity.whendo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addTaskButton;
    public Button searchTask;
    public Button deleteTask;

    public MainActivity(){
        /* test case 1 */
        addTaskButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        /* test case 2 */
        deleteTask= new Button(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

    }

}
