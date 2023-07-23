package ru.netology.javaqa63;

public class SimpleTask extends Task {
    protected String title;//название

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {

        return title;
    }

    //все выше скопировано с дз

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}