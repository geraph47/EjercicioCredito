package com.myspace.proyectogestioncredito.implementacion;

import com.myspace.proyectogestioncredito.interfaz.ICalculoCredito;
import com.myspace.proyectogestioncredito.modelo.bo.DescripcionSoliCred;

public class ServCalculoCredito implements ICalculoCredito {


public int totalEndeudamiento(DescripcionSoliCred credito){
    
    double valor = 0;
    int i = 0;
    
    valor = (0.25*(credito.getSalario()-credito.getGastos())/credito.getTiempoTotalAmort());
    
    i =  (int)valor;
    
    
    return i;
}





}