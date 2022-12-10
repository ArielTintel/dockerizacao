package br.com.arieltintel.apininja.dto;

import br.com.arieltintel.apininja.entity.Ninja;
import br.com.arieltintel.apininja.enums.Rank;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class NinjaRequest {

    @NotBlank
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Rank rank;

    @NotBlank
    private String clan;

    public Ninja toEntity(){
        return Ninja.builder()
                .name(this.getName())
                .rank(this.getRank())
                .clan(this.getClan())
                .build();
    }

}
