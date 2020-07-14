package potapov.sergey.part4.HW18;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        if(args.length < 4) {
            System.out.println("в параметрах нужно указать:");
            System.out.println("имя входного файла");
            System.out.println("кодировку входного файла");
            System.out.println("имя выходного файла");
            System.out.println("кодировку выходного файла");
            return;
        }
        String filename1=args[0];
        String charset1=args[1];
        String filename2=args[2];
        String charset2=args[3];
        System.out.printf("%s %s %s %s", filename1, charset1, filename2, charset2);


        try (Reader in = new InputStreamReader(new FileInputStream("D:\\test\\src\\main\\java\\" + filename1 + ".txt"), charset1);
             Writer out = new OutputStreamWriter(new FileOutputStream("D:\\test\\src\\main\\java\\" + filename2 + ".txt"), charset2)) {

            char[] buf = new char[2048];

            while ((in.read(buf)) != -1) {
                out.write(buf);
            }


        } catch (UnsupportedEncodingException e) {
            System.out.println(" Format decoding/encoding is not supported ");
        } catch (IOException e) {
            System.out.println(" File input/output doesn`t found ");
        }


    }
}
