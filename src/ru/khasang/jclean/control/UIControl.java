package ru.khasang.jclean.control;

import java.util.ArrayList;

public abstract class UIControl {

    public abstract void drawWindow(String windowName);

    public abstract void getSearchInfoFromUser();

    public abstract void show(ArrayList hexIdentical);
}
