package Classes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class GerenciarArquivos {

    //Salvar Pessoas
    public void salvar(GerenciadorDeEstoque GE, GerenciadorDeFinancas GF, GerenciadorDePessoas GP) throws IOException {
        //Gerenciador De Estoque
        String name = "../POO-2017.1-Git/Saves/";
        File f = new File(name);
        if (!f.exists()) {
            f.mkdirs();
        }
        ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(name + "GerenciadorDeEstoque.dat")));
        objectOut.writeObject(GE);
        objectOut.close();

        //Gerenciador De Financas
        name = "../POO-2017.1-Git/Saves/";
        f = new File(name);
        if (!f.exists()) {
            f.mkdirs();
        }
        objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(name + "GerenciadorDeFinancas.dat")));
        objectOut.writeObject(GF);
        objectOut.close();

        //Gerenciador De Pessoas
        name = "../POO-2017.1-Git/Saves/";
        f = new File(name);
        if (!f.exists()) {
            f.mkdirs();
        }
        objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(name + "GerenciadorDePessoas.dat")));
        objectOut.writeObject(GP);
        objectOut.close();
    }

    public void recuperar(SistemaLojaMusical sys) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Gerenciador de Estoque
        String path = "../POO-2017.1-Git/Saves/";
        File f = new File(path);
        if (!f.exists()) {
            throw new FileNotFoundException("Diretórios não encontrados: " + path);
        }

        ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path + "GerenciadorDeEstoque.dat")));
        GerenciadorDeEstoque recE = (GerenciadorDeEstoque) objectIn.readObject();
        objectIn.close();
        sys.setGerenciadorDeEstoque(recE);
        
        //Gerenciador de Finanças
        path = "../POO-2017.1-Git/Saves/";
        f = new File(path);
        if (!f.exists()) {
            throw new FileNotFoundException("Diretórios não encontrados: " + path);
        }

        objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path + "GerenciadorDeFinancas.dat")));
        GerenciadorDeFinancas recF = (GerenciadorDeFinancas) objectIn.readObject();
        objectIn.close();
        sys.setGerenciadorDeFinancas(recF);
        
        //Gerenciador de Pessoas
        path = "../POO-2017.1-Git/Saves/";
        f = new File(path);
        if (!f.exists()) {
            throw new FileNotFoundException("Diretórios não encontrados: " + path);
        }

        objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path + "GerenciadorDePessoas.dat")));
        GerenciadorDePessoas recP = (GerenciadorDePessoas) objectIn.readObject();
        objectIn.close();
        sys.setGerenciadorDePessoas(recP);
        
    }
}