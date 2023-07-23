package ru.netology.javaqa63;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TaskTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void shouldGetIdSimpleTask() {

        int expected = 5;
        int actual = simpleTask.getId();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetIdEpic() {

        int expected = 55;
        int actual = epic.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTitle() {

        String expected = "Позвонить родителям";
        String actual = simpleTask.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSubtasks() {

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetTopic() {

        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopic();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetProject() {

        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetStart() {

        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMatchesEpic() {
        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(actual,expected);

    }
    @Test
    public void testMatchesSimpleTask() {
        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertEquals(actual,expected);

    }

    @Test
    public void testMatchesProjectMeeting() {

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNoMatchMeeting() {
        boolean expected  = false;
        boolean actual = meeting.matches("Cон");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEpicNoMatch() {
        boolean expected  = false;
        boolean actual = epic.matches("Бессмыслица");
        Assertions.assertEquals(expected, actual);
    }
}


