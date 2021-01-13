package view;

import model.Image;

public interface ImageDisplay {
    
    void display(Image image);
    Image image();
    void on(Shift shift);
    
    interface Shift {
        Image left();
        Image rigth();
    }
}