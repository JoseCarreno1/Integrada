/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS_RESULTADO;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author PC-Jose
 */
@WebService(serviceName = "WS_RETORNAR_RESULTADO")
@Stateless()
public class WS_RETORNAR_RESULTADO {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Calcular_Iva")
    public String Calcular_Iva(@WebParam(name = "valor_producto") double valor_producto, @WebParam(name = "iva_producto") double iva_producto) {
        //TODO write your implementation code here
        double iva;
        double total_prod_con_iva;
        double total_iva_prod;
        String str_resultado;
        
        iva=iva_producto/100;
        total_iva_prod = valor_producto * iva;
        total_prod_con_iva = total_iva_prod + valor_producto; 
        
        str_resultado = "Total Bruto Productos:"+total_prod_con_iva+", Total Neto Productos: "+valor_producto+", Iva: "+total_iva_prod;
        return str_resultado;
    }

}
