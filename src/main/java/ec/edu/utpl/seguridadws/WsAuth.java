/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.seguridadws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author jjvillavicencio
 */

@WebService
public interface WsAuth {
    @WebMethod
    public String authTest();
}
