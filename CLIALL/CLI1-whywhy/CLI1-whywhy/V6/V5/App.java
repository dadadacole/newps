package CLI.V6.V5;

import CLI.V4.command.*;
import CLI.V4.ui.Menu;
import CLI.V4.ui.MenuItem;


public abstract class App {
    Menu menu;

    public App() {
    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("Terminate", new ExitCommand()));
    }

    public void createMenu(Menu menu) {

    }

    public void run() {
        init();
        while(true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }
}
