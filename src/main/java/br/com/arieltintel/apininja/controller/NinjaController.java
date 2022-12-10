package br.com.arieltintel.apininja.controller;

import br.com.arieltintel.apininja.dto.NinjaRequest;
import br.com.arieltintel.apininja.dto.NinjaResponse;
import br.com.arieltintel.apininja.service.NinjaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NinjaResponse create(@Valid @RequestBody NinjaRequest ninjaRequest){
        NinjaResponse ninjaResponse = ninjaService.create(ninjaRequest);
        return ninjaResponse;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<NinjaResponse> findAll(){
        return ninjaService.findAll();
    }
}
