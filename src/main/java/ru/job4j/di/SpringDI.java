package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.printInputText();
        System.out.println();

        StartUI ui2 = context.getBean(StartUI.class);
        ui2.add("Roman Romanov");
        ui2.add("Sergey Sergeev");
        ui2.print();
    }
}