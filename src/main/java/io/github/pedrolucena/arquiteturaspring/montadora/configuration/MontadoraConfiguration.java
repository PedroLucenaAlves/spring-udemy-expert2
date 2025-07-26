package io.github.pedrolucena.arquiteturaspring.montadora.configuration;

import io.github.pedrolucena.arquiteturaspring.montadora.Motor;
import io.github.pedrolucena.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //spring reconhece a classe como configuracao com essa annotation
public class MontadoraConfiguration {

    //@Bean é a sua ferramenta para ensinar o Spring a construir e configurar objetos que ele não saberia criar sozinho
    @Bean(name = "motorAspirado") //bean e o metodo que retorna o objeto construido (ensinamos ao Spring como montar um motor)
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor; //motor pronto e configurado para o Spring
    }

    @Bean(name = "motorEletrico") //o nome do metodo fica sendo o nome do Bean (ajuda para diferenciar o tipo do bean instanciado)
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(4);
        motor.setModelo("TH-10");
        motor.setLitragem(1.4);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor; //motor pronto e configurado para o Spring
    }

    @Bean(name="motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor; //motor pronto e configurado para o Spring
    }

}
