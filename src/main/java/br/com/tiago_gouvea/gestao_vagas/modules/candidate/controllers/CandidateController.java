package br.com.tiago_gouvea.gestao_vagas.modules.candidate.controllers;

import br.com.tiago_gouvea.gestao_vagas.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidate) {
        System.out.println("Candidato: " + candidate.getEmail());
    }

}
