package ALGOL60.main;

import ALGOL60.CodeGenerator.EnvironmentHandler;
import ALGOL60.CodeGenerator.FileBuilderHandler;
import ALGOL60.CodeGenerator.Generator;
import ALGOL60.TDS.SemanticAnalyser;
import ALGOL60.TDS.TreeParser;
import ALGOL60.grammar.Algol60Lexer;
import ALGOL60.grammar.Algol60Parser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static File sourcefile ;

    public static void main(String[] args) throws Exception {
        String src;
        String dest;


        if(args.length == 0){
            Scanner sc=new Scanner(System.in);
            System.out.println("Specify the path of the source file");
            src=sc.next();
        }else{
            src = args[0] + "";

        }



        File currentDirFile = new File("./"+ new File(src).getName().replaceAll(".al", ".src") );
        String helper = currentDirFile.getCanonicalPath();
        dest = helper;


        // dest="/home/walid/Bureau/User/Projet_PCL/ProjetAlgol60/PUSHINGPLACE/test.src";
        sourcefile = new File(src);
        Algol60Lexer lexer = new Algol60Lexer(new ANTLRFileStream(src, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Algol60Parser parser = new Algol60Parser(tokens, null);
        if(parser==null){
            System.out.println("faute parser null");
        }
        Tree program= parser.program().getTree();
        TreeParser adventurer=new TreeParser(program);
        adventurer.StartParser();
        SemanticAnalyser analyser=new SemanticAnalyser(program,adventurer.getTDSStack().getSemanticPath());
        analyser.startAnalysis();
        //Generation code
        FileBuilderHandler myBuilder=new FileBuilderHandler(dest);
        EnvironmentHandler envManager=new EnvironmentHandler(myBuilder);
        Generator gen=new Generator(myBuilder,envManager,program,adventurer.getTDSStack().getSemanticPath());
        gen.StartGeneration();
    }
}

