package com.diksha.filemanager;

import java.io.File;

public class FileManager {
    public void listContents(String directoryPath){
        File directory=new File(directoryPath);
        if(directory.exists() && directory.isDirectory()){
            File[] contents=directory.listFiles();
            if(contents!=null){
                for (File file : contents) {
                    if(file.isDirectory()){
                        System.out.println("Directory: "+file.getName());
                    }else{
                        System.out.println("File: "+file.getName());
                    }
                }
            }else{
                System.out.println("Directory does not exist");
            }
        }else {
            System.out.println("Invalid directory path:Path either doesn't exist or is not a directory");
        }
    }
    public void createDirectory(String directoryPath){
        File directory=new File(directoryPath);
        if(directory.mkdir()){
            System.out.println("Directory created");
        } else{
            System.out.println("Failed to create directory");
        }
    }
    public void deleteFileOrDirectory(String directoryPath){
        File file=new File(directoryPath);
        if(file.exists()){
            System.out.println("File/Directory not found ");
        }
        if(deleteRecusively(file)){
            System.out.println("File deleted");

        }else{
            System.out.println("Failed to delete file");
        }

    }
    private boolean deleteRecusively(File file){
        if(file.isDirectory()){
            File[] contents=file.listFiles();
            if(contents!=null){
                for (File f: contents) {
                    deleteRecusively(f);
                }
            }
        }
        return file.delete();
    }
}
