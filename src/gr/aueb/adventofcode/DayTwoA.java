package gr.aueb.adventofcode;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class DayTwoA {
    public static void main(String[] args) {
        File f = new File("C:/Users/jkentro/OneDrive/CF7-all-projects/IdeaProjects/Testbed/TextDay2.txt");
        String line;
        String[] tokens;
        int counter = 0;
        boolean report = false;

        try  {
            Scanner in = new Scanner(f);
            while (in.hasNextLine() && in.nextLine() != null) {
                line = in.nextLine();
                tokens = line.split("\\s");
                for (int i=0; i < (tokens.length-1); i++) {

                    System.out.println(Integer.parseInt(tokens[i+1]));

                    if ((Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i+1])) <=3) {
                        report = true;
                    } else {
                        report = false;
                        continue;
                    }

//                    if ((Integer.parseInt(tokens[i+1]) - Integer.parseInt(tokens[i])) <=3) {
//                        report = true;
//                    } else {
//                        report = false;
//                        continue;
//                    }
                }
                if (true) counter++;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
