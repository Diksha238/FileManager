package com.diksha.filemanager;

public interface UserInterface {
    public void start();
    public void subscribe(UIEventHandler handler);
    public void display(String message);
}
