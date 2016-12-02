package fapla;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

/**
 * A simple demo to show AST GUI with ANTLR
 * @see http://www.antlr.org/api/Java/org/antlr/v4/runtime/tree/gui/TreeViewer.html
 * 
 * @author wangdq
 * 2014-5-24
 *
 */
public class Test {
    public static void main(String[] args) {
        //prepare token stream
        String fileName = "test/test.fapla";
        File file = new File(fileName);
        FileInputStream fis = null;
        try {
        fis = new FileInputStream(file);
        CharStream stream = new ANTLRInputStream(fis);
        
        FaplaLexer lexer  = new FaplaLexer(stream);   
        TokenStream tokenStream = new CommonTokenStream(lexer);
        FaplaParser parser = new FaplaParser(tokenStream);
        ParseTree tree = parser.startState(); 

        //show AST in console
        System.out.println(tree.toStringTree(parser));
        
        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel container = new JPanel();
        JScrollPane scrollPane = new JScrollPane(container);
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        container.add(viewr);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        } catch (IOException e) {
                // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}