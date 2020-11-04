package br.com.oauth.teste.demoinsecure.demoinsecure.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Component
public class APIController {

    @RequestMapping(value = "/messages/read", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Map<String, String> read() {
        Map<String, String> resultado = new HashMap<>();
        resultado.put("version", "V2");
        resultado.put("descricao", "oauth0 via Istio");
        resultado.put("audience", "https://api.gestaoclientes.com/");
        resultado.put("message", "Ok essa url é publica não precisa de permissao");
        resultado.put("metodo", "GET");

        return resultado;
    }

    @RequestMapping(value = "/messages/create", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Map<String, String> create(@RequestBody Map<String, String> newMessage) {
        Map<String, String> resultado = new HashMap<>();
        resultado.put("version", "V2");
        resultado.put("descricao", "oauth0 via Istio");
        resultado.put("audience", "https://api.gestaoclientes.com/");
        resultado.put("message", "ok todos clientes com um token valido tem permissao");
        resultado.put("metodo", "POST");
        return resultado;
    }

    @RequestMapping(value = "/messages/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public Map<String, String> update(@RequestBody Map<String, String> newMessage, @PathVariable Long id) {
        Map<String, String> resultado = new HashMap<>();
        resultado.put("version", "V2");
        resultado.put("descricao", "oauth0 via Istio");
        resultado.put("audience", "https://api.gestaoclientes.com/");
        resultado.put("message", "ok para todos os clientes com a permissao update:messages");
        resultado.put("metodo", "PUT");
        return resultado;
    }

    @RequestMapping(value = "/messages/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public Map<String, String> delete(@PathVariable Long id) {
        Map<String, String> resultado = new HashMap<>();
        resultado.put("version", "V2");
        resultado.put("descricao", "oauth0 via Istio");
        resultado.put("audience", "https://api.gestaoclientes.com/");
        resultado.put("message", "ok para todos os clientes com a permissao delete:messages");
        resultado.put("metodo", "DELETE");
        return resultado;
    }

}
