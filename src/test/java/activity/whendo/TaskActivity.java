package activity.whendo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class TaskActivity {

    public TextBox taskTitle;
    public TextBox taskNotes;
    public Button taskReminder;
    public Button setDate;
    public Button setHour;
    public Button addReminder;
    public Button setFrequency;


    public Button saveTask;
    public Button deleteTask;

    public TaskActivity(){
        taskTitle = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        taskNotes = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));

        taskReminder = new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder"));
        setDate = new Button(By.id("com.vrproductiveapps.whendo:id/due_date"));
        setHour = new Button(By.id("com.vrproductiveapps.whendo:id/time"));
        addReminder = new Button(By.id("com.vrproductiveapps.whendo:id/reminder"));
        setFrequency = new Button(By.id("com.vrproductiveapps.whendo:id/repeat"));


        saveTask = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        deleteTask = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    }

}
