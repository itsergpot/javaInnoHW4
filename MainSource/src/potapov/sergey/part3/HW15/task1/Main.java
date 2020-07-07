package potapov.sergey.part3.HW15.task1;

public class Main {
    public static void main(String[] args) {
        FileActions.createFile("C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part3\\HW15\\task1", "hello.txt");
        FileActions.deleteFile("C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part3\\HW15\\task1", "hello.txt");
        FileActions.renameFile("C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part3\\HW15\\task1", "newname.txt", "goodbye.txt");
        FileActions.moveFile("C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part3\\HW15\\task1","goodbye.txt",
                "C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource\\src\\potapov\\sergey\\part3\\HW14");
    }
}
