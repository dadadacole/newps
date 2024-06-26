package org.scoula.lib.cli;


import org.scoula.lib.cli.command.Command;
import org.scoula.lib.cli.command.ExitCommand;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;


import java.awt.*;

public abstract class App {
    Menu menu;

    public App(){

    }

    public void init(){
        menu = new Menu();
        createMenu(menu);
        menu.add(new org.scoula.lib.cli.ui.MenuItem("종료", new ExitCommand()));
    }

    public void createMenu(Menu menu){

    }

    public void run(){
        init();
        while(true){
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }
}
