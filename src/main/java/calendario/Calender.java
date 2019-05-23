package calendario;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.calendarfx.model.Calendar;
//import com.calendarfx.model.CalendarEvent;
//import com.calendarfx.view.ButtonBar;
import com.calendarfx.model.CalendarSource;
import com.calendarfx.view.CalendarView;
import com.calendarfx.model.Calendar.Style;
import javafx.application.Platform;
import javafx.scene.Scene;
import java.time.LocalDate;
import java.time.LocalTime;

public class Calender extends Application {

	
	@Override
    public void start(Stage stage) throws Exception {
        CalendarView calendarView = new CalendarView();

        Calendar birthdays = new Calendar("Birthdays");
        Calendar holidays = new Calendar("Holidays");

        birthdays.setShortName("B");
        holidays.setShortName("H");


        birthdays.setStyle(Style.STYLE2);
        holidays.setStyle(Style.STYLE4);

        CalendarSource familyCalendarSource = new CalendarSource("Family");
        familyCalendarSource.getCalendars().addAll(birthdays, holidays);

        calendarView.getCalendarSources().setAll(familyCalendarSource);
        calendarView.setRequestedTime(LocalTime.now());

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(calendarView); // introPane);

        Thread updateTimeThread = new Thread("Calendar: Update Time Thread") {
            @Override
            public void run() {
                while (true) {
                    Platform.runLater(() -> {
                        calendarView.setToday(LocalDate.now());
                        calendarView.setTime(LocalTime.now());
                    });

                    try {
                        // update every 10 seconds
                        sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        updateTimeThread.setPriority(Thread.MIN_PRIORITY);
        updateTimeThread.setDaemon(true);
        updateTimeThread.start();

        Scene scene = new Scene(stackPane);
        stage.setTitle("Calendario");
        stage.setScene(scene);
        stage.setWidth(1024);
        stage.setHeight(720);
        stage.centerOnScreen();
        stage.show();
    }

}
