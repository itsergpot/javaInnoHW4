package potapov.sergey.part3.HW15.task2;

import java.io.File;

public class RecursiveCrawlFilesWithDepthMeasure {

    public static void recursiveCrawlFilesWithDepthMeasure(File root, int depth) {
        File[] files = root.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    for (int i = 0; i < depth; i++) {
                        System.out.print("_");
                    }
                    System.out.print(file.getName());
                    System.out.println();
                    recursiveCrawlFilesWithDepthMeasure(file, depth + 1);
                } else {
                    for (int i = 0; i < depth; i++) {
                        System.out.print("_");
                    }
                    System.out.print(file.getName());
                    System.out.println();
                }
            }
        }
    }

}
