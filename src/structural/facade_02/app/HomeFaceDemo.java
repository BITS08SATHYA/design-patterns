package structural.facade_02.app;

import structural.facade_02.Facade.HomeTheaterFacade;

public class HomeFaceDemo {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("Incpetion");
        homeTheaterFacade.stopMovie();
    }
}
