import java.io.File;

public class Ex17_ClassFile{

    public static void main(String[] args) {
        
        File arquivo = new File("F:\\mjailton\\javaSe\\Arquivos e Fluxo de Dados\\ExemploClasseFile.txt");
        System.out.println("Nome do arquivo: " + arquivo.getName());
        System.out.println("Caminho do arquivo: " + arquivo.getAbsolutePath());
        System.out.println("O arquivo existe ? : " + arquivo.exists());
        

    }
}