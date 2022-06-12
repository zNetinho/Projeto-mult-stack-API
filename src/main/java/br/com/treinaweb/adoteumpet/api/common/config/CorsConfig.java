package br.com.treinaweb.adoteumpet.api.common.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // adiciona as configurações de aceitação do CORS
        registry.addMapping("/**")
                // quais são as origens ou os dominios que será aceito as requisições
                .allowedOrigins("*")
                // quais são os metodos HTTP que nossa aplicações aceita
                .allowedMethods("*")
                // os cabeçalhos HTTP que autorizamos as requisições
                .allowedHeaders("*");
    }
}
