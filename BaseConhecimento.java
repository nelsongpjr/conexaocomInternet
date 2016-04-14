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
public class BaseConhecimento {
    
    
    public BaseConhecimento() {
    }

    
     public double Regra0 (double Internet){
       
       if (Internet == 1){
           return 1;
       }
        return 0;
    }
    public double Regra1 (double Cabo){

        if (Cabo == 1){
           return 1;
       }
        return 0;
    }
    
    public double Regra2 (double Conectividade){
        if(Conectividade == 1){
            return 1;
        }
        return 0;
    }
    
    public double Regra3 (double Erro){
        if(Erro == 1){
            return 1;
        }
        return 0;
    }
    
    
    public double Regra4(double AcessoNegado, double Proxy){
        if (AcessoNegado == 1 && Proxy == 1 ){//chrome
            return 1;
        }else if(AcessoNegado == 1 && Proxy == 0 ){
            return 2;
        }
       
        return 0;
    }
    
    public double Regra5(double acessoNegado, double proxy, double Navegador){
        if (acessoNegado == 1 && proxy == 0 && Navegador == 1){//chrome
            return 1;
        }else if (acessoNegado == 1 && proxy == 0 && Navegador == 2){//Firefox
            return 2;
        }else if (acessoNegado == 1 && proxy == 0 && Navegador == 0){//Outros
            return 3;
        }
        return 0;
    }
    
    public double Regra6(double Site){
        if(Site == 1){
            return 1;
        }
        return 0;
    }
    
    public double Regra7(double ProblemaIP, double Ip){
        if (ProblemaIP == 1 && Ip == 1){
            return 1;
        }
        if (ProblemaIP == 1 && Ip == 0){
            return 2;
        }
        return 0;
    }
    
    public double Regra8(double Dns){
        if (Dns == 1){
            return 1;
        }
        return 0;
    }
    
    public double Regra9(double Lenta, double Download){
        if (Lenta == 1 && Download == 1){
            return 1;
        }
        if (Lenta == 1 && Download == 0){
            return 2;
        }
        return 0;
    }
    
    public double Regra10(double Problema){
        if (Problema == 0){
            return 1;
        }
        return 0;
    }
    
}
