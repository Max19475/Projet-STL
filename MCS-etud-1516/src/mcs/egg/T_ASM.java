package mcs.egg;
import mg.egg.eggc.runtime.libjava.EGGException;
public class T_ASM {
  LEX_ASM att_scanner;
  String att_txt;
  LEX_ASM scanner;
  private String txt;
  public String getTxt(){return txt;}
  public T_ASM(LEX_ASM scanner ) {
    this.scanner = scanner ;
    this.att_scanner = scanner ;
    }
  public void analyser(int t) throws EGGException {
    scanner.lit ( 1 ) ;
    txt = scanner.fenetre[0].getNom() ;
    att_txt = txt ;
    scanner.accepter_sucre ( t ) ;
    }
    }
