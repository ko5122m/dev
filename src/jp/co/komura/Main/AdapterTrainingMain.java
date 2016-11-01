package jp.co.komura.Main;

import java.io.IOException;

import jp.co.komura.AdapterTraining.FileProperties;
import jp.co.komura.AdapterTraining.IF.FileIO;

public class AdapterTrainingMain {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("./file/adapterTraining/file.txt");
            System.out.println(f.getValue("year"));

            f.setValue("year", "2016");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("./file/adapterTraining/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
