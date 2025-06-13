package com.diksha.filemanager;
import java.util.Scanner;
public class TextBasedInterface implements UserInterface {
     private UIEventHandler handler=null;
    @Override
    public void start() {
        System.out.println("File Manager Menu");
        System.out.println("1. List Files");
        System.out.println("2.Create a directory");
        System.out.println("3. Delete a file or directory");
        System.out.println("4. Exit Program");
        System.out.println("Enter your choice");
        Scanner in = new Scanner(System.in);
        while (true) {
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter directory path");
                    handler.onList(in.next());
                    break;
                case 2:
                    System.out.println("Enter new  directory path");
                    handler.onCreate(in.nextLine());
                    break;
                case 3:
                    System.out.println("Delete directory path");
                    handler.onDelete(in.nextLine());
                    break;
                case 4:
                    System.out.println("Exiting.....");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }

    @Override
    public void subscribe(UIEventHandler handler) {
        if(this.handler==null) {
            this.handler = handler;
        }
    }

    @Override
    public void display(String message) {
        System.out.println(message);

    }
}
