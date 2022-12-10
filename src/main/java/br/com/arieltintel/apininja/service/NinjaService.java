package br.com.arieltintel.apininja.service;

import br.com.arieltintel.apininja.dto.NinjaRequest;
import br.com.arieltintel.apininja.dto.NinjaResponse;

import java.util.List;

public interface NinjaService {
    NinjaResponse create(NinjaRequest ninjaRequest);

    List<NinjaResponse> findAll();
}
