package Back_end;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Olá, Alessandra tudo bom com vcccccccccccccccccccccccccc!??????????????????????????????";
    }

    @GetMapping("/nome")
    public String nome(String nome) {
        return "Seja bem-vindo, " + nome + "!";
    }
}
