/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_3;

/**
 *
 * @author Nelson
 */
public class MaquinaInferencia {
    
    BaseConhecimento baseConhecimento;
   
    
   

    public MaquinaInferencia() {
    }
    
    public double consulta(int perg, double cb_resp1, double cb_resp2, double cb_resp3){
        baseConhecimento = new BaseConhecimento();
        switch (perg) {
            case 0:
                    return baseConhecimento.Regra0(cb_resp1);
            case 1:
                
                    return baseConhecimento.Regra1(cb_resp1);
            case 2:
                    return baseConhecimento.Regra2(cb_resp1);
                
            case 3:
                    return baseConhecimento.Regra3(cb_resp1);
                
            case 4:
                 return baseConhecimento.Regra4(cb_resp1, cb_resp2);//1,1
               
            case 5:
                 return baseConhecimento.Regra5(cb_resp1, cb_resp2, cb_resp3);
                   
                
            case 6:
                    return baseConhecimento.Regra6(cb_resp1);
            case 7:
                
                    return baseConhecimento.Regra7(cb_resp1,cb_resp2);
                
            case 8:
                    return baseConhecimento.Regra8(cb_resp1);
            case 9:
                    return baseConhecimento.Regra9(cb_resp1,cb_resp2);
            case 10:
                    return baseConhecimento.Regra10(cb_resp1);
            default:
                break;
        }
         
        return 0;
    }
  

}
