package br.com.arieltintel.apininja.service.impl;

import br.com.arieltintel.apininja.dto.NinjaRequest;
import br.com.arieltintel.apininja.dto.NinjaResponse;
import br.com.arieltintel.apininja.entity.Ninja;
import br.com.arieltintel.apininja.repository.NinjaRepository;
import br.com.arieltintel.apininja.service.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NinjaServiceImpl implements NinjaService {

    private final NinjaRepository ninjaRepository;

    @Override
    public NinjaResponse create(NinjaRequest ninjaRequest){
        Ninja ninja = ninjaRequest.toEntity();
        ninjaRepository.save(ninja);
        return NinjaResponse.to(ninja);
    }

    @Override
    public List<NinjaResponse> findAll(){
        List<Ninja> ninjaList = ninjaRepository.findAll();
        return ninjaList.stream()
                .map(NinjaResponse::to)
                .collect(Collectors.toList());
    }

}
