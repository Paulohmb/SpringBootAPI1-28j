package br.senai.meuprojeto.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //avisa o spring que isso é um controller
public class BananaController {

    // responde ao caminho /banana
    @GetMapping("/banana")
    public String getBanana(){
        return "BANANAAAA!";
    }
}
