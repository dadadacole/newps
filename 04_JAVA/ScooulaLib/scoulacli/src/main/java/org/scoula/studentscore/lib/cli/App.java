package org.scoula.studentscore.lib.cli;

import org.scoula.studentscore.lib.cli.command.Command;
import org.scoula.studentscore.lib.cli.command.ExitCommand;
import org.scoula.studentscore.lib.cli.ui.MenuItem;
import org.scoula.studentscore.lib.cli.ui.Menu;

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
