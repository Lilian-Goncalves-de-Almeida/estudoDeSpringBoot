package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;

@RestController
public class Controle{
    @GetMapping("") // get mapping é usada toda vez que quero exbir alguma coisa do site, texto, mensagens, tela do site
    public String mensagem(){
        return "Hello word!";
    }
    /*
    @GetMapping("/bemvinde") // o "" é o caminh odo site sem alteraações no nome, /exemplo vai ir para o http:site/exemplo
    public String boasVindas(){
        return "Bem vinde!";
    } */

    @GetMapping("/boasvindas/{nome}") //vamos fazer isso com variavel agora, adicionando /{nomeDaVariavel}
    public String boasVindasComNome(@PathVariable String nome){// usamos a anottation para dizer /{nome} é uma variavel o que está dentro do {} deve ser o memso nome da variavel recebida
        return "Bem vinde " + nome;
    }

    @GetMapping("/boasvindas") //se colocarmos a url sem um nome, dará erro, então é necessário criar uma versão sem nome
    public String boasVindasSemNome(){// usamos a anottation para dizer /{nome} é uma variavel o que está dentro do {} deve ser o memso nome da variavel recebida
        return "Bem vinde! ";
    }

    //vamos criar a ligação entre a classe de controle e a classe pessoa
    @PostMapping("/pessoa") // o getmapping não tem suporte ao request body então usamos esta notation
    public Pessoa pessoa(@RequestBody Pessoa p){ //vamos usar a chamada request body; o navegador não consegue lidar com orequest body então precisamos de uma extensão o Thunder Client
        return p;
    }
}