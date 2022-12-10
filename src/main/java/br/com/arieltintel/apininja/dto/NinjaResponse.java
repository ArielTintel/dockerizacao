package br.com.arieltintel.apininja.dto;

import br.com.arieltintel.apininja.entity.Ninja;
import br.com.arieltintel.apininja.enums.Rank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NinjaResponse {

    private String name;
    private Rank rank;
    private String clan;

    public static NinjaResponse to(Ninja ninja){
        return NinjaResponse.builder()
                .name(ninja.getName())
                .rank(ninja.getRank())
                .clan(ninja.getClan())
                .build();
    }

}
