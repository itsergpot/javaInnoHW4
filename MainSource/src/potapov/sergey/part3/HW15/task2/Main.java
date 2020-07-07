package potapov.sergey.part3.HW15.task2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\itser\\IdeaProjects\\javaInnoHW4\\MainSource");
        RecursiveCrawlFilesWithDepthMeasure.recursiveCrawlFilesWithDepthMeasure(directory, 0);
    }
}
