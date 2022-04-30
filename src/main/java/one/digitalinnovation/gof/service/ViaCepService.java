package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Cliente HTTP, criado via <b>OpenFeign<b>, para consumo da API do <b>ViaCep</b>

@see <a href="https://spring.io/projects.sprng-cloud-openfeign">Spring Cloud OpenFeign</a>
@see <a href="https://viacep.com.br">ViaCEP</a>
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    //@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
