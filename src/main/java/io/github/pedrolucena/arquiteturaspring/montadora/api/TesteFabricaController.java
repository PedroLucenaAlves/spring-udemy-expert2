package io.github.pedrolucena.arquiteturaspring.montadora.api;

import io.github.pedrolucena.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    //diz ao Spring para ir no conteiner e dar a ele uma instancia do objeto (nosso @Bean)
    @Autowired
    @Qualifier("motorEletrico") //aqui passamos o nome do bean para o spring saber qual esta sendo injetado (serve para beans do mesmo tipo)
    private Motor motor;

    @PostMapping
    public CarroStatusDTO ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }

}
