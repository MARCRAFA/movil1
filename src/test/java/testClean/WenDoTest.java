package testClean;

import activity.whendo.*;
import org.junit.Test;
import java.net.MalformedURLException;

public class WenDoTest {

    MainActivity mainActivity= new MainActivity();
    TaskActivity taskActivity= new TaskActivity();
    CalendarActivity calendarActivity = new CalendarActivity();
    HourActivity hourActivity = new HourActivity();
    ReminderActivity reminderActivity = new ReminderActivity();
    RepeatActivity repeatActivity = new RepeatActivity();

    ConfirmDeleteActivity confirmDeleteActivity = new ConfirmDeleteActivity();


    //////////////////////////////////   TEST CASE 1   /////////////////////////////////////
    //////////////////////////////////   CREATE TASK   /////////////////////////////////////

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String title="TAREA 1";

        mainActivity.addTaskButton.click();
        taskActivity.taskTitle.type(title);
        taskActivity.taskNotes.type("Esta tarea debe ser creada");
        taskActivity.taskReminder.click();
        taskActivity.setDate.click();
        calendarActivity.selectDate.click();
        calendarActivity.acceptDate.click();
        taskActivity.setHour.click();
        hourActivity.selectHour.click();
        hourActivity.selectMinute.click();
        hourActivity.acceptTime.click();
        taskActivity.addReminder.click();
        reminderActivity.setReminder.click();
        taskActivity.setFrequency.click();
        repeatActivity.setFrequency.click();

        taskActivity.saveTask.click();

    }


//////////////////////////////////   TEST CASE 2   /////////////////////////////////////
//////////////////////////////////   DELETE TASK   /////////////////////////////////////

    @Test
    public void verifyDeleteTask() throws MalformedURLException {
        String deleteTask="TAREA 2";

        mainActivity.addTaskButton.click();
        taskActivity.taskTitle.type(deleteTask);
        taskActivity.taskNotes.type("Esta tarea debe ser eliminada");
        taskActivity.saveTask.click();

        mainActivity.deleteTask.click();
        taskActivity.deleteTask.click();
        confirmDeleteActivity.deleteConfirm.click();

    }

}