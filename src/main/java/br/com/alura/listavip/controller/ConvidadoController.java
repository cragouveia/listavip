package br.com.alura.listavip.controller;

import br.com.alura.listavip.domain.Convidado;
import br.com.alura.listavip.service.ConvidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by carlos on 04/06/2017.
 */
@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoService service;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("listaconvidados")
    public ModelAndView listaConvidados() {
        Iterable<Convidado> convidados = service.findAll();
        ModelAndView model = new ModelAndView("listaconvidados");
        model.addObject("convidados", convidados);

        return model;
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public ModelAndView salvar(Convidado convidado) {
        service.save(convidado);
        return new ModelAndView("redirect:listaconvidados");
    }
}
