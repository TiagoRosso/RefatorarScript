package utilitarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leitorTXT {
    public String arquivoTXT;
    private String patch;
    private BufferedReader bufferAquivo;
    private FileReader arquivoLeitura;

    public leitorTXT(String patch) {
        this.patch = patch;
    }

    private void criaStream(){
        try {
            arquivoLeitura = new FileReader(patch);
        } catch (FileNotFoundException e) {
            System.err.printf("Erro ler arquivo");
        }
        bufferAquivo = new BufferedReader(arquivoLeitura);
    }

    private void leTXT() throws IOException {
        arquivoTXT = bufferAquivo.readLine();
        while (arquivoTXT != null){
            arquivoTXT = bufferAquivo.readLine();
        }

    }
}
