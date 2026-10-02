package ru.mirea.lab3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("===== MovablePoint =====");
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("До:    " + p);
        p.moveRight();
        p.moveDown();
        System.out.println("После: " + p);

        System.out.println("\n===== MovableCircle =====");
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("До:    " + c);
        c.moveUp();
        c.moveLeft();
        System.out.println("После: " + c);

        System.out.println("\n===== MovableRectangle =====");
        MovableRectangle r = new MovableRectangle(0, 0, 10, 10, 2, 2);
        System.out.println("До:    " + r);
        System.out.println("Скорости одинаковы? " + r.isSameSpeed());
        r.moveRight();
        r.moveUp();
        System.out.println("После: " + r);

        System.out.println("\n===== MovableRectangle с разными скоростями =====");
        MovableRectangle r2 = new MovableRectangle(0, 0, 10, 10, 2, 5);
        System.out.println("Скорости одинаковы? " + r2.isSameSpeed());
    }
}
