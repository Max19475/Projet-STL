package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_E_MCS {
LEX_MCS scanner;
  S_E_MCS() {
    }
  S_E_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle34() throws Exception {

    //declaration
    S_A_MCS x_2 = new S_A_MCS(scanner,att_eval) ;
    S_AFFX_MCS x_3 = new S_AFFX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_34(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_34(S_A_MCS x_2, S_AFFX_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","E -> A AFFX ;"});
}
  }
  public void analyser () throws Exception {
    regle34 () ;
  }
  }
