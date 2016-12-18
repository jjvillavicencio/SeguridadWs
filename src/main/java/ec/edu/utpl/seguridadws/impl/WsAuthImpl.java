/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.seguridadws.impl;

import ec.edu.utpl.seguridadws.WsAuth;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService (endpointInterface = "ec.edu.utpl.seguridadws.WsAuth")
public class WsAuthImpl implements WsAuth {

    @Resource
    private WebServiceContext wsc;
    
    @Override
    public String authTest() {
        MessageContext mc = wsc.getMessageContext();
        Map requestHeader = (Map) mc.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) requestHeader.get("Username");
        List passList = (List) requestHeader.get("Password");
        
        String username = "";
        String password = "";
        if ( passList != null && userList != null){
            username = (String) userList.get(0);
            password = (String) passList.get(0);
        }
        
        if("jjvillavicencio".equals(username) && "1234".equals(password)){
            return "Acceso permitido";
        }else{
            return "Acceso restringido";
        }
    }
    
}
