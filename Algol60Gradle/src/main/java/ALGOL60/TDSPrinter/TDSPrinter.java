package ALGOL60.TDSPrinter;

import ALGOL60.TDS.*;

public class TDSPrinter {
    public int colwidth;
    public TDSPrinter(int colwidth){
        this.colwidth=colwidth;
    }
    public void printTable(SymbolTable symboltable){
            System.out.println(symboltable.getTypeTDS().toString()+"|"+symboltable.getRegionNumber()+"|"+symboltable.getNestingLevel());
        System.out.println("----------------------------------------------------------------------------");
            for(Symbol a:symboltable.getSymbols().values()){
                if(a instanceof VarSymbol) {
                    System.out.format("%-20s|%-20s|%-30s|%-20d|%-17s%n", a.getName(),a.getSymboltype().toString(),((VarSymbol) a).getTypevariable().toString(),a.getOffset(),a.getScope().toString());
                    continue;
                }
                if(a instanceof LabelSymbol){
                    System.out.format("%-20s|%-20s|%-30s|%-20d|%-17s%n", a.getName(),a.getSymboltype().toString(),"None",a.getOffset(),a.getScope().toString());

                }
                if(a instanceof ProcSymbol){
                    //nombre de paramètre manquant
                    System.out.format("%-20s|%-20s|%-30s|%-20d|%-17s%n", a.getName(),a.getSymboltype().toString(),((ProcSymbol) a).getReturnType().toString()+"",a.getOffset(),a.getScope().toString());

                    continue;
                }
                if(a instanceof ProcedureParameterSymbol){
                    System.out.format("%-20s|%-20s|%-30s|%-20d|%-17s%n", a.getName(),a.getSymboltype().toString(),((ProcedureParameterSymbol) a).getType().toString(),a.getOffset(),a.getScope().toString());

                }
                if(a instanceof SwitchSymbol){

                    String format_possible ="" ;
                    for(String s : ((SwitchSymbol) a).getPossibleValues()){
                        format_possible = format_possible + "|"+s;
                    }
                    format_possible=format_possible+"";
                    System.out.format("%-20s|%-20s|%-30s|%-20d|%-17s%-30s%n", a.getName(),a.getSymboltype().toString(),"None",a.getOffset(),a.getScope().toString(),format_possible);

                    continue;

                }
                if(a instanceof ArraySymbol){
                    System.out.format("%-20s|%-20s|%-30s|%-20d|%-17s%n", a.getName(),((ArraySymbol) a).boundsString(),"of "+((ArraySymbol) a).getArrayType().toString(),a.getOffset(),a.getScope().toString());

                    continue;
                }

            }
    }
}
