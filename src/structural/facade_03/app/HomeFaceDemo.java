package structural.facade_03.app;

import structural.facade_03.Facade.HomeTheaterFacade;

public class HomeFaceDemo {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("Incpetion");
        homeTheaterFacade.stopMovie();
    }
}
