/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fapla;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
/**
 *
 * @author borna
 */
public class main {
    public static void main(String[] args) {
        String fileName = "test/test.fapla";
        File file = new File(fileName);
        FileInputStream fis = null;
        try {
        fis = new FileInputStream(file);
        Fapla lexer = new Fapla(new ANTLRInputStream(fis));
        for (Token t : lexer.getAllTokens()) {
            System.out.println(lexer.tokenNames[t.getType()]+" : "+t.getText()+" : "+t.getText().length()
            );
        }
        fis.close();
        
        } catch (IOException e) {
                // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
