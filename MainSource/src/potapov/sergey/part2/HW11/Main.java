package potapov.sergey.part2.HW11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String incString = reader.readLine();

        System.out.println(incString);
        System.out.println(StringModifier.stringModifier(incString));

        reader.close();
    }
}
