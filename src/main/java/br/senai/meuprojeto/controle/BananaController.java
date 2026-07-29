package br.senai.meuprojeto.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // avisa o Spring que isso é um controller
@RequestMapping("banana")
public class BananaController {

    @GetMapping("")
    public String getBanana() {
        return "BANANAAAA!";
    }

    @GetMapping("{n}")
    public String getBananaMultiplicada(@PathVariable int n) {
        return "BANANAAAA!".repeat(Math.max(0, n));
    }

    @GetMapping("{dia}/{mes}/{ano}")
    public String getDataBanana(@PathVariable int dia,
                                @PathVariable String mes,
                                @PathVariable int ano) {
        return "Me lembre de comer uma banana em " + dia + " de " + mes + " de " + ano;
    }
}