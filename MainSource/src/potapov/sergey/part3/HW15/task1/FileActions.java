package potapov.sergey.part3.HW15.task1;

import java.io.File;
import java.io.IOException;

public class FileActions {
    public static void createFile(String filePath, String fileName) {

        File dir = new File(filePath + "\\" + fileName);
        try {
            boolean createdFile = dir.createNewFile();
            if (createdFile) {
                System.out.println("Файл создан");
            }
        } catch (IOException ex) {
            System.out.println("Не удалось создать файл");
        }

    }

    public static void deleteFile(String filePath, String fileName) {

        File file = new File(filePath + "\\" + fileName);
        boolean deletedFile = file.delete();
        if (deletedFile) {
            System.out.println("Файл удален");
        } else {
            System.out.println("Не удалось удалить файл");
        }

    }

    public static void renameFile(String filePath, String fileName, String newName){
        File file = new File(filePath + "\\" + fileName);
        File newFile = new File(filePath + "\\" + newName);
        if (file.renameTo(newFile)){
            System.out.println("Файл переименован");
        } else {
            System.out.println("Не удалось переименовать файл");
        }
    }

    public static void moveFile(String filePath, String fileName, String destinationPath){
        File file = new File(filePath + "\\" + fileName);
        File newFile = new File(destinationPath + "\\" + fileName);
        if (file.renameTo(newFile)){
            System.out.println("Файл перемещен");
        } else {
            System.out.println("Не удалось переместить файл");
        }
    }
}
