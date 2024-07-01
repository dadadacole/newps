package CLI.V6.V5.ui;

import CLI.V4.Input;
import CLI.V4.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menus;

    public Menu(){
        menus = new ArrayList<>();
    }

    public void add(MenuItem item){
        menus.add(item);
    }


    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("%d.%s | ", i+1, menus.get(i).getTitle());
        }
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
    }
    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
        return menus.get(selectNo-1).getCommand();
    }
}
