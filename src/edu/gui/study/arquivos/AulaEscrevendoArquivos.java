package edu.gui.study.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AulaEscrevendoArquivos {

    public static void main(String [] args) throws IOException {

        String[] lines = new String[] {"Bom dia", "Boa tarde", "boa noite"};

        String path = "c:\\teste\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
